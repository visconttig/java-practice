import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int x = sc.nextInt();

        if (x % 2 == 0) {
            System.out.printf("Is even: %d%n", x);
        } else {
            System.out.printf("Not even: %d%n", x);
        }

        sc.close();
    }
}