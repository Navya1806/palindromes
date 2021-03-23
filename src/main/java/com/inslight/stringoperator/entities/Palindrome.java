package com.inslight.stringoperator.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "palindromes")
public class Palindrome {

	@Id
	String palindromeValue;

	String palindromeLongestValue;


	public String getPalindromeValue() {
		return palindromeValue;
	}

	public void setPalindromeValue(String palindromeValue) {
		this.palindromeValue = palindromeValue;
	}

	public String getPalindromeLongestValue() {
		return palindromeLongestValue;
	}

	public void setPalindromeLongestValue(String palindromeLongestValue) {
		this.palindromeLongestValue = palindromeLongestValue;
	}

}
