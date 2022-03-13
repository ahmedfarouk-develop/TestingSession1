package calculator;

import java.util.Queue;
import java.util.Scanner;

public class CalculatorApp1 {
    public static void main(String[]arg){

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        Equation EX = new Equation();

        EX.QuadraticEq(number);

        System.out.println("Sum = "+ EX.QuadraticEq(number));
    }
}
