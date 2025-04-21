import entities.Employee;
import entities.Worker;
import entities.SalariedEmployee;
import entities.HourlyEmployee;


public class Main {
    public static void main(String[] args){
        SalariedEmployee mary = new SalariedEmployee("Mary");
        mary.retire();
        HourlyEmployee john = new HourlyEmployee("John", 99.99);
        john.getDoublePay();

    }

}
