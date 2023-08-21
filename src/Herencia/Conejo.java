package Herencia;

public class Conejo extends Mascota{
    private String razaConejo;
    private float pesoKg;
    public Conejo(String nomCientifico,
                  String nomComun,
                  String nomMascota,
                  String nomProp,
                  String razaConejo,
                  float pesoKg) {
        super(nomCientifico, nomComun, nomMascota, nomProp);
        this.razaConejo=razaConejo;
        this.pesoKg=pesoKg;
    }

    public String getRazaConejo() {
        return razaConejo;
    }

    public void setRazaConejo(String razaConejo) {
        this.razaConejo = razaConejo;
    }

    public float getPesoKg() {
        return pesoKg;
    }

    public void setPesoKg(float pesoKg) {
        this.pesoKg = pesoKg;
    }
}
