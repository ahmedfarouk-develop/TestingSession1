package calculator;


import java.util.Arrays;
import java.util.Scanner;

public class Revion {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        ////// ******how to find the largest number in Array //////

        int Arr[] = new int[5];
        int max = Arr[0]; // [ 0 -> max, 1 , 2 , 3 ,4 ]
        //                   [ 10 , 30 , 20 , 40 , 7 ]
        double sum = 0;

        for (int i = 0; i < Arr.length; i++) {
            System.out.println("please enter Index of Arr");
            Arr[i] = input.nextInt();

        }
        for (int i = 1; i < Arr.length; i++) {
            if (Arr[i] > max) {
                max = Arr[i];
            }
        }

        System.out.println("the largest number in Array = " +max);

        for (int i = 0; i < Arr.length; i++) {
            System.out.println("Index off " + i + "=" + Arr[i]);
            sum +=Arr[i];
        }
        System.out.println("Sum = "+sum);

//
//    }

//        char Schape = input.next().charAt(0);
//        if (Schape == 'c'){
//            int r = input.nextInt();
//            System.out.println("Circle "+circle(r));
//        }else if(Schape =='r'){
//            int width = input.nextInt();
//            int heith = input.nextInt();
//           System.out.println("rectangl = "+Rectangl(width,heith));
//        }


//        int Arr [] = new int[5];
//        int sum = 0;
//        int l = 0;
//        for (int i = 0; i < Arr.length ; i++) {
//            System.out.println("please enter Index of Arr");
//            Arr [i] = input.nextInt();
//        }
//
//        for (int i = 0; i <Arr.length ; i++) {
//            if(i==Arr.length){
//                System.out.println(Arr[i]);
//            }
//            System.out.println("Index off "+i+"="+Arr[i]);
//
//            sum +=Arr[i];
//
//        }
//        System.out.println("Sum of Arr[i] = "+sum);


//        double x1 ,y1 ,x2 ,y2 , sum ;
//        System.out.println("Please Enter x1 : ");
//        x1 = input.nextDouble();
//        System.out.println("Please Enter x2 : ");
//        x2= input.nextDouble();
//        System.out.println("Please Enter y1 : ");
//        y1 = input.nextDouble();
//        System.out.println("Please Enter y2 : ");
//        y2 = input.nextDouble();
//
//        double x = Math.pow((x1-x2),2);
//        double y = Math.pow((y1-y2),2);
//
//          sum = Math.sqrt(x+y);
//
//        System.out.println("Sum = "+sum );
//        double Num1 , Num2 ;

//
//        System.out.println("Enter Number 1 = ");
//        Num1 = input.nextDouble();
//        System.out.println("Enter Number 2 = ");
//        Num2 = input.nextDouble();
//
//        double Sum = Num1+Num2;
//        double dif = Num1-Num2;
//        double prod = Num1*Num2;
//        double quo = Num1/Num2;
//
//        System.out.println("Sum = "+Sum+"\ndif = "+dif+"\nprod = "+prod+"\nquo = "+quo);

//        double C,F;
//
//        System.out.println("Enter F degree : ");
//        F = input.nextDouble();
//
//        C = (5.0/9.0) + (F-32);
//
//        System.out.println("Celsius = "+C);
//

//        int x = 2 , y = 3 , z;
//
//         z = --x + --y;
////  x= 1 , y = 2 , z = 3
//         System.out.println("x = "+x+"\ny = "+y+"\nsum = "+z);

//        System.out.println("Please Enter x = ");
//        int x = input.nextInt();
//        //double Sum =(3 * Math.pow(x,2))- (8*x)+4;
//        double Sum = (3*x*x)- (8*x)+4;
//        System.out.println("Sum = "+Sum);


//        System.out.println("pleas Enter Your Email : ");
//        String Str =input.nextLine();
//
//        String  result = Str.trim();
//        String  result1 = Str.toLowerCase();
//        boolean result2 = Str.endsWith(".com");
//        System.out.println("Your Email Is : \n "+result+"\n"+result1+"\n"+result2);
//

//        System.out.println("Please Enter First Number");
//        int number1 = input.nextInt();
//        System.out.println("Please Enter Operation");
//        char operator = input.next().charAt(0);
//        System.out.println("Please Enter Second Number");
//        int number2 = input.nextInt();
//
//        if(operator == '+' ) {
//             result = number1+number2;
//        }else if (operator == '-'){
//            result = number1-number2;
//        }else if ( operator == '*'){
//            result = number1*number2;
//        }else if (operator == '/'){
//            result = number1/number2;
//        }else {
//            System.out.println("wrong Operator");
//        }
//        System.out.println("Result = "+result);
//
//

//        double y = 0.0;
//
//        System.out.println("Please Enter x");
//        int x = input.nextInt();
//        System.out.println("Please Enter i ");
//        int i = input.nextInt();
//
//
//        if(x>i){
//            y = x + 1 ;
//        }else if (x == i){
//            y = Math.pow(x,3)+4*x+10;
//        }else if(x<i){
//            y = Math.pow(x,2)+3;
//        }else {
//            System.out.println("Wrong Entry");
//        }
//        System.out.println("Result  = "+y);

//        int number = 10;
//
//        switch (number){
//            case 10 -> System.out.println("10");
//            case 11 -> System.out.println("11");
//            default -> System.out.println("Default");
//        }


//        double result = 0;
//        char schape = input.next().charAt(0);
//
//        switch (schape){
//            case 't'->{
//                int b = input.nextInt();
//                int h = input.nextInt();
//                result = 1/2*b*h;
//            }
//            case 'C'-> {
//                int r = input.nextInt();
//                result = (22 / 7) * r * r;
//            }
//            case 'r'->{
//                int w = input.nextInt();
//                int h = input.nextInt();
//                result = w*h;
//            }default -> System.out.println("Default");
//
//        }
//        System.out.println("Result = "+result);

//        for(int i= 0; i<=100 ; i++){
//            if (i%2== 1){
//                System.out.println(i);
//            }
//
//        }
        //////////////////////////
//        double result = 1;
//        for (int i = 0; i < 5; i++) {
//            System.out.println("Pleas Enter Number");
//            int y = input.nextInt();
//            if (y == 0) {
//                continue;
//
//            } else {
//                result *= y;
//
//            }
//
//        } System.out.println("result = "+result);
///////////////////////////////////////////////////////////////////////////////////////////////////
//        int i = 0;
//        while (i<= 100 ){
//            if(i%2 ==0){
//                System.out.println(i);
//            }
//            i++;
//        }
/////////////////////////////////////////////////////////////////////////////////
//        int i = 0;
//
//        do {
//            if(i %2==0){
//                System.out.println(i);
//            }
//            i++;
//
//        } while (i<=100);


