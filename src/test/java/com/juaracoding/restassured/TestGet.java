package com.juaracoding.restassured;

import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.matcher.ResponseAwareMatcher;
import io.restassured.response.Response;

public class TestGet {
String endpoint = "https://mern-backend-8881.herokuapp.com/products";
	
	@Test
	public void testStatusCode() {
		Response response = RestAssured.get(endpoint);
		System.out.println(response.getBody().asString());
		System.out.println(response.getStatusCode());
		System.out.println(response.getStatusLine());
		System.out.println(response.getHeader("content-type"));
		System.out.println(response.getTime());
		
		int actual = response.getStatusCode();
		System.out.println(actual);
		assertEquals(actual,200);
	}
	
	@Test
	public void testId() {
		given()
		.get(endpoint)
		.then()
		.statusCode(200)
		.body("_id[0]", equalsTo("62b3f69f66f12cc8cf17fcef"));
	}

	private ResponseAwareMatcher<Response> equalsTo(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
