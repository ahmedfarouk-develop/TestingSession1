package calculator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class calculatorApp {

    public static void main(String[] args) {
//        long result = 0;
//        String []userValues1;
        List<String> userValues1 ;
        System.out.println("Welcome to calculator App ");

        userValues1 = readFromUser();
//        System.out.println("first operand is : "+ Long.parseLong((userValues1.get(0))));

        System.out.println(
                "Result of is : " +
                        calculatorFunction(
                                Long.parseLong(userValues1.get(0)),
                                userValues1.get(1),
                                Long.parseLong(userValues1.get(2))));
        //factorial n = n*****5*4*3***1
//
//        switch (operator) {
//
//            case "+" -> result = firstOperand + secondOperand;
//
//            case "-" -> result = firstOperand - secondOperand;
//
//            case "*" -> result = firstOperand * secondOperand;
//
//            case "/" -> result = firstOperand / secondOperand;
//            case "!" -> {
//                result = firstOperand;
//                for (int i = (int) firstOperand - 1; i > 1; i--) {
//                    result *= (i);//5*4*3*2 = 120   // 5*4*3*2
//                }
//            }
//
//
//        }
//5
// !
        //44433
//       // need to add logic for operators
//        if (operator.equals("+")) {
//            result = firstOperand + secondOperand;
//        }
//        else if (operator.equals("-")) {
//            result = firstOperand - secondOperand;
//
//        }
//
//        else if (operator.equals("*")) {
//            result = firstOperand * secondOperand;
//
//        }
//        else if (operator.equals("/")) {
//
//       //     result = (double)firstOperand / secondOperand;
//        }
//
    }
    public static List<String>  readFromUser()
    {
        List<String> userValues = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter your first operand : ");
        userValues.add( scan.next());

        System.out.println("please enter operator : ");
        userValues.add(scan.next());

        if (! userValues.get(1).equals("!")) {
            System.out.println("please enter  second operand :  ");
            userValues.add( scan.next());
        }
        else userValues.add("0");

        return userValues;
    }
//2^5 = 2*2***** (5th times )
    public static long calculatorFunction(long firstNumber, String sameOperator, long secondNumber) {
        switch (sameOperator) {

            case "+" ->  {
                return firstNumber + secondNumber;
            }

            case "-" -> {
                return firstNumber - secondNumber;
            }

            case "*" -> {
                return firstNumber * secondNumber;
            }

          case "/" -> {
                return firstNumber / secondNumber;
            }
           case "^" -> {
                if (secondNumber == 0) {
                    return 1;
                }

                long x = firstNumber;
                for (int i = 1; i < secondNumber; i++) {
                    firstNumber *= x;

                }
                return firstNumber;
            }
            case "!" -> {
                for (int i = (int) firstNumber - 1; i > 1; i--) {
                    firstNumber *= (i);//5*4*3*2 = 120   // 5*4*3*2
                }


                return firstNumber;
            }
            default ->{ return 0;}

        }

    }

}

