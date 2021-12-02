package com.rest.logging;

import static io.restassured.RestAssured.config;
import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.config.LogConfig;

public class NoheadersInlog {


	@Test
	public void validate_logging()
	{
		
		 given()
		.baseUri("https://api.github.com")
		.header("Authorization","Bearer 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")
		// print log for all the request and response 
		// just does not print header information as it is sensitive information

		
		.config(config.logConfig(LogConfig.logConfig().blacklistHeader("Authorization")))
		.log().all()
		.when()
		   .get("/user/repos")
		.then()

		//.assertThat().statusCode(200); -- it will be success no response no validation
		
		.assertThat().statusCode(200);
		
	}
}
