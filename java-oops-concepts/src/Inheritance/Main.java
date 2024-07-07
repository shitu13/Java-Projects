package Inheritance;

// Superclass
class Animal {
    void eat() {
        System.out.println("This animal eats.");
    }
}

// Subclass
class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        
        // Calling method from superclass
        myDog.eat(); // This animal eats.
        
        // Calling method from subclass
        myDog.bark(); // The dog barks.
    }
}

