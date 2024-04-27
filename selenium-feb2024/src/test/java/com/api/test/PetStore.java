package com.api.test;

import org.hamcrest.Matchers;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class PetStore {
	
	long id;
	@Test
	public void PostPet() {
		
		System.out.println("Adding a pet to the store");
		RestAssured.baseURI = "https://petstore.swagger.io";
		
		String json = "{"
				+ "  \"id\": 0, "
				+ "  \"category\": { "
				+ "    \"id\": 0, "
				+ "    \"name\": \"Cat2\" "
				+ "  }, "
				+ "  \"name\": \"bulldoggie\", "
				+ "  \"photoUrls\": [ "
				+ "    \"string\" "
				+ "  ], "
				+ "  \"tags\": [ "
				+ "    { "
				+ "      \"id\": 0, "
				+ "      \"name\": \"string\" "
				+ "    } "
				+ "  ], "
				+ "  \"status\": \"available\" "
				+ "}";
		
		Response response = given().header("Content-Type", "application/json").header("accept", "application/json")
		.body(json).when().post("/v2/pet");
		response.then().statusCode(200);// Assert.assertEquals(response.getStatusCode(), 200);
		
		System.out.println(response.getBody().prettyPrint());
		
		Assert.assertEquals(response.getStatusCode(), 200);
		 id= response.path("id");
		
		System.out.println("ID of the pet added is " + id);
		
		response.then().body("status",  Matchers.equalTo("available")).body("category.name",  Matchers.equalTo("Cat2"))
		.and().body("tags[0].name",  Matchers.equalTo("string")).body("name", Matchers.equalTo("bulldoggie"));
			
    	}
	@Test (dependsOnMethods = {"PostPet"} )
public void PutPet() {
		
		System.out.println("Updating a pet to the store");
		RestAssured.baseURI = "https://petstore.swagger.io";
		
		String json = "{"
				+ "  \"id\":"+id+", "
				+ "  \"category\": { "
				+ "    \"id\": 0, "
				+ "    \"name\": \"Cat2\","
				+ "  }, "
				+ "  \"name\": \"bulldoggie\", "
				+ "  \"photoUrls\": [ "
				+ "    \"string\" "
				+ "  ], "
				+ "  \"tags\": [ "
				+ "    { "
				+ "      \"id\": 0, "
				+ "      \"name\": \"string\" "
				+ "    } "
				+ "  ], "
				+ "  \"status\": \"available\" "
				+ "}";
		
		Response response = given().header("Content-Type", "application/json").header("accept", "application/json")
		.body(json).when().put("/v2/pet");
		response.then().statusCode(200);// Assert.assertEquals(response.getStatusCode(), 200);
		
		System.out.println(response.getBody().prettyPrint());
		
	
		
    	}
@Test (dependsOnMethods = {"PostPet","PutPet"} )
public void GetPet() {
	    
        System.out.println("Getting a pet from the store");
        RestAssured.baseURI = "https://petstore.swagger.io";
        
        Response response = given().header("accept", "application/json").when().get("/v2/pet/"+id);
        response.then().statusCode(200);// Assert.assertEquals(response.getStatusCode(), 200);
        
        System.out.println(response.getBody().prettyPrint());
        
        response.then().body("status",  Matchers.equalTo("available")).body("category.name",  Matchers.equalTo("sss"))
    	.and().body("tags[0].name",  Matchers.equalTo("string")).body("name", Matchers.equalTo("bulldoggie"));
        
        
        
        }
@Test	(dependsOnMethods = {"PostPet","PutPet","GetPet"} )
public void DeletePet() {

	System.out.println("Deleting a pet from the store");
	RestAssured.baseURI = "https://petstore.swagger.io";

	Response response = given().header("accept", "application/json").when().delete("/v2/pet/"+id);
	response.then().statusCode(200);// Assert.assertEquals(response.getStatusCode(), 200);

	System.out.println(response.getBody().prettyPrint());

}

@Test

public void GetPetByStatus() {

    System.out.println("Getting a pet from the store by status");
    RestAssured.baseURI = "https://petstore.swagger.io";

    Response response = given().header("accept", "application/json").when().get("/v2/pet/findByStatus?status=available");
    response.then().statusCode(200);// Assert.assertEquals(response.getStatusCode(), 200);

    System.out.println(response.getBody().prettyPrint());

  
}
}
	


