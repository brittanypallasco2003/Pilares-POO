package Herencia;

public class Mascota extends Animal_Dom{

    private String nomMascota;
    private String nomProp;
    public Mascota(String nomCientifico,
                   String nomComun,
                   String nomMascota,
                   String nomProp) {
        super(nomCientifico, nomComun);
        this.nomMascota=nomMascota;
        this.nomProp=nomProp;
    }

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
}
