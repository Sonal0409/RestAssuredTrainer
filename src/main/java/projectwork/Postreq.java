package projectwork;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class Postreq {
	
	@Test
	public void postrequest()
	{
		
		File file = new File("resources/data1.json");
	given()
		.baseUri("http://localhost:8888")
		.contentType(ContentType.JSON)
		.body(file)
		.when()
		.post("/addBook")
		.then()
		.statusCode(201);
	
		
	}

}
