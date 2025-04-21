package entities;

public class HourlyEmployee extends Employee {
    private double hourlyPayRate;

    public HourlyEmployee(String name){
        super(name);
        hourlyPayRate = 0.00;
    }

    public HourlyEmployee(String name, double hourlyPayRate){
        super(name);
        this.hourlyPayRate = hourlyPayRate;
    }

    public void setHourlyPayRate(double hourlyPayRate){
        this.hourlyPayRate = hourlyPayRate;
    }

    public double getHourlyPayRate(){
        return hourlyPayRate;
    }

    public double getDoublePay(){
        // Again, this is an exercise about inheritance, not arithmetics
        System.out.printf("%s collected double pay.%n", getName());
        return 500.00;
    }


}






















