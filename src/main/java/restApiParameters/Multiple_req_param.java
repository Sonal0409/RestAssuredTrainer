package restApiParameters;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class Multiple_req_param {
	

	@Test
	public void Multiple_Request_Query_prameters()
	{
		// api.openweathermap.org
		
		given()
		.baseUri("https://api.openweathermap.org")
		.queryParam("appid", "8d986ab6418d17bd3557ce75dfd08a54")
		.queryParam("q","london")
		.when()
		.get("/data/2.5/weather")
	    .then()
		.log().all()
		.statusCode(200);
	}

}
