package Encapsulamiento.EncapsulamientoEj2;

public class Estudiante {
    private String nombre;
    private int edad;
    private String numeroMatricula;

    public Estudiante(String nombre, int edad, String numeroMatricula) {
        this.nombre = nombre;
        this.edad = edad;
        this.numeroMatricula = numeroMatricula;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        if (edad > 0) {
            this.edad = edad;
        } else {
            System.out.println("La edad debe ser un valor positivo.");
        }
    }
    public void setNumeroMatricula(String numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }
}
