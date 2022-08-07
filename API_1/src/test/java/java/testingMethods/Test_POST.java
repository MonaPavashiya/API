package java.testingMethods;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

import com.google.gson.Gson;
import static io.restassured.RestAssured.*;

public class Test_POST {
	
	
	@Test
	public void test1()
	{
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
		     post("https://reqres.in/api/users").
		then().
		     log().all().
		     statusCode(201);
	}

}
