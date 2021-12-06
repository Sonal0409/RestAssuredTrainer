package restApiGET;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;


public class GetRequest {
	
	@Test
	public void simple_get_request() {
		
		given()
			.baseUri("https://api.postman.com")
			.header("x-Api-key","PMAK-61a45a21d78bd6003bdb8b21-eeb7d995daa78cb4767c6cf6828ae6eb66")
		.when()
			.get("/workspaces").
		then().
			//.statusCode(200);
		// OR
		assertThat().statusCode(200);
	}

}
