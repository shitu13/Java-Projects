public class Car {
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
