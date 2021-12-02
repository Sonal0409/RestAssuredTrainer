package restAsuredDemo;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class ExtractResponseInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		RestAssured.baseURI="https://rahulshettyacademy.com";
	String response=	given().log().all().queryParam("key", "qaclick123").header("Content-Type","application/json")
		.body(Payload.AddPlace()).when().post("/maps/api/place/add/json")
		.then().assertThat().statusCode(200).body("scope",equalTo("APP"))
		.header("server", "Apache/2.4.18 (Ubuntu)").extract().response().asString();
	
	System.out.println(response);
	// from response we need to get the place_id variable value from the repsonse string recieved
	
	JsonPath js = new JsonPath(response); // for parsing json response
	
	String placeId= js.getString("place_id");
	
	System.out.println(placeId);
	
	
	
	
	
	
	
	
	
	

	}

}
