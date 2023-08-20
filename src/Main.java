import Herencia.*;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {

        //ARREGLOS DE OBJETOS
        ArrayList<Gato> gatos=new ArrayList<Gato>();


        //OBJETO DE ENTRADA
        Scanner entrada= new Scanner(System.in);

        //VALORES DONDE SE GUARDARÁN LOS VALORES INGRESADOS POR TECLADO
        int opc=0;
        String tipoMascota, nomMascota, nomProp, dieta, razaGato,colorPelaje;

        do {
            System.out.println("------------------Pilares de POO------------------");
            System.out.println("1. Abstracción:");
            System.out.println("2. Encapsulamieto");
            System.out.println("3. Herencia");
            System.out.println("4. Polimorfismo");
            System.out.println("5. Salir");
            opc=entrada.nextInt();
            entrada.nextLine();
            switch (opc){
                case 1:
                    System.out.println("Abstracción");
                    break;
                case 2:
                    System.out.println("Encapsulamiento");
                    break;
                case 3:
                    System.out.println("Herencia");
                    int opcHerencia=0;
                    do{
                        System.out.println("1. Herencia Única");
                        System.out.println("2. Herencia Jerárquica");
                        System.out.println("3. Herencia Multinivel");
                        System.out.println("4. Volver al menu Principal");
                        opcHerencia=entrada.nextInt();
                        entrada.nextLine();
                        switch (opcHerencia){
                            case 1:
                                    int ngatos=0;
                                    System.out.println("Cuántos gatos tiene?: ");
                                    ngatos=entrada.nextInt();
                                    entrada.nextLine();
                                    for(int i=0; i<ngatos; i++) {
                                        System.out.println("Info de Gato "+(i+1)+": ");
                                        System.out.print("Ingrese su nombre: ");
                                        nomProp=entrada.nextLine();
                                        System.out.print("Ingrese el nombre de su gato: ");
                                        nomMascota=entrada.nextLine();
                                        System.out.print("Ingrese la dieta de "+nomMascota+": ");
                                        dieta=entrada.nextLine();
                                        System.out.print("Ingrese la raza de "+nomMascota+": ");
                                        razaGato=entrada.nextLine();
                                        System.out.print("Ingrese el color del Pelaje de "+nomMascota+": ");
                                        colorPelaje=entrada.nextLine();
                                        gatos.add(new Gato(nomMascota, nomProp, dieta, razaGato, colorPelaje));
                                    }
                                    ngatos=0;
                                    for (Gato gato: gatos){
                                        System.out.println("----------Info de: "+gato.getNomMascota()+"----------");
                                        System.out.println("Propietario: "+gato.getNomProp());
                                        System.out.println("Dieta: "+gato.getDieta());
                                        System.out.println("Raza: "+gato.getRazaGato());
                                        System.out.println("Color del Pelaje: "+gato.getColorPelaje());
                                    }
                                break;
                            case 2:
                                break;
                        }
                    }while (opcHerencia!=4);
                    break;
            }
        }while (opc!=5);
    }

}