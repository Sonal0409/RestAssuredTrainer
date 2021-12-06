package restApiGET;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class ExtractResponseData1 {
	
	@Test
	public void ExtractResponse() {
		
		Response res=
		
		given()
			.baseUri("https://api.postman.com")
			.header("x-Api-key","PMAK-61a45a21d78bd6003bdb8b21-eeb7d995daa78cb4767c6cf6828ae6eb66")
		.when()
			.get("/workspaces")
			.then()
			.extract().response();
		
     //Step 2: just print the extracted response  
		System.out.println(res.asString());
					
					
	}

}
