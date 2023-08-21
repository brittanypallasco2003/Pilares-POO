package Encapsulamiento.EncapsulamientoEj1;

import Encapsulamiento.EncapsulamientoEj1.Persona;

public class main {
    public static void main(String[] args) {
        Persona persona = new Persona("David", 20);

        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Edad: " + persona.getEdad());

        persona.setNombre("Gabriela");
        persona.setEdad(-25); //Saldra un mensaje de que la edad dene tener un valor positivo sino no sera tomado el valor
        persona.setEdad(28);

        System.out.println("Nuevo nombre: " + persona.getNombre());
        System.out.println("Nueva edad: " + persona.getEdad());
    }
}

