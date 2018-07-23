package Ejercicio10;
import Util.Util;
public class Ejercicio10 {
    /**
     * Create a console application, which when entering a phrase through the keyboard eliminates the spaces it contains.
     */

    public static void main(String[] args){
        String phrase;

        try {
            phrase = Util.readString("Enter the phrase");
            phrase = phrase.replaceAll(" ", "");
            System.out.println(phrase);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
