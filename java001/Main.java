import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int firstNum;
        int secondNum;

        Scanner sc = new Scanner(System.in);
        System.out.print("Please, enter the first number: ");
        firstNum = sc.nextInt();
        System.out.print("Enter the second number: ");
        secondNum = sc.nextInt();
        int sum = firstNum + secondNum;
        System.out.printf("SOMA: %d.", sum); // The exercise is in Portugues

    }
}