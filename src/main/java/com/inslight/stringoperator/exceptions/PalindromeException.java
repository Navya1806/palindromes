package com.inslight.stringoperator.exceptions;

public class PalindromeException extends Exception {
	String msg;
	String details;

	private static final long serialVersionUID = 1L;

	public PalindromeException() {
		super();
	}

	public PalindromeException(String msg) {
		this.msg = msg;
	}

	public PalindromeException(String msg, String details) {
		this.msg = msg;
		this.details = details;
	}
}
