package restApiGET;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class VerifyStatusLine {
	
	
	@Test
	public void ExtractResponseSingle_value() {
		
		

		given()
			.baseUri("https://api.postman.com")
			.header("x-Api-key","PMAK-61a45a21d78bd6003bdb8b21-eeb7d995daa78cb4767c6cf6828ae6eb66")
		.when()
			.get("/workspaces")
			.then()
			.statusCode(200)
			.statusLine("HTTP/1.1 200 OK")	;	
					
	}

}
