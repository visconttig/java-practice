package entities;

public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name){
        this(name, 0.00, 0);
    }

    public Product(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        printInfo();
    }

    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }

    public int getQuantity(){
        return quantity;
    }

    public double getTotalValueInStock(){
        return price * quantity;
    }

    public void addProducts(int quantity){
        this.quantity += quantity;
        System.out.println("Updated info: ");
        printInfo();
    }

    public void removeProducts(int quantity){
        this.quantity -= quantity;
        System.out.println("Updated info: ");
        printInfo();
    }


    private void printInfo(){
        System.out.printf("\t\t\t\tName: %s, $ %.2f, %d units, Total: %.2f.%n",
                getName(), getPrice(), getQuantity(), getTotalValueInStock());
    }


}
