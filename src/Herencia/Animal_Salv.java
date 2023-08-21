package Herencia;

public class Animal_Salv {
    private String nomCientifico;
    private String nomComun;
    private String ordenAnimal;

    public Animal_Salv(String nomCientifico, String nomComun, String ordenAnimal) {
        this.nomCientifico = nomCientifico;
        this.nomComun = nomComun;
        this.ordenAnimal = ordenAnimal;
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

    public String getOrdenAnimal() {
        return ordenAnimal;
    }

    public void setOrdenAnimal(String ordenAnimal) {
        this.ordenAnimal = ordenAnimal;
    }
}
