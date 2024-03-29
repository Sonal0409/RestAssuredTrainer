package hamercrestmethods;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.startsWith;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

public class AllofmethodsHamercrest {
	
	@Test
	public void containsMethod() {
		
		given()
			.baseUri("https://api.postman.com")
			.header("x-Api-key","PMAK-61a45a21d78bd6003bdb8b21-eeb7d995daa78cb4767c6cf6828ae6eb66")
		.when()
			.get("/workspaces").
		then()
			.statusCode(200)
			// matches all the items in the response and in strict order
			// chnage order or remove one item.. method fails
			.body("workspaces.name", contains("Team Workspace", "Phase3-Trainer", "My Workspace", 
					"Pahse3-Lesson2", "myworkspaceNew"));
	}
	
	//@Test
	public void emptyMethod() {
		
		given()
			.baseUri("https://api.postman.com")
			.header("x-Api-key","PMAK-61a45a21d78bd6003bdb8b21-eeb7d995daa78cb4767c6cf6828ae6eb66")
		.when()
			.get("/workspaces").
		then()
			.statusCode(200)
			// matches if the response in workspace.name is empty or not
			// method will fail..as response is not empty
			.body("workspaces.name", empty());
	}

	
	@Test
	public void isNotemptyMethod() {
		
		given()
			.baseUri("https://api.postman.com")
			.header("x-Api-key","PMAK-61a45a21d78bd6003bdb8b21-eeb7d995daa78cb4767c6cf6828ae6eb66")
		.when()
			.get("/workspaces").
		then()
			.statusCode(200)
			// matches if the response in workspace.name is not empty
			// method will pass..as response is not empty
			.body("workspaces.name", is(not(empty())));
	}
	
	@Test
	public void hassizeMethod() {
		
		given()
			.baseUri("https://api.postman.com")
			.header("x-Api-key","PMAK-61a45a21d78bd6003bdb8b21-eeb7d995daa78cb4767c6cf6828ae6eb66")
		.when()
			.get("/workspaces").
		then()
			.statusCode(200)
			// matches if the response in workspace.name with the number of name values
			// method will pass..as response 5 name values
			.body("workspaces.name", hasSize(5));
	}
	
	
	//@Test
	public void everyItemStartsWithMethod() {
		
		given()
			.baseUri("https://api.postman.com")
			.header("x-Api-key","PMAK-61a45a21d78bd6003bdb8b21-eeb7d995daa78cb4767c6cf6828ae6eb66")
		.when()
			.get("/workspaces").
		then()
			.statusCode(200)
			// matches if the response in workspace.name starts with a string
			// method will fail..as response names may not start with same name
			.body("workspaces.name", everyItem(startsWith("Team")));
	}



public void hasKeyMethod() {
	
	given()
		.baseUri("https://api.postman.com")
		.header("x-Api-key","PMAK-61a45a21d78bd6003bdb8b21-eeb7d995daa78cb4767c6cf6828ae6eb66")
	.when()
		.get("/workspaces").
	then()
		.statusCode(200)
		// matches if the response in workspace has a key like id, name or type
		// method will pass..as response does contain key as id
		// you will check this with each workspace array
		.body("workspaces[0]", hasKey("id"));
}
@Test
public void hasvalueMethod() {
	
	given()
		.baseUri("https://api.postman.com")
		.header("x-Api-key","PMAK-61a45a21d78bd6003bdb8b21-eeb7d995daa78cb4767c6cf6828ae6eb66")
	.when()
		.get("/workspaces").
	then()
		.statusCode(200)
		// matches if the response in workspace has a value like name value, idvalue, type value
		// method will pass..as response does contain value for given name, id or type
		// you will check this using workspace array
		.body("workspaces[0]", hasValue("Team Workspace"));
}

@Test
public void hasKeyValueMethod() {
	
	given()
		.baseUri("https://api.postman.com")
		.header("x-Api-key","PMAK-61a45a21d78bd6003bdb8b21-eeb7d995daa78cb4767c6cf6828ae6eb66")
	.when()
		.get("/workspaces").
	then()
		.statusCode(200)
		// matches if the response in workspace has a key and value like name value, idvalue, type value
		// method will pass..as response does contain key and value for given name, id or type
		// you will check this using workspace array
		.body("workspaces[0]", hasEntry("name", "Team Workspace"));
}







// .body("owner[0].login", allOf(startsWith("Sonal"), containsString("0409")));

@Test
public void AnyofMethod() {
	
	given()
		.baseUri("https://api.postman.com")
		.header("x-Api-key","PMAK-61a45a21d78bd6003bdb8b21-eeb7d995daa78cb4767c6cf6828ae6eb66")
	.when()
		.get("/workspaces").
	then()
		.statusCode(200)
		// matches if the response in workspace has a key and value like name value, idvalue, type value
		// method will pass..as response does contain key and value for given name, id or type
		// you will check this using workspace array
		.body("workspaces.name", anyOf(startsWith("Team"), containsString("Workspace")));
}







}
