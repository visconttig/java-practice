import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numbersToRead = 0;

        System.out.print("Enter the number of values to read: ");
        numbersToRead = sc.nextInt();

        for(int i = 0; i<numbersToRead; i++){
            System.out.print("Enter a number: ");
            double a = sc.nextDouble();
            System.out.print("Enter a second number: ");
            double b = sc.nextDouble();

            if(b == 0){
                System.out.printf("Impossible division: %.2f/%.2f%n", a, b);
            } else {
                System.out.printf("%.2f%n", a / b);
            }
        }
    }
}
