package com.tnsif.testing.junit;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class DisabledDemo {

	@Test
	void test1() {
		System.out.println("Test 1 Passed");
	}
	
	
	@Disabled
	@Test
	void test2() {
		System.out.println("Test 2 Passed");
	}
	
	@Test
	void test3() {
		System.out.println("Test 3 Passed");
	}
	
	
}
