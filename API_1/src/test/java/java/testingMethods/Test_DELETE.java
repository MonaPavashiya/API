package java.testingMethods;

import static io.restassured.RestAssured.given;
import org.testng.annotations.Test;

public class Test_DELETE {
	@Test
	public void test() {
	
	
		given().
		     delete("https://reqres.in/api/users/2").
		then().
		     statusCode(204).
		     log().all();

	}
}
