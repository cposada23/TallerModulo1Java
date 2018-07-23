package Ejercicio4;
import Util.Util;
public class Ejercicio4 {

    public static final double IVA = 0.21;
    /**
     * Read a number by keyboard that asks for the price of a product (can have decimals)
     * and calculate the final price with IVA. IVA will be a constant that will be 21%.
     */

    public static void main(String[] args) {
        double price;
        double priceWithIVA;
        try{
            price = Util.readDouble("Enter the price of the product: ");
            priceWithIVA = price + (price * IVA);
            System.out.printf("The final price of the product with IVA is: %f ", priceWithIVA);;
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
