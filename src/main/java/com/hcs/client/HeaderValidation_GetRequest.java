package com.hcs.client;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class HeaderValidation_GetRequest {
	
	@Test
	public void getWhetherDetails() {
		
	//Specify base URL
		RestAssured.baseURI = "https://chercher.tech/sample/api/product";
		
	//Create Request Object
		RequestSpecification httpRequest = RestAssured.given();
		
	//Create Response object
		Response response = httpRequest.request(Method.GET,"/read");

	//Print response in console
		String responseBody = response.getBody().toString();
		System.out.println("Response body is:" +responseBody);
		
	//Validating header from response
		String contentType = response.header("Content-Type");
		Assert.assertEquals(contentType, "application/json; charset=UTF-8");
		
	//Validating status code
		
		int statuscode = response.statusCode();
		Assert.assertEquals(statuscode, 200);
		
	//Printing all headers
		Headers allheaders = response.headers();
		
		for (Header header:allheaders) {
			System.out.println(header.getName()+" --> "+header.getValue());
			
	//Validating response body
		Assert.assertEquals(responseBody.contains("io.restassured.internal.RestAssuredResponseImpl@306851c7"), true);
			
		}
		
		
		
	}

}
