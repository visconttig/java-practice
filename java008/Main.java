import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        if (x < 0) {
            System.out.printf("NEGATIVE: %d%n", x);
        } else {
            System.out.printf("NOT NEGATIVE: %d%n", x);
        }

        sc.close();

    }
}