package com.hcs.client;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.hcs.utility.Utility;
import static io.restassured.RestAssured.*;
import io.restassured.response.Response;



public class RestClient {
	
//1. Get Method
@Test	
public void testResponsecode() {
	
	Response resp = get(Utility.url);
	
	int code = resp.getStatusCode();
	System.out.println("Status code is: "+code);
	Assert.assertEquals(code, 200);
}
@Test	
public void testResponse() {
	
	Response resp = get(Utility.url);
	
	String data = resp.asString();
	
	System.out.println("Response data is: "+data);
	
}
	
}
