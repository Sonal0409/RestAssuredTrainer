package com.restapi.hamcrestmethods;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.hasSize;


import org.testng.annotations.Test;

public class HasSizeMethod {
	
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
		.body("name", hasSize(31));
		
		// Pls add the static import
		 // hasSize() method checks the size of list of values returned.
		 // checks if the list has same values as mentioned in the method.
		 
		 
	
		
	}

}
