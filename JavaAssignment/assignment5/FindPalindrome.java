package assignment5;

import java.util.Scanner;

public class FindPalindrome {

	public static void main(String[] args) {
		System.out.println("Please enter a string to test if a 'Palindrome'");
			Scanner sc = new Scanner(System.in);
			String inputString = sc.nextLine();
			PalindromeChecker palindromechecker = new PalindromeChecker();
			palindromechecker.setInputStr(inputString);
		    System.out.println(palindromechecker.checkPalindrome(inputString)? "It's a Palindrome!": "It's not a Palindorme :-(");

}

}