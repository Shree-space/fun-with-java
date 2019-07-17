import java.util.Scanner;

public class PrintNos {

    public static void main(String args[]){
        System.out.println("Please enter a number from  1 to 100");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        for(int ln = 1; (n - i+1) >= ln; ln++){

            String k = "";
            for (int j = 1; j <= ln; j++){
                k = k + " " + i;
                i ++;
            }
            System.out.println(k);
        }
    }
}