package restApiGET;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class ExtractSingleValueResponse2 {
	
	@Test
	public void ExtractResponseSingle_value() {
		
		
	String name=	
		given()
			.baseUri("https://api.postman.com")
			.header("x-Api-key","PMAK-61a45a21d78bd6003bdb8b21-eeb7d995daa78cb4767c6cf6828ae6eb66")
		.when()
			.get("/workspaces")
			.then()
			.extract().path("workspaces[0].name"); // extract and save it as a string
             System.out.println(name)	;		
					
	}
	
	@Test
	public void ExtractResponseJsonPathObject() {
		
		
	Response res=	
		given()
			.baseUri("https://api.postman.com")
			.header("x-Api-key","PMAK-61a45a21d78bd6003bdb8b21-eeb7d995daa78cb4767c6cf6828ae6eb66")
		.when()
			.get("/workspaces")
			.then()
			.extract().response();
	// from response fetch only 1 value and print it using jspnPath object
			JsonPath json = new JsonPath(res.asString());
	System.out.println(json.getString("workspaces[0].name"));
					
					
	}

	
	
	@Test
	public void ExtractResponseJsonPathmethods() {
		
		// in this case save response as string
		
	String res=	
		given()
			.baseUri("https://api.postman.com")
			.header("x-Api-key","PMAK-61a45a21d78bd6003bdb8b21-eeb7d995daa78cb4767c6cf6828ae6eb66")
		.when()
			.get("/workspaces")
			.then()
			.extract().response().asString();
	// from response fetch only 1 value and print it
			
	System.out.println(JsonPath.from(res).getString("workspaces[0].name"));
					
					
	}
}
