import java.util.Scanner;

public class Calculator {

    public static void main (String args[]){

        System.out.println("Please input the operation you would like to perform");
        System.out.println("1 for Addition");
        System.out.println("2 for Subtraction");
        System.out.println("3 for Multiplication");
        System.out.println("4 for Division");
        Scanner sc = new Scanner(System.in);
        int op = sc.nextInt();
        int n1=0,n2=0,n3=0;
        double n4=0,n5=0,n6=0;
        String type="";
        System.out.println("Please enter input variables");
        if (sc.hasNextInt()) {
            n1 = sc.nextInt();
            type = "Int";
        } else if (sc.hasNextDouble()){
            n4 = sc.nextDouble();
             type = "Double";
             System.out.println("n4");
        }
        if (sc.hasNextInt()) {
            n2= sc.nextInt();
        } else if (sc.hasNextDouble()){
            if (type.equalsIgnoreCase("Int")){
                type = "Double";
            }
            n5 = sc.nextDouble();
        }



        switch (op){
            case 1://Addition
                System.out.println("Please please press 1 to perform add operation or 2 to enter one more variable");
                int opt = sc.nextInt();
                if (opt == 1) {
                    if(type.equalsIgnoreCase("Int")){
                        add(n1,n2);
                    }else if (type.equalsIgnoreCase("Double")){
                        add(n4,n5);
                    }

                }else if (opt ==2){
                    System.out.println("Please enter the third input");
                    if (sc.hasNextInt()) {
                        n3= sc.nextInt();
                        add(n1,n2,n3);
                    } else if (sc.hasNextDouble()){
                        n6 = sc.nextDouble();
                        add(n4,n5,n6);
                    }

                }
                break;
            case 2://Subtraction
                sub(n1,n2);
                break;
            case 3://Multiplication
                mul(n1,n2);
                break;
            case 4://Division
                div(n1,n2);
                break;
        }




    }
    static void add(int n1, int n2){
        System.out.println("The result is " + (n1+n2));
    }



    static void add(int n1, int n2, int n3){
        System.out.println("The result is " + (n1+n2+n3));
    }

    static void add(double n1, double n2){
        System.out.println("The result is " + (n1+n2));
    }

    static void add(double n1, double n2, double n3){
        System.out.println("The result is " + (n1+n2+n3));
    }

    static void sub(int n1, int n2){
        System.out.println("The result is " + (n1-n2));
    }

    static void mul(int n1, int n2){
        System.out.println("The result is " + (n1*n2));
    }

    static void div(int n1, int n2){
        System.out.println("The result is " + (n1/n2));
    }


}