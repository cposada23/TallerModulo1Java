package Ejercicio2;
import Util.Util;
public class Ejercicio2 {
    public static void main(String[] args) {
        double a, b;
        try {
            a = Util.readDouble("Enter the first number: ");
            b = Util.readDouble("Enter the second number: ");
            witchIsBigger(a, b);
        }catch (Exception e) {
            System.out.println("You must enter numeric values");
        }
    }

    public static void witchIsBigger(double a, double b) {
        if( a > b ) {
            System.out.println("a is greater than b");
        }else if( a == b ) {
            System.out.println("a is equal to b");
        }else {
            System.out.println("a is less than b");
        }
    }
}
