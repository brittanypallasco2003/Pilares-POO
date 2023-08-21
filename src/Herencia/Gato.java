package Herencia;

public class Gato extends Mascota {
    private String razaGato;
    private String colorPelaje;
    public Gato(String nomCientifico,
                String nomComun,
                String nomMascota,
                String nomProp,
                String razaGato,
                String colorPelaje) {
        super(nomCientifico, nomComun, nomMascota, nomProp);
        this.razaGato=razaGato;
        this.colorPelaje=colorPelaje;
    }

    public String getRazaGato() {
        return razaGato;
    }

    public void setRazaGato(String razaGato) {
        this.razaGato = razaGato;
    }

    public String getColorPelaje() {
        return colorPelaje;
    }

    public void setColorPelaje(String colorPelaje) {
        this.colorPelaje = colorPelaje;
    }
}
