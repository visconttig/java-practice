import java.util.Scanner;
import java.util.Locale;

public class  Main {
    public static void main(String[] args) {
        int itemCode;
        int itemCode2;
        int numberOfItems;
        int numberOfItems2;
        double unitPrice;
        double unitPrice2;
        double toBePayed;
        double toBePayed2;
        double total;
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Enter the item code: ");
        itemCode = sc.nextInt();
        System.out.print("Enter the number of items: ");
        numberOfItems = sc.nextInt();
        System.out.print("Enter the unitary price: ");
        unitPrice = sc.nextDouble();

        toBePayed = (unitPrice * numberOfItems);

        System.out.print("Enter the item code: ");
        itemCode2 = sc.nextInt();
        System.out.print("Enter the number of items: ");
        numberOfItems2 = sc.nextInt();
        System.out.print("Enter the unitary price: ");
        unitPrice2 = sc.nextDouble();
        sc.close();

        toBePayed2 = (unitPrice2 * numberOfItems2);
        total = (toBePayed + toBePayed2);

        System.out.printf("TO BE PAYED: %.2f%n", total);
    }
}