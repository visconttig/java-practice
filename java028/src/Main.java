import entities.Product;
import java.util.Locale;
import java.util.Scanner;


public class Main {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        String name;
        double price;
        int quantity;

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        name = sc.next();
        System.out.print("Price ");
        price = sc.nextDouble();
        System.out.print("Quantity: ");
        quantity = sc.nextInt();

        Product product1 = new Product(name, price, quantity);
        int addToStock;
        System.out.print("Enter the number of products to be added to stock: ");
        addToStock = sc.nextInt();
        product1.addProducts(addToStock);
        int removeFromStock;
        System.out.print("Enter the number of products to remove from stock: ");
        removeFromStock = sc.nextInt();
        product1.removeProducts(removeFromStock);





    }
}
