package lab04.part1;

class PartTimeEmployee extends Employee {
    
    private double hourlyPay;

    PartTimeEmployee(String name, double hourlyPay) {
        super(name);
        this.hourlyPay = hourlyPay;
    }
    
    public double getWeeklyPay(int hours) {
        return this.getHourlyPay() * hours;
    }
    
    public double getHourlyPay() {
        return this.hourlyPay;
    }
    
    public void setHourlyPay(double pay) {
        this.hourlyPay = pay;
    }
    
    @Override
    public String getStatus() {
        return this.toString() + " => Is a part time employee making " 
        + this.getHourlyPay() + " euros an hour, which is " 
        + this.getWeeklyPay(20) + " euros a week.";
    }
}
