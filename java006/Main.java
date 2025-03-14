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
        final double TRIANGLE = ((A * C) / 2);
        final double CIRCLE = (PI * (Math.pow(C, 2)));
        final double TRAPEZOID = (((A + B) / 2) * C);
        final double SQUARE = (Math.pow(B, 2));
        final double RECTANGLE = (A * B);

        System.out.printf("TRIANGLE: %.2f%n", TRIANGLE);
        System.out.printf("CIRCLE: %.2f%n", CIRCLE);
        System.out.printf("TRAPEZOID: %.2f%n", TRAPEZOID);
        System.out.printf("SQUARE: %.2f%n", SQUARE);
        System.out.printf("RECTANGLE: %.2f%n", RECTANGLE);
    }
}