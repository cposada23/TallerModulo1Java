package Ejercicio12;

import Util.Util;

/**
 * Ask for two words by keyboard, indicate if they are the same, if not show their differences
 */
public class Ejercicio12 {
    public static void main(String[] args) {
        String word1, word2;

        try {
            word1 = Util.readString("Enter the first word: ");
            word2 = Util.readString("Enter the second word: ");
            findDiferences(word1, word2);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void findDiferences(String a, String b) {
        if(a.equals(b)) {
            System.out.printf("The two words are the same");
        }else {
            showDiferences(a, b);
        }
    }
    public static void  showDiferences(String a, String b) {
        int lengthA = a.length();
        int lengthB = b.length();
        String biggerWord;
        String shortWord;
        char c1, c2;

        if( lengthA > lengthB ) {
            biggerWord = a;
            shortWord = b;
        }else {
            biggerWord = b;
            shortWord = a;
        }
        // Start comparing character by character
        int i;
        for (i = 0; i < shortWord.length(); i++) {
            c1 = shortWord.charAt(i);
            c2 = biggerWord.charAt(i);
            if(c1 != c2) {
                System.out.printf("Character at position %d difference: {%c} - {%c} %n", i, c1, c2 );

            }
        }
        if(lengthA != lengthB) {
            System.out.printf("There is a difference in the length of the two words %n");
            biggerWord = biggerWord.substring(i);
            System.out.printf("The rest of the bigger word %s", biggerWord);
        }

    }
}
