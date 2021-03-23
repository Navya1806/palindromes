package com.inslight.stringoperator.resources;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.inslight.stringoperator.entities.Palindrome;
import com.inslight.stringoperator.exceptions.PalindromeException;
import com.inslight.stringoperator.services.PalindromeService;

@RestController
public class StringOperatorResource {

	private static final Logger LOG = LogManager.getLogger(StringOperatorResource.class.getName());

	@Autowired
	PalindromeService palindromeService;


	
	@GetMapping("/fetchAllPalindromes")
	public ResponseEntity<List<Palindrome>> fetchAllPalindromes() throws PalindromeException {
		try {
			LOG.info("[ FetchAllPalindromes method {} ]");
			return new ResponseEntity<List<Palindrome>>(palindromeService.fetchAllPalindromes(), HttpStatus.OK);
		}catch (Exception e) {
			LOG.debug("[ FetchAllPalindromes Exception {} ]", e.getMessage());
			throw new PalindromeException("Exception", e.getMessage());
		}
		
	}


	@GetMapping("/savePalindrome")
	public ResponseEntity<Palindrome> savePalindrome(@RequestParam String value) throws PalindromeException {
		try {
			LOG.info("[ SavePalindrome method {} ]");
			return new ResponseEntity<Palindrome>(palindromeService.savePalindrome(value), HttpStatus.OK);
		}catch (Exception e) {
			LOG.debug("[ SavePalindrome Exception {} ]", e.getMessage());
			throw new PalindromeException("Exception", e.getMessage());
		}
	}
}
