package com.restapi.hamcrestmethods;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.both;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.Matchers.empty;

import org.testng.annotations.Test;

public class Hamcrest_EmtyMethod {
	
	
	
	@Test
	public void ContainsStringmethod()
	{
		
		 given()
		.baseUri("https://api.github.com")
		.header("Authorization","Bearer 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")
		.when()
		   .get("/user/repos")
		.then()
		
		.assertThat().statusCode(200)
		.body("name", empty());
		
		// Pls add the static import
		 // empty() is method to check if the list returned for repo name is empty or not.
		 // test will fail as we get list of values
		 
		 
	
		
	}


}
