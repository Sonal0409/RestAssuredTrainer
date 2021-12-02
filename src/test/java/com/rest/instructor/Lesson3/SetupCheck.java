package com.rest.instructor.Lesson3;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

public class SetupCheck {
	
	@Test
	public void setup()
	{
		given()
		.when()
		.then();
	}
	

}
