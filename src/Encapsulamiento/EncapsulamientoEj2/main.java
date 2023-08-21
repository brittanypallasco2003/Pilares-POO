package Encapsulamiento.EncapsulamientoEj2;

public class main {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Ana", 20, "2023001");

        System.out.println("Nombre: " + estudiante.getNombre());
        System.out.println("Edad: " + estudiante.getEdad());
        System.out.println("Matrícula: " + estudiante.getNumeroMatricula());

        estudiante.setEdad(-22);
        estudiante.setNumeroMatricula("2023A001");

        System.out.println("Nuevo nombre: " + estudiante.getNombre());
        System.out.println("Nueva edad: " + estudiante.getEdad());
        System.out.println("Nueva matrícula: " + estudiante.getNumeroMatricula());
    }
}
