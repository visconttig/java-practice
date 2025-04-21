import entities.Employee;
import entities.SalariedEmployee;
import entities.HourlyEmployee;
import entities.Worker;


public class Main {
    public static void main(String[] args){
        Worker anny = new Worker("Anny", "01/03/2000", "31/12/2030");
        System.out.println(anny);
        System.out.println(anny.collectPay());
        Employee roman = new Employee("Roman");
        System.out.println(roman);
        SalariedEmployee mary = new SalariedEmployee("Mary");
        mary.retire();
        HourlyEmployee john = new HourlyEmployee("John", 99.99);
        john.getDoublePay();
        john.getAge();

    }

}
