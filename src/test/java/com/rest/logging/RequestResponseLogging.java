package com.rest.logging;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class RequestResponseLogging {
	
	@Test
	public void validate_logging()
	{
		
		 given()
		.baseUri("https://api.github.com")
		.header("Authorization","Bearer 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")
		// print log for all the request
		.log().all()
		.when()
		   .get("/user/repos")
		.then()
		// print log for all response
		.log().all()
		.assertThat().statusCode(200);
		
	}

}
