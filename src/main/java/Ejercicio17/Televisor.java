package Ejercicio17;

public class Televisor extends Electrodomestico {
    // Constantes
    private static final double RESOLUCION_BASE = 20;
    private static final boolean SINTONIZADOR_BASE = false;
    // Atributos televisor
    private double resolucion;
    private boolean sintonizadorTDT;

    public Televisor() {
        super();
        this.resolucion = RESOLUCION_BASE;
        this.sintonizadorTDT = SINTONIZADOR_BASE;
    }

    public Televisor(double precioBase, double peso) {
        super(precioBase, peso);
        this.resolucion = RESOLUCION_BASE;
        this.sintonizadorTDT = SINTONIZADOR_BASE;
    }

    public Televisor(double precioBase, String color, char consumoElectronico, double peso, double resolucion, boolean sintonizadorTDT) {
        super(precioBase, color, consumoElectronico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public double getResolucion() {
        return resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    @Override
    public double precioFinal() {
        double precioFinal = super.precioFinal();
        if(this.resolucion > 40 ) {
            precioFinal = precioFinal + (precioFinal * 0.3);
        }
        if(this.sintonizadorTDT) {
            precioFinal += 50;
        }

        return precioFinal;
    }

}
