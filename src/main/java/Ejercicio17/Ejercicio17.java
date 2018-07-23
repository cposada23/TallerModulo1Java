package Ejercicio17;

public class Ejercicio17 {
    public static void main(String[] args) {
        System.out.println("******* EJERCICIO 17 ********");
        Electrodomestico electrodomesticos[] = new Electrodomestico[10];

        electrodomesticos[0] = new Electrodomestico();
        electrodomesticos[1] = new Televisor();
        electrodomesticos[2] = new Lavadora();
        electrodomesticos[3] = new Televisor();
        electrodomesticos[4] = new Lavadora();
        electrodomesticos[5] = new Televisor();
        electrodomesticos[6] = new Lavadora();
        electrodomesticos[7] = new Electrodomestico();
        electrodomesticos[8] = new Televisor();
        electrodomesticos[9] = new Lavadora();

        double precioTotalOtrosElectrodomesticos = 0;
        double precioTotalTelevisores = 0;
        double precioTotalLavadoras = 0;
        double precioTotal = 0;

        for (Electrodomestico electrodomestico :
                electrodomesticos) {
            if (electrodomestico instanceof Televisor) {
                precioTotalTelevisores += electrodomestico.precioFinal();
            } else if (electrodomestico instanceof Lavadora) {
                precioTotalLavadoras += electrodomestico.precioFinal();
            } else {
                precioTotalOtrosElectrodomesticos += electrodomestico.precioFinal();
            }
        }
        precioTotal = precioTotalOtrosElectrodomesticos + precioTotalLavadoras + precioTotalTelevisores;

        System.out.printf("The total price: %f", precioTotal );
        System.out.printf("Total price of tv's: %f", precioTotalTelevisores);
        System.out.printf("Total price of the washers: %f", precioTotalLavadoras);
        System.out.printf("Total price of others domestic appliances: %f", precioTotalOtrosElectrodomesticos);
    }
}
