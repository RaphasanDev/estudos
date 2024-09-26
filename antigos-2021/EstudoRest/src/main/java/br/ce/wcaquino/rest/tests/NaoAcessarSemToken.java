package br.ce.wcaquino.rest.tests;

import static io.restassured.RestAssured.given;

import java.util.HashMap;
import java.util.Map;
import static org.hamcrest.Matchers.*;
import org.junit.Before;
import org.junit.Test;

import br.ce.wcaquino.rest.core.BaseTest;

public class NaoAcessarSemToken extends BaseTest {
	private String TOKEN;
	
	@Before
	public void login() {
		Map<String, String> login = new HashMap<>();
		login.put("email", "raphaelsan.musico@gmail.com");
		login.put("senha", "dev123");
		
		TOKEN = given()
			.body(login)
		.when()
			.post("/signin")
		.then()
			.statusCode(200)
			.extract().path("token");
	}
	
	@Test
	public void naoDeveAcessarAPISemToken() {
		given()
		.when()
			.get("/contas")
		.then()
			.statusCode(401);
	}
	@Test
	public void deveIncluirContaComSucesso() {
		given()
			.header("Authorization", "JWT " + TOKEN)
			.body("{ \"nome\": \"primeira conta\" }")
		.when()
			.post("/contas")
		.then()
			.statusCode(201)
		;
	}
	
	@Test
	public void deveAlterarContaComSucesso() {
		given()
			.header("Authorization", "JWT " + TOKEN)
			.body("{ \"nome\": \"conta alterada\" }")
		.when()
			.put("/contas/716899")
		.then()
		.log().all()
			.statusCode(200)
			.body("nome", is("conta alterada"))
		;
	}
	@Test
	public void naoDeveInserirContaMesmoNome() {
		given()
			.header("Authorization", "JWT " + TOKEN)
			.body("{ \"nome\": \"conta alterada\" }")
		.when()
			.post("/contas")
		.then()
			.statusCode(400)
			.body("error", is("Já existe uma conta com esse nome!"))
		;
	}
	@Test
	public void deveInserirMovimentacaoSucesso() {
		Movimentacao mov = new Movimentacao();
		
		given()
			.header("Authorization", "JWT " + TOKEN)
			.body("")
		.when()
			.post("/transacoes")
		.then()
			.statusCode(200)
			.body("error", is("Já existe uma conta com esse nome!"))
		;
	}

}
