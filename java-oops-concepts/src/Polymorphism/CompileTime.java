package Polymorphism;


/*
Method overloading 
Method overloading is the compile-time polymorphism where more than one methods share the same name
 with different parameters or signature and different return type.
*/
public class CompileTime {
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.printInfo(25);
        s1.printInfo("Dakota Jhonson", 322832);

        Student s2 = new Student("Sophie Turner", 28, 322832);

        s2.printInfo(s2.name, s2.roll);
    }
    
}


class Student{
    String name;
    int age;
    int roll;

    Student(){
    }

    Student(String name, int age, int roll){
        this.name = name;
        this.age = age;
        this.roll = roll;
    }

    public void printInfo(String name){
        System.out.println(name);
    }

    public void printInfo(int age){
        System.out.println(age);
    }

    public void printInfo(String name, int roll){
        System.out.println("Name is "+name + "And roll number is: " + roll);
    }

}
