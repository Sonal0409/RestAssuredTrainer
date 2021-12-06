package requestSpecification;

import static io.restassured.RestAssured.*;
import static org.hamcrest.CoreMatchers.equalTo;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.specification.RequestSpecification;

public class ReqSpecificationDemo {
	
	RequestSpecification requestspecification;
	@BeforeClass
	public void reqspec()
	{
	
		//requestspecification = given()
		
		requestspecification = with()  // wither give with or given() both are same... non BDD style give with
			
				.baseUri("https://api.postman.com")
				.header("x-Api-key","PMAK-61a45a21d78bd6003bdb8b21-eeb7d995daa78cb4767c6cf6828ae6eb66");
	}

	@Test
	public void ValidateStatusCode() {
			
		given(requestspecification)
	// OR	given().spec(requestspecification)
		.when()
			.get("/workspaces").
		then()
			.statusCode(200);
	}
	

	@Test
	public void ValidateStatusBody() {
			
		given(requestspecification)
	// OR	given().spec(requestspecification)
		.when()
			.get("/workspaces").
		then()
		.body("workspaces[0].name", equalTo("Team Workspace"),
				  "workspaces[0].type", equalTo("team"),
			   "workspaces[1].name", equalTo("Phase3-Trainer"),
                "workspaces[1].type", equalTo("team"));
	}
	

}
