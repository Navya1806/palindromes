package com.inslight.stringoperator.serviceimpls;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.inslight.stringoperator.entities.Palindrome;

@SpringBootTest
public class PalindromeServiceImplTest {

	@Autowired
	PalindromeServiceImpl palindromeService;
	
	@Test
	public void testSavePalindrome() throws Exception {
		String value = "abbbbbbbbbbbacdadda";
		Palindrome palindrome =  palindromeService.savePalindrome(value);
		Assertions.assertEquals(palindrome.getPalindromeLongestValue(),"abbbbbbbbbbba" );
	}
	
	@Test
	public void testFetchPalindrome() throws Exception {
		List<Palindrome> palindromes =  palindromeService.fetchAllPalindromes();
		Assertions.assertEquals(palindromes.size(),1);
	}

	@Test
	public void testFindLongestPalindrome() throws Exception {
		Assertions.assertEquals(palindromeService.findLongestPalindrome("abbbbbbbbbbbacdadda"),"abbbbbbbbbbba");
	}

	

}
