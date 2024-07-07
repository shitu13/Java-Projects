package Abstraction;

abstract class Animal{
    abstract void walk();
    abstract void sleep();
    Animal(){
        System.out.println("Animal is created");
    }
    public void eat(){
        System.out.println("Animal is eating");
    }
}

class Horse extends Animal{
    Horse(){
        System.out.println("Horse is created");
    }
    @Override
    void walk(){
        System.out.println("Horse walks on 4 legs");
        }

    @Override
    void sleep() {
       System.out.println("Horse sleeps while standing");
    }
}

class Chicken extends Animal{

    @Override
    void walk() {
        System.out.println("Chicken walks on 2 legs");
    }

    @Override
    void sleep() {
        System.out.println("Chicken sleeps while sitting");
    }

}
public class Main {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walk();
        horse.sleep();
        horse.eat();
    }
}