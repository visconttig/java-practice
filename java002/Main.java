import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        double radius;
        double PI = 3.14159;
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        radius = sc.nextDouble();
        double areaOfCircle = (PI * (Math.pow(radius, 2)));

        System.out.printf("A: %.4f", areaOfCircle);

    }
}