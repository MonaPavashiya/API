package java.testingMethods;

import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import io.restassured.RestAssured;
import io.restassured.response.Response;

import static org.hamcrest.Matchers.equalTo;

import org.hamcrest.Matchers;

public class Test_1_GET {

	@Test
	void test1()
	{
		Response response = RestAssured.get("https://reqres.in/api/users?page=2");
		
		System.out.println("StatusCode : " + response.getStatusCode());
		System.out.println("Body : " + response.getBody().asString());
		System.out.println("asString : " + response.asString());
		System.out.println("StatusLine : " +response.getStatusLine());
		System.out.println("Header : " + response.getHeader("content-type"));
		System.out.println("Time : " + response.getTime());
		
		int statusCode = response.getStatusCode();
		Assert.assertEquals(statusCode, 200);
		
	}
	
	@Test
	void test2() 
	{
		given()
		       .get("https://reqres.in/api/users?page=2")
		.then()
		   .statusCode(200).
		   body("data.id[0]", equalTo(7));
	}

}












