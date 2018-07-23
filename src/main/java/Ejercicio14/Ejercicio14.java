package Ejercicio14;

import Util.Util;

/**
 * Create a program that prompts for a number and prints the numbers from the entered number to 1000 on the screen with 2-by-2 increments.
 */
public class Ejercicio14 {
    public static void main(String[] args){
        int number;

        try {
            number = Util.readInt("Enter the number: ");
            for (int i = number; i <= 1000; i+=2) {
                System.out.print(i + ",");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
