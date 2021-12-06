package restlogging;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class Log_if_Error {
	
	@Test
	public void log_if_error() {
		
		given()
		.baseUri("https://api.postman.com")
		.header("x-Api-key","PMAK-61a45a21d78bd6003bdb8b21-eeb7d995daa78cb4767c6cf6828ae6eb66")
	.when()
		.get("/workspaces3455")
		.then()
		//.log().ifError(); // log only on failure...chage the url or resource
		.log().ifStatusCodeIsEqualTo(400); // log only if status code is 400
			
			
	}

}
