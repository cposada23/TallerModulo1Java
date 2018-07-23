package Ejercicio3;
import Util.Util;
public class Ejercicio3 {
    public static void main(String[] args) {
        double radio, area;

        try {
            radio = Util.readDouble("Enter the radius of the circle: ");
            area = Math.PI * Math.pow(radio, 2.0);
            System.out.printf("The area of the circle of radius = %f is equal to %f", radio, area);
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
