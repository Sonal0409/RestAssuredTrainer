package restAPIdelete;


import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;
public class DeleteRequest {

	
	@Test
	public void delete_request() {
				
		String msg = given()
			.baseUri("http://dummy.restapiexample.com/api/v1")
			.contentType(ContentType.JSON).
		when()
			.delete("/delete/24").
		then()
			.statusCode(200)
			.extract().path("message");
		
		System.out.println(msg);
	}
}
