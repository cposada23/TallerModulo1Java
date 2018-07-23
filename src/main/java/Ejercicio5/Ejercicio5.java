package Ejercicio5;

public class Ejercicio5 {
    public static void main(String[] args) {
        /**
         * Displays odd and even numbers from 1 to 100 (both included). Use a while loop
         */
        int start = 1;
        int end = 100;
        String evens = "";
        String odds = "";
        while ( start < end ) {
            if(start % 2 == 0) {
                evens += String.valueOf(start) + ",";
            }else {
                odds += String.valueOf(start) + ",";
            }
            start++;
        }
        System.out.println("Odd numbers: "+ odds);
        System.out.println("Even numbers: "+ evens);
    }
}

