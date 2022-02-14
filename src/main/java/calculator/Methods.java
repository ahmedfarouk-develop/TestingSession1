package calculator;

import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);



        //Write a Java program that read First name and Last name
        //and display the Full Name, using the following method:
        //publicstaticString myname(String ,String)
        //which takes First and Last name as inputs

//        String FirsName, LastName, FullName;
//
//        System.out.println("Please Enter First name");
//        FirsName = input.next();
//        System.out.println("Please Enter Last name");
//        LastName = input.next();
//        FullName = MyName(FirsName,LastName);
//        System.out.println("The Full Name IS "+FullName);
//
//    }
//
//    public static String MyName(String first_name,String last_name){
//     return first_name+" "+last_name;
//    }

 //    Consider the following Quadratic equation:
//        3X2-8X + 4
//        Write a Java program that reads X from user and shows result

//        System.out.println("Please Enter X = ");
//        Double x = input.nextDouble();
//        System.out.println("Result = "+equation(x));
//
//
//    }
//    public static double equation(double y){
//        return  (3*Math.pow(y,2))-8*y + 4;





        int num1, num2;
        System.out.println("Enter Num1 = ");
        num1 = input.nextInt();
        System.out.println("Enter Num2 = ");
        num2 = input.nextInt();
        System.out.println(Find_Min(num1,num2));





    }

        public static int Find_Min(int Num1, int Num2) {
            if (Num1 < Num2) {
                System.out.println("is the minimum 'Num1' = "+ Num1);

            } else if (Num2 < Num1) {
                System.out.println("is the minimum 'Num2' = "+ Num2);

            } else {
                System.out.println(Num1+"=="+ Num2);

            }return 0;
        }
    }
