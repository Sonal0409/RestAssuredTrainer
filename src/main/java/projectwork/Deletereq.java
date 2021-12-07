package projectwork;

import static io.restassured.RestAssured.given;

import org.json.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class Deletereq {
	
	@Test
	public void deletereq() {
		
		JSONObject body = new JSONObject();
		body.put("id", "mynew082078");
	
		given()
			.baseUri("http://localhost:8888")
			.contentType(ContentType.JSON)
			.body(body.toString())
			
		.when()
			.delete("/deleteBook").
		then()
			.statusCode(201);
	}

}
