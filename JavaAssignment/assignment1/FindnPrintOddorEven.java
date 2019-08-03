package assignment1;

public class FindnPrintOddorEven {

	public static void main(String[] args) {
		
		int inputNum = 11;
		int type = findOddorEven (inputNum);
		
		if (type==0) {
			System.out.println("We got an even number!");
		} else {
			System.out.println("We got an odd number!");
		}
		
	
	}
	
	
	private static int findOddorEven(int inputNum) {
		
		int result = inputNum % 2;
		return result;
		
	}

}
