package entities;

public class Employee extends Worker {
    private long employeeId;
    private String hireDate;

    public Employee(String name){
        super(name);
        employeeId = generateId();
        hireDate = "00/00/0000";
    }

    public Employee(String name, String hireDate){
        super(name);
        this.hireDate = hireDate;
        employeeId = generateId();
    }

    private long generateId(){
        return (long) (Math.random() * 1000000);
    }

}
