package priceCalculator;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class CostCallCalculator {



    Date endDiscount;
    Date startDiscount;
    Date startCall;
    Date endCall;
    boolean isDiscount ;
    boolean isComaition;


    public CostCallCalculator(String startCall,String endCall){

        setDateValues(startCall,endCall);


    }
    //function calculate call duration
    //function calculate discount  comaition
    //function calculate price of call

    public void setDateValues(String startCall,String endCall){


        SimpleDateFormat format = new SimpleDateFormat("HH:mm");
        try {
            this.startCall = format.parse(startCall);
            this.endCall = format.parse(endCall);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.HOUR_OF_DAY,17);
        cal.set(Calendar.MINUTE,59);
        startDiscount = cal.getTime();
        cal.set(Calendar.HOUR_OF_DAY,7);
        cal.set(Calendar.MINUTE,59);
        endDiscount = cal.getTime();


        calculateDiscount();
    }
     double calculateMinute() {


        long difference = (endCall.getTime() - startCall.getTime())/60/1000;
        System.out.println(difference);
        return difference;
    }

     void calculateDiscount (){


       if(startCall.getTime()>(startDiscount.getTime())){
           isDiscount=true;
       }
        if (calculateMinute()>60){
            isComaition = true;
        }


    }
    public double calculateCost(){
        //Number of minutes * cost "price" * isdiscount *Iscomition

        System.out.println(isComaition);
        System.out.println(isDiscount);

        double price = (calculateMinute()*.40)+(calculateMinute()*.40*.04) ;
        double discount ;
        double comition ;
        if(isDiscount)
        discount=price *.15;
        else discount=0;
        if(isComaition)
            comition=price*.5;
        else comition=0;
        price = (calculateMinute()*.40)+(calculateMinute()*.40*.04);
        return (price)-discount-comition;

    }

}

//import java.time.Duration;
//        import java.time.Instant;
//        ...
//        Instant start = Instant.now();
////your code
//        Instant end = Instant.now();
//        Duration timeElapsed = Duration.between(start, end);
//        System.out.println("Time taken: "+ timeElapsed.toMillis() +" milliseconds");
