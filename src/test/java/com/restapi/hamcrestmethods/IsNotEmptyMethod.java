package com.restapi.hamcrestmethods;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNot.*;

import org.testng.annotations.Test;

public class IsNotEmptyMethod {

	
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
		.body("name", is(not(empty())));
		
		// Pls add the static import
		 // is(not(empty())) is method to check if the list returned for repo name is empty or not.
		 // test will pass as we get list of values
		 
		 
	
		
	}
}
