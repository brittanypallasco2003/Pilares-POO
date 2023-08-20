package Herencia;
public class Perro extends Mascota {

    private String razaPerro;
    private int promVida;
    public Perro(String nomMascota,
                 String nomProp,
                 String dieta,
                 String razaPerro,
                 int promVida) {
        super(nomMascota, nomProp, dieta);
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

    public void alimentarse(){
        System.out.println("Necesitan consumir entre 1300 y 3500 calorías por día");
    }
}
