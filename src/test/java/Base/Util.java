package Base;

import static io.restassured.RestAssured.given;
import io.restassured.RestAssured;

public class Util {
	static Excel_Config excel = new Excel_Config(".\\Data.xlsx");

	public static void getType(String value) {
		given().header(excel.getData(3, 0), excel.getData(3, 1))
		.when().get(value)
		.then().log().all().assertThat().statusCode(200);
	}

	public static void baseUrl(String URL) {
		RestAssured.baseURI = URL;
	}

	public static void postType(String body, String value) {
		given().header(excel.getData(3, 0), excel.getData(3, 1)).body(body)
		.when().post(value)
		.then().log().all().assertThat().statusCode(200);
	}
}
