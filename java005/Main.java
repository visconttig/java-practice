import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int itemCode;
        int numberOfItems;
        double unitPrice;
        double toBePayed;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the item code: ");
        itemCode = sc.nextInt();
        System.out.print("Enter the number of items: ");
        numberOfItems = sc.nextInt();
        System.out.print("Enter the unitary price: ");
        unitPrice = sc.nextDouble();

    }
}