package test.pkg;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import assignment5.PalindromeChecker;

class PalindromeTest {
	
	static PalindromeChecker obj;

	@BeforeEach
	public void setup() {
		obj = new PalindromeChecker();
		
	}
	
	@Test
	void testWithaPalindrome1() {
		boolean result = obj.checkPalindrome("radar");
		assertEquals(true, result);
	}
	
	@Test
	void testWithaPalindrome2() {
		boolean result = obj.checkPalindrome("May Yam");
		assertEquals(true, result);
	}
	
	@Test
	void testWithNonPalindrome1() {
		boolean result = obj.checkPalindrome("blahblah");
		assertEquals(false, result);
	}
	
	
	@Test
	void testWithNonPalindrome2() {
		boolean result = obj.checkPalindrome("Rotater");
		assertEquals(false, result);
	}

}
