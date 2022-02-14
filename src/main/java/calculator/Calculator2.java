package calculator;

import java.util.Scanner;

public class Calculator2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter Number1 = ");
        int NUm = input.nextInt();
        System.out.println("Please Enter Operate = ");
        String operate = input.next();
        System.out.println("Please Enter Number2 = ");
        int NUm2 = input.nextInt();
        System.out.println("Resulr"+Calc(NUm,operate,NUm2) );


    }

    public static double Calc(double Number1, String operator, double Number2) {
        switch (operator) {
            case "+" -> {
                return Number1 + Number2;
            }
            case "-" -> {
                return Number1 - Number2;
            }
            case "*" -> {
                return Number1 * Number2;
            }
            case "/"->{
                return Number1/Number2;
            }

        }return 0;

    }


}
