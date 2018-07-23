package Ejercicio9;

public class Ejercicio9{
    /**
     * 9.	Del texto, “La sonrisa sera la mejor arma contra la tristeza”
     * Reemplaza todas las a del String anterior por una e,
     * adicionalmente concatenar a esta frase una adicional que ustedes quieran incluir por consola
     * y las muestre luego unidas
     */
    public static void main(String[] args) {
        String text = "La sonrisa sera la mejor arma contra la tristeza";
        String concat = "Empieza a ser feliz hoy!!!!";
        text = text.replaceAll("a", "e") + ". E" + concat;
        System.out.println(text);
    }
}
