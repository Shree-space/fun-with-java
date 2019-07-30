package assignment4;

import java.util.Scanner;

public class NumberFrequencyChecker {

	public static void main(String[] args) {
		System.out.println("Please enter input Nos to check the frequency");
		Scanner sc = new Scanner(System.in);
		String N = sc.next();
		
		String firstchar = N.substring(0,1);
		int initialFreq=0;
		boolean flag=true;
		
		for (int i = 0;i< N.length(); i++) {
			String char1 = N.substring(i, i+1);	
			int freqcntr=0;
			for (int j = 0;j<N.length();j++) {
				String char2 = N.substring(j,j+1);
				
				if((i==0)&& (firstchar.equalsIgnoreCase(char2))) {
							initialFreq++;
				}		
				if (char1.equalsIgnoreCase(char2)) {
					freqcntr++;
				}
			}
			if (initialFreq != freqcntr) {
				flag = false;
				break;
			}


		}
		 if (flag==true) {
			 System.out.println("YES, the frequency of the input numbers are same");
			
		}else {
			System.out.println("NO, the frequency of the input numbers are differnt");
		}
	}

}
