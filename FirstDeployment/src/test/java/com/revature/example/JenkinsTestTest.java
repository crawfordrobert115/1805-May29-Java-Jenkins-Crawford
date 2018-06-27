package com.revature.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JenkinsTestTest {
	
	JenkinsTest sample = new JenkinsTest();
	
	@Test
	public void testAnEmptyString() {
		assertEquals("Should return true", true, sample.testJenkins());
	}
}
