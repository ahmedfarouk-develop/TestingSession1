package Assignment;

import java.util.Scanner;

public class OperationsRanner {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter x = ");
        double x = input.nextInt();
        System.out.println("Please Enter y = ");
        double y = input.nextInt();

        Operations op = new Operations(x,y);
        op.Add();
        System.out.println("Sum = "+op.Add());

        op.Subtract();
        System.out.println("Subtract = "+op.Subtract());

        op.Multiply();
        System.out.println("Multiply = "+op.Multiply());

        op.Divide();
        System.out.println("Divide = "+op.Divide());


        op.Find_max();
        System.out.println("max = "+op.Find_max());

        op.Find_mine();
        System.out.println("mine = "+op.Find_mine());

    }
}
