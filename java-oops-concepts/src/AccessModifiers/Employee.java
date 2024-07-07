package AccessModifiers;

public class Employee {
    private String id;
    private double salary;

    // Public getter for id
    public String getId() {
        return id;
    }

    // Private setter for id (id can be set only within this class)
    private void setId(String id) {
        this.id = id;
    }

    // Public getter for salary
    public double getSalary() {
        return salary;
    }
    private void setSalary(){
        
    }

    // Public setter for salary with validation
    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("Salary must be positive.");
        }
    }
}

