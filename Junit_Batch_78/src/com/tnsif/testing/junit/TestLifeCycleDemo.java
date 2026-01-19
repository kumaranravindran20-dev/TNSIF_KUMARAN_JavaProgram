package com.tnsif.testing.junit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
public class TestLifeCycleDemo {
	
	@BeforeEach //2nd printed
	void beforeEachTest()
	{
		System.out.println("Before Each Test");
	}
	
	@AfterEach //4th printed
	void afterEachTest()
	{
		System.out.println("After Each Test");
	}
	
	@BeforeAll //1st printed
	void beforeAllTest()
	{
		System.out.println("Before All Test");
	}
	
	@AfterAll //5th printed
	void afterAllTest()
	{
		System.out.println("After All Test");
	}
	
	@Test //3rd printed
	void test()
	{
		System.out.println("Test Passed");
	}
	
	
	@Test //3rd printed
	void test1()
	{
		System.out.println("Test 1 Passed");
	}
	
	
}
