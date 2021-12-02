package com.rest.instructor.Lesson3;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;



public class Assert_Extracted_Response_HAMCREST {
	
	
	// extract the response and save it as a String
	@Test
	public void extract_response()
	{
		
	ArrayList<String> ownervalue =	given()
		.baseUri("https://api.github.com")
		.header("Authorization","Bearer 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")
		.when()
		   .get("/user/repos")
		.then()
		
		.assertThat().statusCode(200)
		.extract()
		.response().path("owner.login");
	  
	   System.out.println("Owner value is:" + ownervalue);
	
	// Add assertion using Hamcrest
	   // create static import
	 
	   assertThat(ownervalue, hasItem("Sonal0409"));
	   
	  // assertEquals(ownervalue, "Sonal0409");
	   


	
	
	
	
	
	
	
	}

	

}
