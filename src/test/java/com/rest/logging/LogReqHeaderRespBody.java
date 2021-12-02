package com.rest.logging;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class LogReqHeaderRespBody {
	
	@Test
	public void validate_logging()
	{
		
		 given()
		.baseUri("https://api.github.com")
		.header("Authorization","Bearer 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")
		// print log for all the headers,parameters in request
		.log().parameters()
		.log().headers()
		.when()
		   .get("/user/repos")
		.then()
		// print body in the log
		.log().body()
		.assertThat().statusCode(200);
		
	}


}
