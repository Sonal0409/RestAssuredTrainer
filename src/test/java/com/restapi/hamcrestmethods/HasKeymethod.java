package com.restapi.hamcrestmethods;

import static io.restassured.RestAssured.given;

import static org.hamcrest.Matchers.hasKey;

import org.testng.annotations.Test;

public class HasKeymethod {
	
	@Test
	public void EveryItemstartswithmethod()
	{
		
		 given()
		.baseUri("https://api.github.com")
		.header("Authorization","Bearer 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")
		.when()
		   .get("/user/repos")
		.then()
		
		.assertThat().statusCode(200)
		.body("owner[0]", hasKey("login"));
		
		// Pls add the static import
		 // hasKey("login") this method checks in the owner[0] ie: first owner value does it have a key
		 //called as login
		 // just check if the variable is available or not
		 // doesnt check its value.
		 
	
		
	}

}
