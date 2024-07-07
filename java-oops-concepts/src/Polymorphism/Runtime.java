/*
 * Method Overriding: A subclass can provide a specific implementation of a method that is already defined in its superclass.
 * super Keyword: Used to refer to the immediate superclass object. It can be used to access superclass methods and constructors.
 * Constructor Chaining: When a subclass constructor is invoked, it implicitly calls the superclass constructor, forming a chain 
 *                        of constructors from the subclass to the topmost superclass.
 */

package Polymorphism;

class Animal {
    Animal() {
        System.out.println("Animal constructor called");
    }

    void display() {
        System.out.println("This is an animal");
    }
}

class Dog extends Animal {
    Dog() {
        super(); // Calls the constructor of Animal
        System.out.println("Dog constructor called");
    }

    @Override
    void display() {
        super.display(); // Calls display() method of Animal
        System.out.println("This is a dog");
    }
}

public class Runtime {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.display();
    }
}
