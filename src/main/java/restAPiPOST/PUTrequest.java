package restAPiPOST;

import org.json.JSONObject;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class PUTrequest {
	
	@Test
	public void put_request_using_json_object() {
		
		JSONObject body = new JSONObject();
		body.put("name", "Sam");
		body.put("salary", "1000");
		body.put("age", "24");
		
		given()
			.baseUri("http://dummy.restapiexample.com/api/v1")
			.contentType(ContentType.JSON)
			.body(body.toString()).
		when()
			.put("/update/24").
		then()
			.statusCode(200);
	}

}
