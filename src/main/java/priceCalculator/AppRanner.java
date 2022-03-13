
package priceCalculator;

import java.util.Scanner;

public class AppRanner {
    public static void main (String[]arg){

        Scanner input = new Scanner(System.in);

        System.out.println("Start Call = ");
        String startCall = input.next();
        System.out.println("end Call = ");
        String endCall  = input.next();

        CostCallCalculator cost = new CostCallCalculator(startCall,endCall);
        cost.calculateCost(); 
        System.out.println("Cost of Call == "+ cost.calculateCost());
    }


}
