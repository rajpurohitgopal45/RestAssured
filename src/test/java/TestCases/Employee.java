package TestCases;

import static io.restassured.RestAssured.given;
import org.testng.annotations.Test;
import io.restassured.RestAssured;

public class Employee {

	@Test
	public void emp2()  {
		RestAssured.baseURI = "http://dummy.restapiexample.com";

		try {
		given().header("Content-Type", "application/json")
		.when().get("api/v1/employees/1")
		.then().assertThat().statusCode(200);
	
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}