package Herencia;
public class Conejo extends Mascota{
    private String razaConejo;
    private float pesoKg;

    public Conejo(String nomMascota,
                  String nomProp,
                  String dieta,
                  String razaConejo,
                  float pesoKg) {
        super(nomMascota, nomProp, dieta);
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
