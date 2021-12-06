package restAPiPOST;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.io.File;

public class POSTRequestusinfFile {
	
	@Test
	public void postrequest()
	{
		
		File file = new File("resources/data.json");
		int id =		given()
		.baseUri("http://dummy.restapiexample.com/api/v1")
		.contentType(ContentType.JSON)
		.body(file)
		.when()
		.post("/create")
		.then()
		.statusCode(200)
		
		//create a new file for sending payload or data
		
	//	Now validate if the employee is created or not
		.body("data.name", equalTo("John123"))
		.extract().path("data.id"); // fetch id from response and save this id int above
		
		System.out.println(id);
		
		
		
	}

}
