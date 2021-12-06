package restApiGET;

import static io.restassured.RestAssured.given;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.CoreMatchers.equalTo;

import org.testng.annotations.Test;

public class ValidateResponse {
	
	@Test
	public void validateResponseBody() {
		
		given()
			.baseUri("https://api.postman.com")
			.header("x-Api-key","PMAK-61a45a21d78bd6003bdb8b21-eeb7d995daa78cb4767c6cf6828ae6eb66")
		.when()
			.get("/workspaces").
		then()
			.statusCode(200)
			.body("workspaces[0].name", equalTo("Team Workspace"),
					  "workspaces[0].type", equalTo("team"),
				   "workspaces[1].name", equalTo("Phase3-Trainer"),
	                  "workspaces[1].type", equalTo("team"));
               
					
					
	}
	
	// validate body using hamcrest method has Items

	@Test
	public void ValidateBody_hasItems() {
		
		given()
			.baseUri("https://api.postman.com")
			.header("x-Api-key","PMAK-61a45a21d78bd6003bdb8b21-eeb7d995daa78cb4767c6cf6828ae6eb66")
		.when()
			.get("/workspaces").
		then()
			.statusCode(200)
			.body("workspaces.name", hasItems("Team Workspace", "Phase3-Trainer", "My Workspace","Pahse3-Lesson2", "myworkspaceNew"),
				  "workspaces.type", hasItems("team", "team", "personal", "team", "team"));
               
					
					
	}


}
