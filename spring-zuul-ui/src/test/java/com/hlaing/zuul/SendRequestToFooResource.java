package com.hlaing.zuul;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class SendRequestToFooResource {

	@Test
	public void test() {
		Response response = RestAssured.get("http://localhost:8080/foos/1");
		
		Assert.assertEquals(200, response.getStatusCode());
		Assert.assertEquals("TestSample", response.getHeader("Test"));
	}
	
	
}
