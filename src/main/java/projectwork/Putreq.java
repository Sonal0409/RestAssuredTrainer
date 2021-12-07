package projectwork;

import static io.restassured.RestAssured.given;

import org.json.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class Putreq {
	

	@Test
	public void put_request_using_json_object() {
		
		JSONObject body = new JSONObject();
		body.put("aisle", "2068");
		body.put("author", "eclipse3");
		body.put("book_name", "restassured");
		
		given()
			.baseUri("http://dummy.restapiexample.com/api/v1")
			.pathParam("id", "mynew092078")
			.contentType(ContentType.JSON)
			.body(body.toString())
			
		.when()
			.put("/updateBook/{id}").
		then()
			.statusCode(200);
	}

}
