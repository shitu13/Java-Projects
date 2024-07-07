package Introduction;
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

public class Constructor {
    public static void main(String[] args) {
        // 1st object of Student Class
        Student s1 = new Student();
        s1.name = "Ramesh Gaitonde";
        s1.roll = 2014;
        s1.age = 23;
        
        // 2nd Object of Student Class
        Student s2 = new Student("Ana De Armas", 342634, 28);
        
        // 3rd Object of Student Class
        Student s3 = new Student(s1);
        
        //Prints info for s1
        System.out.println("\nPrints info for s1");
        s1.printInfo(); 
        
        // Prints info for s2
        s2.printInfo(); 
        System.out.println("\nPrints info for s2");
        
        // Prints info for s3
        System.out.println("\nPrints info for s3- Copy Constructor");
        s3.printInfo();
        
    }
}

// Create a student class
class Student{
    String name;
    int roll;
    int age;
    
    // method non parameterized
    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.roll);
        System.out.println(this.age);
        
    }
    // non-parameterized Consturctor
    Student(){
        System.out.println("non-parameterized Constructor has been called");
    }
    
    //Parameterized Constructor
    Student(String name, int roll, int age){
        this.name = name;
        this.roll = roll;
        this.age = age;
    }
    
    // Copy Constructor
    Student(Student s1){
        this.name = s1.name;
        this.roll = s1.roll;
        this.age = s1.age;
    }
    
}