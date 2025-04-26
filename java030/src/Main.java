import java.util.InputMismatchException;
import java.util.Scanner;

import entities.ColorPrinter;
import entities.Printer;

public class Main {
    public static void main(String[] args){
        int pages;

        try (Scanner sc = new Scanner(System.in)) {
            /* ************* Regular printer ***************** */
            Printer printer1 = new Printer(85, true);
            System.out.print("Enter the number of pages to print: ");
            pages = sc.nextInt();
            printer1.printPages(pages);

            // Adding toner
            System.out.print("Enter the amount of toner to add: ");
            int tonerLevel = sc.nextInt();
            printer1.addToner(tonerLevel);


            /* ************* Color printer ***************** */
            ColorPrinter colorPrinter = new ColorPrinter(95,
                                                         true,
                                                         100);

            System.out.print("Enter the number of b&w pages to print: ");
            pages = sc.nextInt();
            colorPrinter.printPages(pages);
            System.out.print("Enter the number of color pages to print: ");
            pages = sc.nextInt();
            colorPrinter.printColorPages(pages);

            // Adding toner
            System.out.print("Enter the amount of black toner to add: ");
            int blackToner = sc.nextInt();
            System.out.print("Enter the amount of color toner to add: ");
            int colorToner = sc.nextInt();
            colorPrinter.addToner(blackToner, colorToner);
        } catch (InputMismatchException e) {
            System.out.println("You should enter a valid number.");
        } catch (Exception e) {
            System.out.printf("An error occurred: %s.%n", e.getMessage());
        }

    }
}
