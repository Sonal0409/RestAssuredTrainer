package com.rest.instructor.Lesson3;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.hasItems;

import org.testng.annotations.Test;

public class AssertResponse {
	
	@Test
	public void validate_response_body()
	{
		
		given()
		.baseUri("https://api.github.com")
		.header("Authorization","Bearer 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")
		.when()
		   .get("/user/repos")
		.then()
		.log().all()
		.assertThat().statusCode(200)
		.body("owner.login", hasItems("Sonal0409"))
		.body("id", hasItems(419145053));
	}
	
	

}


