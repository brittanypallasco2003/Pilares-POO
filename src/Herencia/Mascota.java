package Herencia;

public class Mascota {
    //ATRIBUTOS
    private String nomMascota;
    private String nomProp;
    private String dieta;

    //CONSTRUCTOR
    public Mascota(String nomMascota, String nomProp, String dieta) {
        this.nomMascota = nomMascota;
        this.nomProp = nomProp;
        this.dieta = dieta;
    }

    //GETTERS Y SETTERS
    public String getNomMascota() {
        return nomMascota;
    }

    public void setNomMascota(String nomMascota) {
        this.nomMascota = nomMascota;
    }

    public String getNomProp() {
        return nomProp;
    }

    public void setNomProp(String nomProp) {
        this.nomProp = nomProp;
    }

    public String getDieta() {
        return dieta;
    }

    public void setDieta(String dieta) {
        this.dieta = dieta;
    }
}
