import java.util.Scanner;

public class Main {

    private static void print(String message) {
        System.out.print(message);
    }

    public static void main(String[] args) {
        int A;
        int B;
        int C;
        int D;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        A = sc.nextInt();
        System.out.print("Enter the second number: ");
        B = sc.nextInt();
        print("Enter the third number: ");
        C = sc.nextInt();
        print("Enter the last number: ");
        D = sc.nextInt();

        int DIFFERENCE = ((A * B) - (C * D));
        System.out.printf("DIFFERENCE = %d", DIFFERENCE);

    }
}