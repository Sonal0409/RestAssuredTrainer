package restlogging;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class Log_cookies_headers {
	
	@Test
	public void log__cookies_headers() {
		
		given()
		.baseUri("https://api.postman.com")
		.header("x-Api-key","PMAK-61a45a21d78bd6003bdb8b21-eeb7d995daa78cb4767c6cf6828ae6eb66")
	.when()
		.get("/workspaces")
		.then()
		//.log().status();
		.log().cookies();
			
			
	}

}
