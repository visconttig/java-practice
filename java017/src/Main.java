import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int x = 0;
        int y = 0;


        do {
        System.out.print("Enter the first coordinate: ");
        x = sc.nextInt();
        System.out.print("Enter the second coordinate: ");
        y = sc.nextInt();

        if( x > 0){
            if(y > 0){
                System.out.printf("First: %d, %d%n", x, y);
            } else {
                System.out.printf("Fourth: %d, %d%n", x, y);
            }
        } else {
            if(y > 0){
                 System.out.printf("Second: %d, %d%n", x, y);
            } else {
                System.out.printf("Third: %d, %d%n", x, y);
            }
        }

        } while ( (x != 0) && (y != 0 ) );


        sc.close();
    }
}
