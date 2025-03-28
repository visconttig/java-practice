import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int begginingHour;
        int endingHour;
        int duration = 0;

        System.out.print("Enter the beggining hour: ");
        begginingHour = sc.nextInt();
        System.out.print("Enter the ending hour: ");
        endingHour = sc.nextInt();

        if (begginingHour == endingHour) {
            duration = 24;
        } else if (begginingHour > endingHour) {
            duration = (24 - begginingHour) + endingHour;
        } else {
            duration = endingHour - begginingHour;
        }

        System.out.printf("Duration: %d hour(s)%n", duration);

        sc.close();
    }
}