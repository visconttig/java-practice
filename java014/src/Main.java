import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args){
        double x;
        double y;
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the 'x' coordinate: ");
        x = sc.nextDouble();
        System.out.print("Enter the 'y' coordinate: ");
        y = sc.nextDouble();

        if(((x == 0) || (y == 0)) && (x != y)){
            if(x == 0){
                System.out.println("The point is in line 'X'");
                System.exit(0);
            } else {
                System.out.println("The point in in line 'Y'");
                System.exit(0);
            }
        }
        if(x == 0 ){
            if(y > 0){
                System.out.println("Q1/Q2");
            } else if(y < 0){
                System.out.println("Q3/Q4");
            } else {
                System.out.println("The point is in Origin.");
            }
        } else if(x > 0){
                if(y > 0){
                    System.out.println("Q1");
                } else {
                    System.out.println("Q4");
                }
            } else {
                if(y > 0){
                    System.out.println("Q2");
                } else {
                    System.out.println("Q3");
                }
            }
        }

}
