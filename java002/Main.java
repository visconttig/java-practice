import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        double radius;
        double PI = 3.14159;
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Enter the radius of the circle: ");
        // Must enter raduis value using a comma as separator
        radius = sc.nextDouble();
        double areaOfCirle = (PI * (Math.pow(radius, 2)));

        System.out.printf("A: %.4f", areaOfCirle);

    }
}