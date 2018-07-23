package Ejercicio16;

import Util.Util;

public class Ejercicio16 {
    public static void main(String[] args) {
        byte IMC;
        int edad;
        double peso, altura;
        String nombre;
        char sexo;
        Persona p1, p2, p3;

        try {
            edad = Util.readInt("Enter the age of the person");
            peso = Util.readDouble("Enter the persons weigth");
            altura = Util.readDouble("Enter the persons heigth");
            nombre = Util.readString("Enter the person name");
            sexo = Util.readChar("Enter the person gender {male: 'H'} - {female: 'M'}");
            p1 = new Persona(nombre, edad, sexo, peso, altura);
            p2 = new Persona(nombre, edad, sexo);
            p3 = new Persona();
            p3.setNombre("Person 3");
            p3.setAltura(1.7);
            p3.setEdad(15);
            p3.setPeso(50);
            p3.setSexo('H');

            Persona aux;
            for (int i = 0; i < 3; i++) {
                if(i == 0) {
                    aux = p1;
                }else if( i == 1) {
                    aux = p2;
                }else {
                    aux = p3;
                }
                IMC = aux.calcularIMC();
                System.out.println("******** PERSONA " +  (i + 1) + " *********");
                switch (IMC) {
                    case -1:
                        System.out.println("The person is: UNDER WEIGHT");
                        break;
                    case 0:
                        System.out.println("The person is in the IDEAL WEIGHT");
                        break;
                    case 1:
                        System.out.println("The person is OVER WEIGHT");
                        break;
                }
                if(aux.esMayorDeEdad()) {
                    System.out.println("The person is an Adult of legal age");
                }else {
                    System.out.println("The person is under age");
                }

                System.out.println(aux.toString());
            }

        } catch (Exception e) {

            System.out.println(e.getMessage());
        }
    }
}
