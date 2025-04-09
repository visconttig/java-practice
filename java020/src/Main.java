import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numberOfValues = 0;
        int inInterval = 0;
        int outOfInterval = 0;

        System.out.print("Enter the number of values to read: ");
        numberOfValues = sc.nextInt();

        for(int i = 0; i<numberOfValues; i++){
            System.out.print("Enter a value: ");
            int value = sc.nextInt();

            if((value >= 10) && (value <= 20)){
                inInterval++;
            } else {
                outOfInterval++;
            }

        }

        System.out.printf("In interval: %d%n", inInterval);
        System.out.printf("Out of Interval: %d%n", outOfInterval);

        sc.close();
    }
}
