package Herencia;

public class Lobo extends Animal_Salv{
    private String familia;
    private String razaLobo;

    public Lobo(String nomCientifico,
                String nomComun,
                String ordenAnimal,
                String familia,
                String razaLobo) {
        super(nomCientifico, nomComun, ordenAnimal);
        this.familia=familia;
        this.razaLobo=razaLobo;
    }
    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    public String getRazaLobo() {
        return razaLobo;
    }

    public void setRazaLobo(String razaLobo) {
        this.razaLobo = razaLobo;
    }
}
