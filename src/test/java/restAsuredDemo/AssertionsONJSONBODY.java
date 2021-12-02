package restAsuredDemo;

import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;

//add this package manually

import static org.hamcrest.Matchers.*;

public class AssertionsONJSONBODY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		RestAssured.baseURI="https://rahulshettyacademy.com";
	given().log().all().queryParam("key", "qaclick123").header("Content-Type","application/json")
		.body(Payload.AddPlace()).when().post("/maps/api/place/add/json")
		.then().log().all().assertThat().statusCode(200).body("scope",equalTo("APP"))
		.header("server", "Apache/2.4.18 (Ubuntu)");
	
	
	}

}
