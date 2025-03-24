import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please, enter a number: ");
        int x = sc.nextInt();
        System.out.print("Enter the second number: ");
        int y = sc.nextInt();

        if ((x % y == 0) || (y % x == 0)) {
            System.out.printf("The numbers are multiple: x - %d, y - %d.", x, y);
        } else {
            System.out.printf("The numbers are not multiple: x - %d, y - %d.", x, y);
        }
    }
}