package com.restapi.hamcrestmethods;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.hasValue;

import org.testng.annotations.Test;

public class HasValueMethod {
	
	
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
		.body("owner[0]", hasValue("Sonal0409"));
		
		// Pls add the static import
		 // hasValue("Sonal0409") this method checks in the owner[0] ie: first owner value does it have a value
		 //called as Sonal0409
		
		 
	
		
	}


}
