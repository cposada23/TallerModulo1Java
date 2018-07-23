package Ejercicio1;

public class Ejercicio1 {
    public static void main(String[] args) {

        /**
         * Declare 2 numerical variables (with the value you want),
         * indicates which is the greatest. If they are equal,
         * indicate it too. Keep changing the values ​​to verify that it works.
         */

        double a = 2.3;
        double b = 3.8;

        if( a > b ) {
            System.out.println("a is greater than b");
        }else if( a == b ) {
            System.out.println("a is equal to b");
        }else {
            System.out.println("a is less than b");
        }
    }
}
