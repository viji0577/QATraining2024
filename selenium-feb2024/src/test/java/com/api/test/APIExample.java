package com.api.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;


public class APIExample {
	
	@Test
	public void testGEtAPI() {
		System.out.println("API test");
		
		RestAssured.baseURI = "https://reqres.in";
		Response response = given().
				when().get("/api/users?page=2");
		response.then().statusCode(200); // Assert.assertEquals(response.getStatusCode(), 200);
		System.out.println(response.getBody().prettyPrint());
		Assert.assertEquals(response.getStatusCode(), 201);
	}
	
	@Test
	public void testPOSTAPI() {
		
		RestAssured.baseURI = "https://reqres.in";
        Response response = given().header("Content-Type", "application/json")
        		.body("{\r\n" + 
                "    \"name\": \"morpheus\",\r\n" + 
                "    \"job\": \"leader\"\r\n" + 
                "}")
        .when().post("/api/users");
        response.then().statusCode(201);
        System.out.println(response.getBody().prettyPrint());
    }
	
	

	@Test
	public void testPUTAPI() {

		RestAssured.baseURI = "https://reqres.in";
		Response response = given().header("Content-Type", "application/json")
				.body("{\r\n" + "    \"name\": \"morpheus\",\r\n" + "    \"job\": \"zion resident\"\r\n" + "}")
				.when().put("/api/users/2");
		response.then().statusCode(200);
		System.out.println(response.getBody().prettyPrint());
	}
	@Test
	public void testDELETEAPI() {
		RestAssured.baseURI = "https://reqres.in";
		Response response = given().header("Content-Type", "application/json").when().delete("/api/users/2");
		response.then().statusCode(204);
		System.out.println(response.getBody().prettyPrint());
		Assert.assertEquals(response.getStatusCode(), 204);
	}
		
	}


//given() is prerequisite to the request
//when() is the request	
//then() is the response