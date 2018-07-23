package Ejercicio17;

public class Lavadora extends Electrodomestico {
    public static final double CARGA_BASE = 5;
    private double carga;

    public Lavadora() {
        this.carga = CARGA_BASE;
    }

    public Lavadora(double precioBase, double peso) {
        super(precioBase, peso);
        this.carga = CARGA_BASE;
    }

    public Lavadora(double precioBase, String color, char consumoElectronico, double peso, double carga) {
        super(precioBase, color, consumoElectronico, peso);
        this.carga = carga;
    }

    public double getCarga() {
        return carga;
    }

    @Override
    public double precioFinal() {
        double precioFinal = super.precioFinal();
        if(this.carga > 30) {
            precioFinal += 50;
        }
        return precioFinal;
    }


}
