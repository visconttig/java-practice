import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        final int password = 2002;
        Scanner sc = new Scanner(System.in);
        int userInput;

        do {
          System.out.print("Enter your password: ");
          userInput = sc.nextInt();
            if(userInput != password){
              System.out.println("Wrong password.");
            }
        } while (userInput != password);

        System.out.println("Access permitted");
    }
}
