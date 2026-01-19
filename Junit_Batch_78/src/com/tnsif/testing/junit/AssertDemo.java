package com.tnsif.testing.junit;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AssertDemo {

	
	@Test
	public void testForAssertEquals()
	{
		int expResult = 1;
		int actResult = 1;
		
		assertEquals(expResult, actResult);
	}
	
	
	@Test
	public void testForAssertTrue()
	{
		assertTrue("Hello".contains("i"));

	}
	
	
	
	@Test
	public void testForAssertFalse()
	{
		assertFalse("Hello".contains("o"));

	}
	
	@Test
	public void testForNull()
	{
		String s = null;
		assertNull(s);
	}
	
	@Test
	public void testFail()
	{
		fail("It is supposed to fail");
	}
	
}
