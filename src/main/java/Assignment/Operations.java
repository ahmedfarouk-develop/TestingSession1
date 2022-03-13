package Assignment;

public class Operations {

    double x ;
    double y ;

    public Operations(double x,double y){
        this.x= x;
        this.y= y;
    }

    public double Add() {
        return x+y;
    }

    public double Subtract() {
        return x - y;
    }

    public double Multiply() {
        return x * y;
    }

    public double Divide() {
        return x / y;
    }

    public double Find_mine() {
        double mine ;
        if (x < y) {
            mine = x;
        }else{
            return y;
        }
        return mine;

    }

    public double Find_max() {
        double max ;
        if (x > y) {
            max = x;
        }else{
            return y;
        }
        return max;

    }
}