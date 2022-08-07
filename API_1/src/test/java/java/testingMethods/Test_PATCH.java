package java.testingMethods;

import static io.restassured.RestAssured.given;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

import com.google.gson.Gson;
public class Test_PATCH {
	
	@Test
	public void test() {
	Map<String, Object> map = new HashMap<String, Object>();
	
	map.put("name", "Mona");
	map.put("job", "Tester");
	System.out.println(map);
	
    Gson gson = new Gson();
	String requestData = gson.toJson(map);
	System.out.println(requestData);
	
	
	given().
	     header("Content-Type", "application/json").
	     body(requestData).
	     patch("https://reqres.in/api/users/2").
	then().
	     statusCode(200).
	     log().all();

}
}