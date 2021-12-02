package com.rest.instructor.Lesson3;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class ExtractValue_fromRESPONSE {
	
	@Test
	public void extract_response()
	{
		
	Response res=	given()
		.baseUri("https://api.github.com")
		.header("Authorization","Bearer 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")
		.when()
		   .get("/user/repos")
		.then()
		
		.assertThat().statusCode(200)
		.extract()
		.response();
	
	// Use the groovy method to fetch value of a field from the response
	/* System.out.println("Print id =" + res.path("goovypath variable"));
	System.out.println("Print id =" + res.path("id")); */
	
	// Fetch a value from response using JsonPath
	
	/*  JsonPath jsonPath = new JsonPath(res.asString());
	
	System.out.println("Print id =" + jsonPath.getList("id"));
	 
	 OR
	
	System.out.println("Print id =" + jsonPath.getString("owner.login")); */
	
	
	
	
	}

}
