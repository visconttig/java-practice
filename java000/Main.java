import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name?");
        String userName = sc.nextLine();
        // System.out.println(userName);
        System.out.printf("Hello!! %s.", userName);
        sc.close();
    }
}