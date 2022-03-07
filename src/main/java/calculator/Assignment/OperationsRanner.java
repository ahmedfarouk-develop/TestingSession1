package calculator.Assignment;

import java.util.Scanner;

public class OperationsRanner {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter x = ");
        double x = input.nextInt();
        System.out.println("Please Enter y = ");
        double y = input.nextInt();

        Operations op = new Operations();
        op.Add(x,y);
        System.out.println("Sum = "+op.Add(x,y));

        op.Subtract(x,y);
        System.out.println("Subtract = "+op.Subtract(x,y));

        op.Multiply(x,y);
        System.out.println("Multiply = "+op.Multiply(x,y));

        op.Find_max(x,y);
        System.out.println("max = "+op.Find_max(x,y));

        op.Find_mine(x,y);
        System.out.println("mine = "+op.Find_mine(x,y));

    }
}
