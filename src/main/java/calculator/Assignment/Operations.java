package calculator.Assignment;

public class Operations {



    public double Add(double x,double y) {
        return x+y;
    }

    public double Subtract(double x,double y) {
        return x - y;
    }

    public double Multiply(double x,double y) {
        return x * y;
    }

    public double Divide(double x,double y) {
        return x / y;
    }

    public double Find_mine(double x,double y) {
        double mine ;
        if (x < y) {
            mine = x;
        }else{
            return y;
        }
        return mine;

    }

    public double Find_max(double x,double y) {
        double max ;
        if (x > y) {
            max = x;
        }else{
            return y;
        }
        return max;

    }
}