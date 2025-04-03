import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
       Scanner sc = new Scanner(System.in);
       double salary = 0.00;
       double taxes = 0.00;
       System.out.print("Enter the salary: ");
       salary = sc.nextDouble();

       if(salary <= 0){
           throw new Error("The salary must be a positive number.");
       } else {
           if(salary <= 2000){
               // exempt from taxes
               taxes = 0.00;
               System.out.printf("Exempt from taxes: %.2f%n", applyTaxes(salary, taxes));
           } else {
               if(salary <= 3000){
                   // apply 8%
                   taxes = 8.00;
                   System.out.printf("Applied 8 per cent of taxes: %.2f%n", applyTaxes(salary, taxes));
               } else {
                   if(salary <= 4500){
                       // apply 18%
                       taxes = 18.00;
                       System.out.printf("Applied 18 per cent of taxes: %.2f%n", applyTaxes(salary, taxes));
                   } else {
                       // apply 28%
                       taxes = 28.00;
                       System.out.printf("Applied 28 per cent of taxes: %.2f%n", applyTaxes(salary, taxes));
                   }
               }
           }
       }

       sc.close();
    }

    private static double applyTaxes(double salary, double taxes){
        return salary * (1 + (taxes / 100));
    }
}
