package br.com.testeQA;

import org.junit.Assert;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class TesteNomeDaRuaGet {
	@Test
	public void testNomeDaRuaMetodoGet() {
		Response response = RestAssured.request(Method.GET, "https://api.zippopotam.us/BR/01000-000");
		JsonPath extractor = response.jsonPath();
		
		//Extraindo o valor para uma variavel para depois validar
		String rua = extractor.get("places[0].'place name'");
		Assert.assertEquals(rua, "São Paulo");
	
		//Validando diretamente com o path
		JsonPath jPath = new JsonPath(response.asString());
		Assert.assertEquals(jPath.getString("places[0].'place name'"), "São Paulo");

		
	}
}
