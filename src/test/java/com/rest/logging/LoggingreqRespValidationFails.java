package com.rest.logging;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.config.LogConfig;

import static io.restassured.RestAssured.*;



public class LoggingreqRespValidationFails {
	
	@Test
	public void validate_logging()
	{
		
		 given()
		.baseUri("https://api.github.com")
		.header("Authorization","Bearer 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")
		// print log for all the request and response even if the response has a failure validation
// only one place to give log.. no need to give log method at bottom
		
		.config(config.logConfig(LogConfig.logConfig().enableLoggingOfRequestAndResponseIfValidationFails()))
		
		.when()
		   .get("/user/repos")
		.then()

		//.assertThat().statusCode(210); -- it will be success no response no validation
		
		// change status code for response to fail as validation 
		.assertThat().statusCode(210);
		
	}


}
