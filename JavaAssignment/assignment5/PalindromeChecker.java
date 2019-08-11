package assignment5;

public class PalindromeChecker {

	private String inputStr;
	private boolean result;
	


	public void setInputStr(String inputStr) {
		this.inputStr = inputStr;
	}

	public boolean isResult() {
		return result;
	}

	public boolean checkPalindrome(String inputStr) {
		String reversedStr = reverseString(inputStr);
		boolean result = compareString(inputStr,reversedStr);
		return result;
	}
    
	private String reverseString(String inputStr) {
		StringBuffer sbf = new StringBuffer(inputStr);
		String reversedStr = sbf.reverse().toString();
		return reversedStr;
	}
	
	private boolean compareString(String inputStr, String reversedStr) {
		boolean result = inputStr.equalsIgnoreCase(reversedStr);
		return result;
	}
	
}
