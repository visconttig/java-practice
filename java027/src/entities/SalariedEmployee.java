package entities;

public class SalariedEmployee extends Employee {
    private double annualSalary;
    private boolean isRetired = false;

    public SalariedEmployee(String name){
        super(name);
        annualSalary = 0.00;
    }

    public SalariedEmployee(String name, double annualSalary){
        super(name);
        this.annualSalary = annualSalary;
    }

    public double getAnnualSalary(){
        return annualSalary;
    }

    public boolean getRetiredStatus(){
        return isRetired;
    }

    public void retire(){
        isRetired = true;
        System.out.printf("Salaried employee %s retired.%n", getName());
    }
}
