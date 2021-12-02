package com.rest.logging;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class LoggingOnlyonErrors {

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
		// print log only on error in response
		// to test this change the value of bearer key..just for testing..requets is fail and response will be printed
		.log().ifError()
		.assertThat().statusCode(200);
		
	}

}
