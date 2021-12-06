package restAPiPOST;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.io.File;

import org.json.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class POSTRequestusingJSONdata {
	
	// Send/POST data to the URI using JSON body instad of a file
	
	@Test
	public void postrequest_usingJson()
	{
		JSONObject body = new JSONObject();
		body.put("name", "Tim");
		body.put("salary", "45678");
		body.put("age", "35");
		
		int id = given()
			.baseUri("http://dummy.restapiexample.com/api/v1")
			.contentType(ContentType.JSON)
			.body(body.toString()).
		when()
			.post("/create").
		then()
			.statusCode(200)
			.body("data.name", equalTo("Tim"))
			.extract().path("data.id");
		
		System.out.println(id);
		
		
		
	}


}
