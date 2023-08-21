package Herencia;

public class Animal_Dom {
    private String nomCientifico;
    private String nomComun;

    public Animal_Dom(String nomCientifico, String nomComun) {
        this.nomCientifico = nomCientifico;
        this.nomComun = nomComun;
    }

    public String getNomCientifico() {
        return nomCientifico;
    }

    public void setNomCientifico(String nomCientifico) {
        this.nomCientifico = nomCientifico;
    }

    public String getNomComun() {
        return nomComun;
    }

    public void setNomComun(String nomComun) {
        this.nomComun = nomComun;
    }
}
