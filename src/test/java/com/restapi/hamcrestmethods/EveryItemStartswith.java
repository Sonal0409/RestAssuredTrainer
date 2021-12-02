package com.restapi.hamcrestmethods;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.startsWith;
import static org.hamcrest.Matchers.everyItem;

import org.testng.annotations.Test;

public class EveryItemStartswith {
	
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
		.body("name", everyItem(startsWith("16Sep")));
		
		// Pls add the static import
		 // everyItem(startsWith("16Sep")) is method to check 
		 //if the list returned names of repo that all start with 16Sep.
		 // test will fail as some repo start and some dontnot start with 16Sep
	//Expected: every item is a string starting with "16Sep"	 
		 
	
		
	}

}
