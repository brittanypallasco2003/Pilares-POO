package Abstracción;

abstract class Vehicle {
    abstract void start();
    abstract void stop();
}

class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car started");
    }

    @Override
    void stop() {
        System.out.println("Car stopped");
    }
}

class Motorcycle extends Vehicle {
    @Override
    void start() {
        System.out.println("Motorcycle started");
    }

    @Override
    void stop() {
        System.out.println("Motorcycle stopped");
    }
}

public class abstraccionCar {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle motorcycle = new Motorcycle();

        car.start();
        car.stop();

        motorcycle.start();
        motorcycle.stop();
    }
}

