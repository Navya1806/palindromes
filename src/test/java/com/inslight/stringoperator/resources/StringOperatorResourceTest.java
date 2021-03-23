package com.inslight.stringoperator.resources;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

import com.inslight.stringoperator.entities.Palindrome;

@SpringBootTest
public class StringOperatorResourceTest {

	@Autowired
	StringOperatorResource stringOperatorResource;

	@InjectMocks
	StringOperatorResource stringResource;

	@Test
	public void testPositiveResponseCode() throws Exception {
		String value = "abbbbbbbbbbbacdadda";
		ResponseEntity<Palindrome> entity = stringOperatorResource.savePalindrome(value);
		assertEquals(200, entity.getStatusCodeValue());
	}

	@Test
	public void testFetchAllResponseCode() throws Exception {
		ResponseEntity<List<Palindrome>> entity = stringOperatorResource.fetchAllPalindromes();
		assertEquals(200, entity.getStatusCodeValue());
	}

}
