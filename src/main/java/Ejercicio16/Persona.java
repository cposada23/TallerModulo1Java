package Ejercicio16;

import java.util.Random;

public class Persona {
    /** Constants */
    private static final byte UNDER_WEIGTH = -1;
    private static final byte OVER_HEIGTH = -1;
    private static final byte IDEAL_WEIGTH = -1;
    private String nombre;
    private int edad;
    private String DNI;
    private char sexo;
    private double peso;
    private double altura;



    public Persona() {
        this.nombre = "";
        this.edad = 0;
        this.sexo = 'H';
        this.peso = 0.0;
        this.altura = 0.0;
        this.DNI = generaDNI();
    }

    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = comprobarSexo(sexo);
        this.DNI = generaDNI();
    }

    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = generaDNI();
        this.sexo = comprobarSexo(sexo);
        this.peso = peso;
        this.altura = altura;
    }

    /** methods */

    /**
     * calculará  si la persona está en su peso ideal (peso en kg/(altura^2  en m)),
     * si esta fórmula devuelve un valor menor que 20,
     * la función devuelve un -1,
     * si devuelve un número entre 20 y 25 (incluidos),
     * significa que está por debajo de su peso ideal la función devuelve un 0  y si devuelve un valor mayor que 25 significa que tiene sobrepeso,
     * la función devuelve un 1.
     */
    public byte calcularIMC() {
        double IMC = this.peso / (Math.pow(this.altura, 2));

        if(IMC < 20) {
            // Por debajo del peso ideal
            return UNDER_WEIGTH;
        }else if(IMC >= 20 || IMC >= 25) {
            return IDEAL_WEIGTH;
        }else {
            return OVER_HEIGTH;
        }
    }


    /**
     *
     * @return true or false
     */
    public boolean esMayorDeEdad() {
        return this.edad >= 18;
    }

    /**
     * Comprueba que el sexo introducido es correcto. Si no es correcto, sera H. No será visible al exterior.
     * @param sexo
     * @return
     */
    private char comprobarSexo(char sexo) {
        if(sexo != 'H' || sexo != 'M') {
            return sexo;
        }else {
            return 'H';
        }
    }


    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", DNI=" + DNI +
                ", sexo=" + sexo +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }

    /**
     * genera un número aleatorio de 8 cifras,
     * genera a partir de este su número su letra correspondiente.
     * Este método será invocado cuando se construya el objeto.
     * Puedes dividir el método para que te sea más fácil.
     * No será visible al exterior.
     * @return
     */
    private String generaDNI() {
        Random rand =  new Random();
        String[] firstEigthLetters = {"A","B","C","D","E","F","G","H", "J", "K"};
        int randomNumber = rand.nextInt(89999999) + 10000000;
        //Convert it into string
        int digit;
        int aux = randomNumber;
        String DNI = "";
        while(aux > 0) {
            digit = aux % 10;
            aux = aux / 10;
            DNI = firstEigthLetters[digit] + DNI;
        }
        System.out.println(DNI);
        return DNI;
    }

    /** setters and getters */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDNI() {
        return DNI;
    }


    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = comprobarSexo(sexo);
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
