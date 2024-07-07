package Abstraction;

interface Animal{
    abstract void walk();
    abstract void sleep();
    public void eat();
}

class Horse implements Animal{
    Horse(){
        System.out.println("Horse is created");
    }
    @Override
    public void walk(){
        System.out.println("Horse walks on 4 legs");
        }

    @Override
    public void sleep() {
       System.out.println("Horse sleeps while standing");
    }
    @Override
    public void eat() {
        System.out.println("Horse is always eating");
    }
}

class Chicken implements Animal{

    @Override
    public void walk() {
        System.out.println("Chicken walks on 2 legs");
    }

    @Override
    public void sleep() {
        System.out.println("Chicken sleeps while sitting");
    }

    @Override
    public void eat() {
        System.out.println("Chicken is always eating.");
    }

}
public class Main1 {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walk();
        horse.sleep();
        horse.eat();
    }
}
