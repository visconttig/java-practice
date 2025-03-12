import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        double A;
        double B;
        double C;
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Enter the first value: ");
        A = sc.nextDouble();
        System.out.print("Enter the second value: ");
        B = sc.nextDouble();
        System.out.print("Enter the third value: ");
        C = sc.nextDouble();
        sc.close();
        final double PI = 3.14159;
        final double TRIANGULO = (A * C) / 2;
        final double CIRCULO = (PI * (Math.pow(C, 2)));
    }
}