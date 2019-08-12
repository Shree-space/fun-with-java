package assignment5;

public class PalindromeChecker {

	private boolean Palindrome;
	private String reversedStr;
	
	public PalindromeChecker(String inputStr) {
		checkPalindrome(inputStr);

	}
	

	public boolean isPalindrome() {
		return Palindrome;
	}

	private void checkPalindrome(String inputStr) {
		this.reversedStr = reverseString(inputStr);
		this.Palindrome = inputStr.equalsIgnoreCase(this.reversedStr);
		
	}
    
	private String reverseString(String inputStr) {
		StringBuffer sbf = new StringBuffer(inputStr);
		String reversedStr = sbf.reverse().toString();
		return reversedStr;
	}
	

	
}
