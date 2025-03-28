import java.util.Scanner;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        double userInput = 0.00;
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter a number (double): ");
        userInput = sc.nextDouble();

        /*
         * Intervals:
         * [0, 25]
         * (25, 50]
         * (50, 75]
         * (75, 100]
         */

        if ((userInput >= 0) && (userInput <= 25)) {
            System.out.printf("%.2f: Interval [0, 25]", userInput);
        } else if ((userInput > 25) && (userInput <= 50)) {
            System.out.printf("%.2f: Interval (25, 50]", userInput);
        } else if ((userInput > 50) && (userInput <= 75)) {
            System.out.printf("%.2f: Interval (50, 75]", userInput);
        } else if ((userInput > 75) && (userInput <= 100)) {
            System.out.printf("%.2f: Interval (75, 100]", userInput);
        } else {
            System.out.printf("%.2f: Out of Interval.", userInput);
        }

        sc.close();
    }

}