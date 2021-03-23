package com.inslight.stringoperator.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inslight.stringoperator.entities.Palindrome;

public interface PalindromeRepo extends JpaRepository<Palindrome, Long>{

}
