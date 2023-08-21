package Polimorfismo.PolimorfismoEj2;

public class Polimorfismo {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        Animal animal2 = new Perro();
        Animal animal3 = new Gato();

        animal1.hacerSonido();
        animal2.hacerSonido();
        animal3.hacerSonido();
    }
}
