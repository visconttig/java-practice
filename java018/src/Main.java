import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int consumedDiesel = 0;
        int consumedAlcohol = 0;
        int consumedGasoline = 0;
        final int EXIT_COMMAND = 4;
        int type = 0;

        do {
        System.out.print("Select the type of gas that you want: ");
        type = sc.nextInt();

        switch (type){
            case 1:
                consumedAlcohol++;
                break;
            case 2:
                consumedGasoline++;
                break;
            case 3:
                consumedDiesel++;
                break;
            case 4:
                break;
            default:
                System.out.printf("Invalid type: %d%n", type);
        }
        } while(type != 4);

        System.out.printf("Thank you! %nAlcohol: %d %nGasoline: %d %nDiesel: %d",
                consumedAlcohol,
                consumedGasoline,
                consumedDiesel);


        sc.close();
    }
}
