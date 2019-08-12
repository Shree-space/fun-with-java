package assignment5;

public class PalindromeChecker {

	private boolean palindrome;
	private String reversedStr;
	
	public PalindromeChecker(String inputStr) {
		checkPalindrome(inputStr);

	}
	

	public boolean isPalindrome() {
		return palindrome;
	}

	private void checkPalindrome(String inputStr) {
		this.reversedStr = reverseString(inputStr);
		this.palindrome = inputStr.equalsIgnoreCase(this.reversedStr);
		
	}
    
	private String reverseString(String inputStr) {
		StringBuffer sbf = new StringBuffer(inputStr);
		String reversedStr = sbf.reverse().toString();
		return reversedStr;
	}
	

	
}
