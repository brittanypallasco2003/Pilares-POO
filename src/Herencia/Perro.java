package Herencia;

public class Perro extends Mascota {
    private String razaPerro;
    private int promVida;
    public Perro(String nomCientifico,
                 String nomComun,
                 String nomMascota,
                 String nomProp,
                 String razaPerro,
                 int promVida) {
        super(nomCientifico, nomComun, nomMascota, nomProp);
        this.razaPerro=razaPerro;
        this.promVida=promVida;
    }

    public String getRazaPerro() {
        return razaPerro;
    }

    public void setRazaPerro(String razaPerro) {
        this.razaPerro = razaPerro;
    }

    public int getPromVida() {
        return promVida;
    }

    public void setPromVida(int promVida) {
        this.promVida = promVida;
    }
}
