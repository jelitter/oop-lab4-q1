package lab04.part1;

abstract class Employee {
    
    private static int _id = 0;
    private String name;
    private int id;
    
    public Employee(String name) {
        this.setName(name);
        this.id = ++Employee._id;
    }
    
    public abstract String getStatus();
    
    public void printStatus() {
        System.out.println(this.getStatus());
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getID() {
        return this.id;
    }
    
    public String toString() {
        return "Employee ID " + this.getID() + ": " + this.getName();
    }
    public void print() {
        System.out.println(this);
    }
}

