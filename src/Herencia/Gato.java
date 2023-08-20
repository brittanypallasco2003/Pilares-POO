package Herencia;

public class Gato extends Mascota{
    private String razaGato;
    private String colorPelaje;
    public Gato(String nomMascota,
                String nomProp,
                String dieta,
                String razaGato,
                String colorPelaje) {
        super(nomMascota, nomProp, dieta);
        this.colorPelaje=colorPelaje;
        this.razaGato=razaGato;
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

    public void maullar(){
        System.out.println("Si tu gato "+getNomMascota()+" maulla probablemente quiere que lo alimentes o solo te está saludando :)" );
    }
}
