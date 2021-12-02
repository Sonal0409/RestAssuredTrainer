package com.restapi.hamcrestmethods;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.hasEntry;

import org.testng.annotations.Test;

public class HasEntrymethod {
	

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
		.body("owner[0]", hasEntry("login","Sonal0409"));
		
		// Pls add the static import
		 // hasEntry("login","Sonal0409") this method checks in the owner[0] ie: first owner value does it have 
		 // the following key and value in it.
		 // check the value and see the assertion
	
		
	}

}
