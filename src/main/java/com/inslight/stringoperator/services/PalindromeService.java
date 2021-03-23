package com.inslight.stringoperator.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.inslight.stringoperator.entities.Palindrome;

public interface PalindromeService {



	public Palindrome savePalindrome(String value);


	List<Palindrome> fetchAllPalindromes();

}
