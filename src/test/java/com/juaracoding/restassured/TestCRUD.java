package com.juaracoding.restassured;

import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class TestCRUD {

	
	@Test
	public void testPut() {
		JSONObject request = new JSONObject();
		request.put("name", "john Connor");
		request.put("job", "Terminator");
		System.out.println(request.toJSONString());

		given().header("Content-Type", "application/json").contentType(ContentType.JSON).accept(ContentType.JSON)
				.body(request.toJSONString()).when().put("https://mern-backend-8881.herokuapp.com/products").then()
				.statusCode(404).log().all();
	}
	
	@Test
	public void testPatch() {
		JSONObject request = new JSONObject();
		request.put("name", "john Connor");
		request.put("job", "Terminator");
		System.out.println(request.toJSONString());

		given().header("Content-Type", "application/json").contentType(ContentType.JSON).accept(ContentType.JSON)
				.body(request.toJSONString()).when().patch("https://mern-backend-8881.herokuapp.com/products").then()
				.statusCode(404).log().all();
	}
	
	@Test
	public void testDelete() {
		when().delete("\"https://mern-backend-8881.herokuapp.com/products\"").then().statusCode(404).log().all();
	}
	

	}


