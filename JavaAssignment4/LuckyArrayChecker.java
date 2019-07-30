package assignment4;

public class LuckyArrayChecker {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,55};
		boolean flag = true;
		outerloop:for(int i=0; i<arr.length;i++) {
			for (int j=0;j<arr.length;j++) {
				if(i==j) {
					continue;
				}else if (arr[i]==arr[j]) {
					flag=false;
					break outerloop;
				}	
			}
			
		}
		if (flag==true) {
		System.out.println("It's a Lucky Array");
		}else {
		System.out.println("Not a Lucky Array :-(");
		}
	}

}
