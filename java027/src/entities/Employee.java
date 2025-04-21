package entities;

public class Employee extends Worker {
    protected long employeeId = 1;
    private String hireDate;

    public Employee(String name){
        this(name, "00/00/0000");
    }

    public Employee(String name, String hireDate){
        super(name);
        this.hireDate = hireDate;
        employeeId = employeeId++;
    }


    @Override
    public String toString() {
        return "Employee {" +
                "employeeId=" + employeeId +
                ", hireDate='" + hireDate + '\'' +
                '}';
    }
}
