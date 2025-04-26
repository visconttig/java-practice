import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        int employeeId;
        int workedHours;
        double hourlyRate;
        double salary;
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Enter the employee ID: ");
        employeeId = sc.nextInt();
        System.out.print("Enter the worked hours: ");
        workedHours = sc.nextInt();
        System.out.print("Enter hourly rate: ");
        hourlyRate = sc.nextDouble();

        salary = workedHours * hourlyRate;
        System.out.printf("EMPLOYEE_ID = %d%nSALARY = %.2f%n", employeeId, salary);

    }
}