package Polimorfismo;

// Interfaz que define el método para calcular el área
interface Shape {
    double calculateArea();
}

// Clase que representa un círculo
class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Clase que representa un rectángulo
class Rectangle implements Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);

        // Polimorfismo: Ambos objetos pueden ser tratados de manera uniforme
        // a través de la interfaz "Shape"
        System.out.println("Área del círculo: " + circle.calculateArea());
        System.out.println("Área del rectángulo: " + rectangle.calculateArea());
    }
}

