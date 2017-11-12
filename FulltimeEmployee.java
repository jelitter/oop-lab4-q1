package lab04.part1;

class FulltimeEmployee extends Employee {
    
    private double annualSalary;

    FulltimeEmployee(String name, double salary) {
        super(name);
        this.annualSalary = salary;
    }
    
    public double getMonthlyPay() {
        return Math.round(this.annualSalary / 12 * 100.0) / 100.0;
    }
    
    public void setAnnualSalary(double salary) {
        this.annualSalary = salary;
    }
    
    public double getAnnualSalary() {
        return this.annualSalary;
    }
    
    @Override
    public String getStatus() {
        return this.toString() + " => Is a full time employee making "
        + this.getAnnualSalary() + " euros a year, which is " 
        + this.getMonthlyPay() + " euros a month.";
    }
}