        ///////////////////////////////////////////

//        String password, name;
//        System.out.print("Enter your name: ");
//        name = input.nextLine();
//        System.out.print("Enter Password: ");
//        password = input.nextLine();
////1) Its length should be greater than or equal 8
//        int password_Length = password.length();
//        System.out.println("Password_length : "+password_Length);
//        if(password_Length < 8)
//            System.out.println("Wrong\n The password length should be greater than or equal 8!");
//        else
//        System.out.println("The password length is Ok!");
////2) It should not equal the user name, ignoring case
//        if(password.equalsIgnoreCase(name))
//            System.out.println("Wrong\n The password should not be the user name");
//        else
//            System.out.println("The password not equal the user name!");
////3) It should not contain the user name
//        if(password.toLowerCase().indexOf(name.toLowerCase()) > -1)
//            System.out.println("Wrong\n The password should not contains the user name");
//        else
//            System.out.println("The password not contain the user name!");
////4) It should end with $
//        if(password.charAt(password_Length - 1) != '$')
//            System.out.println("Wrong\n The password should end with $");
//        else
//            System.out.println("The password ends with $!");

        //////////////////////////////////////////////

//        1) Display the length of the inputted password,
//                2) Display the third character of the inputted password, and
//        3) Display whether the password contains your name as a substring or
//        not. (You will need to Enter your name


//
//        int arr []= new int[5];
//        int h = 0;
//
//        for (int i = 0 ; i<arr.length; i++){
//            arr[i] = input.nextInt();
//        }
//        for (int i = 0 ; i<arr.length; i++){
//            System.out.println("index of arr  = "+i+"="+arr[i]);
//        }
//        for (int i = 0 ; i<arr.length; i++){
//            h += arr[i];
//
//        }
//        System.out.println("average ="+(h/arr.length));
//        System.out.println("result = "+h);

///////////////////////////////Array Array Array Array Array Array Array ///////////////////////////////////
//        int arr[][] = new int[2][3];
//
//        double sum = 0;
//        for (int row = 0; row<2; row ++){
//            for(int col = 0; col<3 ; col ++){
//                arr[row][col] = input.nextInt();
//            }
//        }
//        for (int row = 0; row<2; row ++){
//            for(int col = 0; col<3 ; col ++){
//                sum += arr[row][col];
//
//               System.out.println(sum);
//            }

        //     }


    }
}

//    public static double circle(int Radius) {
//
//
//        return Math.PI*Math.pow(Radius,2);
//
//    }
//    public static double Rectangl(int width, int heith) {
//
//
//        return width*heith;
//
//    }
//    public static double tringle(int base,int Heiht) {
//
//        return 1/2*base*Heiht;
//
//    }


