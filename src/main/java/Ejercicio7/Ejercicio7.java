package Ejercicio7;
import Util.Util;
public class Ejercicio7 {
    /**
     * Read a number by keyboard and check if this number is greater than or equal to zero,
     * if it is not it will ask again (do while), then shows that number by console.
     */


    public static void main(String[] args) {
        double number = -1;
        do{
            try{
                number = Util.readDouble("Enter number");
            }catch (Exception e) {
                System.out.println(e.getMessage());
                continue;
            }
        } while ( number < 0 );

        System.out.printf("The number is: %f", number);
    }

}
