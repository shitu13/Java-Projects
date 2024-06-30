public class Hero {
    int health;
    char name;
    
    //No argument Constructor
    Hero(){
        System.out.println("Simple Constructor");
    }

    // Parameterized Constructor
    Hero(int health){
        this.health = health;
        System.out.println("Health is called");
    }

    void fight(char name){
        System.out.println(name + " can fight");
    }
}
