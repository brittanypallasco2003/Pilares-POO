package Herencia;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //ARREGLO DE OBJETOS
        ArrayList<Perro>perros=new ArrayList<>();
        ArrayList<Gato>gatos=new ArrayList<>();
        ArrayList<Conejo>conejos=new ArrayList<>();
        ArrayList<Lobo>lobos=new ArrayList<>();

        //VARIABLES
        int opcMain=0, ngatos, nPerros,nconejos,nLobos, opcJerarquico;
        String nomProp, nomMascota,nomCientifico,razaConejo, orden,familia, razaLobo;
        float pesoKg;

        //OBJETO DE ENTRADA
        Scanner entrada=new Scanner(System.in);

        do{
            System.out.println("---------------HERENCIA---------------");
            System.out.println("1. Herencia Única");
            System.out.println("2. Herencia Jerárquica");
            System.out.println("3. Herencia Multinivel");
            opcMain=entrada.nextInt();
            entrada.nextLine();
            switch (opcMain){
                case 1:
                    System.out.println("Ingrese el número de Gatos"); ngatos=entrada.nextInt();
                    entrada.nextLine();
                    ingresarGatos(gatos, ngatos, entrada);
                    recorrerGatos(gatos);
                    break;
                case 2:
                    do {
                        System.out.println("Escriba el literal de cualquiera de las siguientes mascotas : \n1. Perro\n2. Gato\n3. Conejo\n4. Volver al menú principal");
                        opcJerarquico=entrada.nextInt();
                        switch (opcJerarquico){
                            case 1:
                            System.out.println("Ingrese el número de Perros");
                            nPerros=entrada.nextInt();
                                ingresarPerros(perros, nPerros, entrada);
                                for (Perro perro : perros) {
                                System.out.println("----------Info de: " + perro.getNomMascota() + "----------");
                                System.out.println("Propietario: " + perro.getNomProp());
                                System.out.println("Raza: " + perro.getRazaPerro());
                                System.out.println("Color del Pelaje: " + perro.getPromVida());
                            }
                            break;//fin case 1
                            case 2:
                                System.out.println("Ingrese el número de Gatos"); ngatos=entrada.nextInt();
                                entrada.nextLine();
                                ingresarGatos(gatos, ngatos, entrada);
                                recorrerGatos(gatos);
                                break;
                            case 3:
                                System.out.println("Ingrese el número de Conejos"); nconejos=entrada.nextInt();
                                for (int i = 0; i < nconejos; i++) {
                                    System.out.println("Info de Conejo " + (i + 1) + ": ");
                                    entrada.nextLine();
                                    System.out.print("Ingrese su nombre: ");
                                    nomProp = entrada.nextLine();
                                    System.out.print("Ingrese el nombre de su conejo: ");
                                    nomMascota = entrada.nextLine();
                                    System.out.print("Ingrese la raza de " + nomMascota + ": ");
                                    razaConejo = entrada.nextLine();
                                    System.out.print("Ingrese el peso de " + nomMascota + ": ");
                                    pesoKg = entrada.nextFloat();
                                    conejos.add(new Conejo("","",nomMascota, nomProp, razaConejo, pesoKg));
                                }
                                for (Conejo conejo : conejos) {
                                    System.out.println("----------Info de: " + conejo.getNomMascota() + "----------");
                                    System.out.println("Propietario: " + conejo.getNomProp());
                                    System.out.println("Raza: " + conejo.getRazaConejo());
                                    System.out.println("Color del Pelaje: " + conejo.getPesoKg());
                                }
                                break;
                        }//fin de swicht jerarrquico
                    }while (opcJerarquico!=4);//fin do jerarquico--> case 2
                    break;//fin herencia jerarquica
                case 3:
                    System.out.println("Ingrese el nombre cientifico del perro o del lobo");
                    nomCientifico=entrada.nextLine();
                    if(nomCientifico.equals("Canis lupus familiaris")){
                        System.out.println("Ingrese el número de Perros");
                        nPerros=entrada.nextInt();
                        ingresarPerros(perros, nPerros, entrada);
                        for (Perro perro : perros) {
                            System.out.println("----------Info de: " + perro.getNomMascota() + "----------");
                            perro.setNomCientifico(nomCientifico);
                            System.out.println("Nombre Científico: "+perro.getNomCientifico());
                            System.out.println("Propietario: " + perro.getNomProp());
                            System.out.println("Raza: " + perro.getRazaPerro());
                            System.out.println("Color del Pelaje: " + perro.getPromVida());
                        }
                    } else if (nomCientifico.equals("Canis lupus")) {
                        System.out.println("Ingrese el numero de Lobos: ");
                        nLobos=entrada.nextInt();
                        for (int i=0; i<nLobos; i++){
                            System.out.println("Info de Lobo " + (i + 1) + ": ");
                            entrada.nextLine();
                            System.out.print("Ingrese el orden: ");
                            orden = entrada.nextLine();
                            System.out.print("Ingrese la raza: ");
                            razaLobo = entrada.nextLine();
                            System.out.print("Ingrese la familia a la que pertenece: " + razaLobo+ ": ");
                            familia = entrada.nextLine();
                            lobos.add(new Lobo(nomCientifico,"",orden,familia,razaLobo));
                        }
                        for (Lobo lobo : lobos) {
                            System.out.println("----------Info de: " + lobo.getRazaLobo() + "----------");
                            System.out.println("Nombre Científico: "+lobo.getNomCientifico());
                            System.out.println("Orden: " + lobo.getOrdenAnimal());
                            System.out.println("familia: " + lobo.getFamilia());
                        }
                    }
                    break;
            }//fin del switch main
        }while (opcMain!=4);
        //fin do main
    }

    private static void ingresarPerros(ArrayList<Perro> perros, int nPerros, Scanner entrada) {
        String nomProp;
        String nomMascota;
        String razaPerro;
        int promVida;
        for (int i = 0; i < nPerros; i++) {
            System.out.println("Info de Perro " + (i + 1) + ": ");
            entrada.nextLine();
            System.out.print("Ingrese su nombre: ");
            nomProp = entrada.nextLine();
            System.out.print("Ingrese el nombre de su perro: ");
            nomMascota = entrada.nextLine();
            System.out.print("Ingrese la raza de " + nomMascota + ": ");
            razaPerro = entrada.nextLine();
            System.out.print("Ingrese el promedio de vida de los " + razaPerro + ": ");
            promVida = entrada.nextInt();
            perros.add(new Perro("","",nomMascota, nomProp, razaPerro, promVida));
        }
    }

    private static void recorrerGatos(ArrayList<Gato> gatos) {
        for (Gato gato : gatos) {
            System.out.println("----------Info de: " + gato.getNomMascota() + "----------");
            System.out.println("Propietario: " + gato.getNomProp());
            System.out.println("Raza: " + gato.getRazaGato());
            System.out.println("Color del Pelaje: " + gato.getColorPelaje());
        }
    }

    private static void ingresarGatos(ArrayList<Gato> gatos, int ngatos, Scanner entrada) {
        String nomProp;
        String nomMascota;
        String razaGato;
        String colorPelaje;
        for (int i = 0; i<ngatos; i++){
            System.out.println("Info de Gato " + (i + 1) + ": ");
            System.out.print("Ingrese su nombre: ");
            nomProp = entrada.nextLine();
            System.out.print("Ingrese el nombre de su gato: ");
            nomMascota = entrada.nextLine();
            System.out.print("Ingrese la raza de " + nomMascota + ": ");
            razaGato = entrada.nextLine();
            System.out.print("Ingrese el color del Pelaje de " + nomMascota + ": ");
            colorPelaje = entrada.nextLine();
            gatos.add(new Gato("","",nomMascota, nomProp, razaGato, colorPelaje));
        }
    }
}
