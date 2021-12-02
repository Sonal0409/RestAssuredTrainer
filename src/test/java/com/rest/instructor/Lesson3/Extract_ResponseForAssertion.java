package com.rest.instructor.Lesson3;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.hasItems;

import org.testng.annotations.Test;

import io.restassured.response.Response;



public class Extract_ResponseForAssertion {

	// this scenario wil extarct the response and then do assertion on the response using Hamcrest, testng
	// method used for extraction is extrac.response() . it resturns value like headers, cookies and body
	// create an object to store the response, use class Response from rest assured.
	
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
	
	// print the response : use method asString to convert response to string and print it.
	             System.out.println("response =" + res.asString());
	
	}
	
}
