package Ejercicio17;

import java.util.HashMap;
import java.util.Map;

public class Electrodomestico {

    /**
     * Constantes
     */

    public static final double PRECIO_BASE = 100;
    public static final String COLOR_BASE = "white";
    public static final char CONSUMO_ENERGETICO_BASE = 'F';
    public static final double PESO_BASE = 5;

    /**
     * Colores disponibles blancos, negro, rojo, azul y gris
     */
    public static final String[] COLORES = {"BLANCO", "NEGRO", "ROJO", "AZUL", "GRIS"};


    /**
     * Attributes
     */
    public double precioBase;
    public String color;
    public char consumoElectronico;
    public double peso;

    /** Constructores **/
    public Electrodomestico() {
        this.precioBase = PRECIO_BASE;
        this.color = COLOR_BASE;
        this.consumoElectronico = CONSUMO_ENERGETICO_BASE;
        this.peso = PESO_BASE;
    }

    public Electrodomestico(double precioBase, double peso) {
        this.precioBase = precioBase;
        this.peso = peso;
        this.consumoElectronico = CONSUMO_ENERGETICO_BASE;
        this.color = COLOR_BASE;
    }

    public Electrodomestico(double precioBase, String color, char consumoElectronico, double peso) {
        this.precioBase = precioBase;
        this.color = comprobarColor(color);
        this.consumoElectronico = comprobarConsumoEnergetico(consumoElectronico);
        this.peso = peso;
    }

    /** Getters */
    public double getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public char getConsumoElectronico() {
        return consumoElectronico;
    }

    public double getPeso() {
        return peso;
    }

    /** Methods */

    public char comprobarConsumoEnergetico(char letter) {
        if(letter >= 'A' && letter <= 'F' ){
            return letter;
        }else {
            return CONSUMO_ENERGETICO_BASE;
        }
    }

    public String comprobarColor(String color) {
        color = color.toUpperCase();
        for (String i : COLORES) {
            if(i.equals(color)) {
                return color;
            }
        }
        return COLOR_BASE;
    }

    public double precioFinal() {

        double precioPorConsumoElectronico = 0;
        double precioSegunPeso = 0;
        switch (this.consumoElectronico){
            case 'A':
                precioPorConsumoElectronico = 100;
                break;
            case 'B':
                precioPorConsumoElectronico = 80;
                break;
            case 'C':
                precioPorConsumoElectronico = 60;
                break;
            case 'D':
                precioPorConsumoElectronico = 50;
                break;
            case 'E':
                precioPorConsumoElectronico = 30;
                break;
            case 'F':
                precioPorConsumoElectronico = 10;
                break;
        }
        if (this.peso >= 0 && this.peso <=19) {
            precioSegunPeso = 10;
        }else if(this.peso >= 20 && this.peso <=49){
            precioSegunPeso = 50;
        }else if(this.peso >= 50 && this.peso <=79){
            precioSegunPeso = 80;
        }else if(this.peso >= 80){
            precioSegunPeso = 100;
        }

        return this.precioBase + precioPorConsumoElectronico + precioSegunPeso;
    }

}

