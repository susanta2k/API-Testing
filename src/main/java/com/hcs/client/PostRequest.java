package com.hcs.client;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PostRequest {
	
@Test
public void Post1() {
	
	RequestSpecification req = RestAssured.given();
	
	req.header("Content-Type","application/json");
	JSONObject json = new JSONObject();
	json.put("name", "morpheus");
	json.put("job", "leader");
	
	req.body(json.toJSONString());
	
	Response res = req.post("https://reqres.in/api/users");
	int code = res.getStatusCode();
	Assert.assertEquals(code,201);
	
}

}
