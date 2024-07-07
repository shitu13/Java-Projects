package Introduction;
/*
 * Classes and Objects in Java.
 */

public class Main {
    public static void main(String[] args) {
        // Creating objects from the Car class
        Car car1 = new Car("Red", "Toyota", 2020);
        Car car2 = new Car("Blue", "Honda", 2019);

        // Accessing fields and methods
        car1.displayInfo();  // Output: Car model: Toyota, Color: Red, Year: 2020
        car1.startEngine();  // Output: Engine started.

        car2.displayInfo();  // Output: Car model: Honda, Color: Blue, Year: 2019
        car2.stopEngine();   // Output: Engine stopped.
    }
}

class Car {
    // Fields (or instance variables)
    String color;
    String model;
    int year;

    // Constructor
    public Car(String color, String model, int year) {
        this.color = color;
        this.model = model;
        this.year = year;
    }

    // Methods
    public void displayInfo() {
        System.out.println("Car model: " + model + ", Color: " + color + ", Year: " + year);
    }

    public void startEngine() {
        System.out.println("Engine started.");
    }

    public void stopEngine() {
        System.out.println("Engine stopped.");
    }
}
