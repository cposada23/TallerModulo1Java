package Ejercicio15;

import Util.Util;








/**
 * Make a program that displays the following menu of options
 * ****** FILM MANAGEMENT **********
 * 1- NEW ACTOR
 * 2-SEEK ACTOR
 * 3-ELIMINATE ACTOR
 * 4-MODIFY ACTOR
 * 5-SEE ALL ACTORS
 * 6- SEE MOVIES OF THE ACTORS
 * 7-SEE CATEGORY OF THE MOVIES OF THE ACTORS
 * 8-EXIT
 *
 * THE SYSTEM WILL ONLY EXIT WHEN THE NUMBER 8 IS ENTERED, WHILE ONE OF THE FIVE OPTIONS IS BEING ENTERED, THE MENU MUST CONTINUE TO BE DISPLAYED
 * AND IF THE USER ENTERS A NUMBER THAT IS NOT IN THE MENU, A "WRONG OPTION" MESSAGE MUST BE DISPLAYED. AND DISPLAY THE MENU AGAIN.
 * HINT: COMBINE SWICHT AND ONE OF THE LOOPS.
 *
 *
 * Translated with www.DeepL.com/Translator
 */
public class Ejercicio15 {
    public static void main(String[] args) {
        int option = 0;

        do {
            showMenu();
            try {
                option = Util.readInt("Enter option: ");
            } catch (Exception e) {
                System.out.println(e.getMessage());
                continue;
            }
        }while(option != 8);
    }

    public static void showMenu() {
        System.out.println("* ****** FILM MANAGEMENT **********");
        System.out.println("1-NEW ACTOR");
        System.out.println("2-SEEK ACTOR");
        System.out.println("3-ELIMINATE ACTOR");
        System.out.println("4-MODIFY ACTOR");
        System.out.println("5-SEE ALL ACTORS");
        System.out.println("6-SEE MOVIES OF THE ACTORS");
        System.out.println("7-SEE CATEGORY OF THE MOVIES OF THE ACTORS");
        System.out.println("8-EXIT");
    }
}
