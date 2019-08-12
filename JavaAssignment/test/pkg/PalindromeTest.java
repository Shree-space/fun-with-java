package test.pkg;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import assignment5.PalindromeChecker;

class PalindromeTest {
	
	static PalindromeChecker obj;

/*	@BeforeEach
	public void setup() {
		
		
	}*/
	
	@Test
	void testWithaPalindrome1() {
		obj = new PalindromeChecker("radar");
		boolean result = obj.isPalindrome();
		assertEquals(true, result);
	}
	
	@Test
	void testWithaPalindrome2() {
		obj = new PalindromeChecker("May Yam");
		boolean result = obj.isPalindrome();
		assertEquals(true, result);
	}
	
	@Test
	void testWithNonPalindrome1() {
		obj = new PalindromeChecker("blahblah");
		boolean result = obj.isPalindrome();
		assertEquals(false, result);
	}
	
	
	@Test
	void testWithNonPalindrome2() {
		obj = new PalindromeChecker("Rotater");
		boolean result = obj.isPalindrome();
		assertEquals(false, result);
	}

}
