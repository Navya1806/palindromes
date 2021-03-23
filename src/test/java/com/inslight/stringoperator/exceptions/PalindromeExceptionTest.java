package com.inslight.stringoperator.exceptions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PalindromeExceptionTest {
	@Test
	public void testWithEmptyArgs() {
		PalindromeException exception = new PalindromeException();
		Assertions.assertNotNull(exception);
	}

	@Test
	public void testWithArg() {
		PalindromeException exception = new PalindromeException("message");
		Assertions.assertNotNull(exception);
	}

	@Test
	public void testWithArgs() {
		PalindromeException exception = new PalindromeException("message", "details");
		Assertions.assertNotNull(exception);
	}
}
