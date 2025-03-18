import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = 3;
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            int x = sc.nextInt();
            sum += x;
        }

        System.out.printf("Sum: %d%n", sum);

        sc.close();
    }
}