package br.com.testeQA;


import org.junit.Assert;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class TesteNomeDaRuaJava {
	
	public static void main(String[] args) {
		Response response = RestAssured.request(Method.GET, "https://api.zippopotam.us/BR/01000-000	");
		response.prettyPrint();
		JsonPath extractor = response.jsonPath();
		String pais = extractor.get("country");
		
		System.out.println(pais);
		
	Assert.assertEquals(pais, "Brazil");
}

}