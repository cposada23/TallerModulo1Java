package Ejercicio6;

public class Ejercicio6 {
    public static void main(String[] args) {
        /**
         * Displays odd and even numbers from 1 to 100 (both included). Use a for loop
         */
        int start = 1;
        int end = 100;

        for (int i = start; i < end; i++) {
            System.out.print(i + ",");
        }
        System.out.print(end);
    }
}