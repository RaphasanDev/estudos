package br.com.testeQA;

import static io.restassured.RestAssured.given;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import io.restassured.RestAssured;

public class TestNomeDaRuaAssert {
	@Before
	public void setUp() {
		RestAssured.baseURI = "http://api.zippopotam.us";
		RestAssured.port = 80;
	}
	@Test
	public void testNomeDaRuaAssert() {
		String estado = 
		given()
			.log().all()
		.when()
			.get("/br/01000-000")
		.then()
			.statusCode(200)
			.extract().path("places[0].'place name'")
			;
		Assert.assertEquals("São Paulo", estado);
		System.out.println(estado);
	}
}