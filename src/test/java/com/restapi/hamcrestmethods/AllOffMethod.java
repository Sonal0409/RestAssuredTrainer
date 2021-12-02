package com.restapi.hamcrestmethods;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.startsWith;
import static org.hamcrest.Matchers.allOf;

import org.testng.annotations.Test;

public class AllOffMethod {
	
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
		.body("owner[0].login", allOf(startsWith("Sonal"), containsString("0409")));
		
		// Pls add the static import
		 // allOf(startsWith("Sonal"), containsString("0409"))
		 // this method checks in the owner[0].login ie: first owner value does it have 
		 // the following value starting with Sonal and containing 0409
		 // change the value and see the assertion
	
		
	}


}
