package com.hcs.client;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG {
	
@BeforeSuite
void bSuites() {
	
	System.out.println("Execute before suite");
}
@BeforeClass
void bClass() {
	
	System.out.println("Execute before class");
}
@BeforeMethod
void bMethod() {
	
	System.out.println("Execute before method");
}
@BeforeTest
void bTest() {
	
	System.out.println("Execute before test");
}
@AfterTest
void aTest() {
	
	System.out.println("Execute after test");
}
@Test
void test() {
	
	System.out.println("Execute test");
}
@Test
void test1() {
	
	System.out.println("Execute test1");
}
@AfterClass
void aClass() {
	
	System.out.println("Execute after class");
}
@Test
void test2() {
	
	System.out.println("Execute test2");
}
@AfterMethod
void aMethod() {
	
	System.out.println("Execute after method");
}
@AfterSuite
void aSuites() {
	
	System.out.println("Execute after suite");
}

}
