package projectwork;

import static io.restassured.RestAssured.*;



import org.apache.logging.log4j.core.Logger;
import org.apache.logging.log4j.LogManager;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class GetbyId {
	
	org.apache.logging.log4j.Logger logger = LogManager.getLogger(GetbyId.class);
	
	@Test
	public void logdemo()
	{
		System.out.println("logging");
		logger.info("this is a log message");
		logger.error("This is eror messgae");
		logger.fatal("this is fatal message");
		System.out.println("logging completed");
	}
	
	@Test
	public void getID()
	{
	given()
		  .baseUri("http://localhost:8888")
		  .pathParam("id", "5Nov1")
		  .log().all()
		  .when()
	      .get("/getBooks/{id}")
	    .then()
	    .log().all()
	    .statusCode(200);
	      
	}
	

	@Test
	public void getqueryparam()
	{
	given()
		  .baseUri("http://localhost:8888")
		  .queryParam("authorname", "Mittal1")
		  .log().all()
		  .when()
	      .get("/getBooks/author")
	    .then()
	    .log().all()
	    .statusCode(200);
	      
	}

}
