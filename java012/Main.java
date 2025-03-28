import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int code;
        double price = 0;
        int quantity = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the code of the product: ");
        code = sc.nextInt();
        System.out.print("Enter the quantity: ");
        quantity = sc.nextInt();

        switch (code) {
            case 1:
                price = 4.00;
                break;
            case 2:
                price = 4.50;
                break;
            case 3:
                price = 5.00;
                break;
            case 4:
                price = 2.00;
                break;
            case 5:
                price = 1.50;
                break;
            default:
                sc.close();
                throw new Error("That product does not exist.");
        }

        double total = (price * quantity);
        System.out.printf("Total: $ %.2f%n", total);
        sc.close();
    }
}