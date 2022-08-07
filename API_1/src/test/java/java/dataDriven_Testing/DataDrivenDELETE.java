package java.dataDriven_Testing;

import static io.restassured.RestAssured.given;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenDELETE {
	
	
	@DataProvider(name="DataForDelete")
	public Object[] dataForDelete()
	{
		return new Object[] {
			5,6
		};
			
	}
	
	@Test(dataProvider = "DataForDelete")
	public void test(int userid) {
	
	
		given().
		     delete("https://reqres.in/api/users" + userid).
		then().
		     statusCode(204).
		     log().all();

	}
}
