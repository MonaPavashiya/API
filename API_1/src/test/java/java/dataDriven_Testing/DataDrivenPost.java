package java.dataDriven_Testing;

import static io.restassured.RestAssured.*;
import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.google.gson.Gson;

public class DataDrivenPost {
	
	
	@DataProvider(name="DataForPost")
	public Object[][] dataForPost()
	{
		/*
		 * Object[][] data = new Object[2][2]; data[0][0] = "Mona"; data[0][1] =
		 * "Pavashiya"; data[1][0] = "Sandeep"; data[1][1] = "Italiya";
		 * 
		 * return data;
		 */
		
		return new Object[][] {
			{"mona","pavashiya"},
			{"sandeep","italiya"}
		};
	}
	
	
	@Test(dataProvider = "DataForPost")
	public void test(String firstname, String lastname)
	{
		Map<String, Object> map = new HashMap<String, Object>();
		
		map.put("FirstName",firstname );
		map.put("LastName", lastname);
		
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
