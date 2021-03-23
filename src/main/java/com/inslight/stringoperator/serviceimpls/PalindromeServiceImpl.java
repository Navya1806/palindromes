package com.inslight.stringoperator.serviceimpls;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inslight.stringoperator.entities.Palindrome;
import com.inslight.stringoperator.repos.PalindromeRepo;
import com.inslight.stringoperator.services.PalindromeService;

@Service
public class PalindromeServiceImpl implements PalindromeService {

	@Autowired
	PalindromeRepo palindromeRepo;

	@Override
	public List<Palindrome> fetchAllPalindromes() {
		return (List<Palindrome>) palindromeRepo.findAll();
	}

	@Override
	public Palindrome savePalindrome(String value) {
		Palindrome palindrome = new Palindrome();
		palindrome.setPalindromeLongestValue(findLongestPalindrome(value));
		palindrome.setPalindromeValue(value);
		return palindromeRepo.save(palindrome);
	}

	public String findLongestPalindrome(String value) {
		if (value == null || value.length() < 1)
			return "";
		int start = 0, end = 0;
		for (int i = 0; i < value.length(); i++) {
			int length1 = initiateLength(value, i, i);
			int length2 = initiateLength(value, i, i + 1);
			int len = Math.max(length1, length2);
			if (len > end - start) {
				start = i - (len - 1) / 2;
				end = i + len / 2;
			}
		}
		return value.substring(start, end + 1);
	}

	private static int initiateLength(String s, int l, int r) {
		int L = l, R = r;
		while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
			L--;
			R++;
		}
		return R - L - 1;
	}


}
