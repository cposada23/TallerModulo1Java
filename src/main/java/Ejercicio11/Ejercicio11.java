package Ejercicio11;

import Util.Util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio11 {
    /**
     * Perform the construction of an algorithm that allows,
     * according to a phrase passed through the console,
     * to indicate the length of this phrase,
     * in addition show how many vowels it has of "a,e,i,o,u".
     */
    public static void main(String[] args) {
        String phrase;
        String pattern = "(?i)[aeiou]";
        Pattern p = Pattern.compile(pattern);
        Matcher matcher;
        int numberOfVowels = 0;
        int phraseLegth;
        try {
            phrase = Util.readString("Enter the phrase: ");
            phraseLegth = phrase.length();
            matcher = p.matcher(phrase);
            while (matcher.find()) {
                numberOfVowels++;
            }
            System.out.printf("the phrase has %d vowels, and the length of the phrase is: %d", numberOfVowels, phraseLegth);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
