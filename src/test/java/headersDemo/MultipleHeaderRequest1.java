package headersDemo;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class MultipleHeaderRequest1 {
	
	@Test(priority='1')
	public void multiple_header_test1()
	{
		
		 given()
		.baseUri("https://5cbf5ae7-bc08-40d1-b066-124a329644e2.mock.pstmn.io")
		.header("header","value1")
		.header("x-mock-match-request-headers","header")
		.when()
		   .get("/get")
		.then()
		.log().all()
		.assertThat().statusCode(200);
		
	}
	
	
	
	@Test(priority='2')
	public void multiple_header_test2()
	{
		
		 given()
		.baseUri("https://5cbf5ae7-bc08-40d1-b066-124a329644e2.mock.pstmn.io")
		.header("header","value2")
		.header("x-mock-match-request-headers","header")
		.when()
		   .get("/get")
		.then()
		.log().all()
		.assertThat().statusCode(200);
		
	}


}
