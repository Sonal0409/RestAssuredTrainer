package restApiParameters;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class Requestparamters1 {
	
	@Test
	public void Request_Query_prameters()
	{
		// api.openweathermap.org
		
		given()
		.baseUri("https://postman-echo.com")
		.param("var","hello")
		.when()
		.get("/get")
	    .then()
		.log().all()
		.statusCode(200);
	}

}
