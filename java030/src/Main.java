import java.util.Scanner;

import entities.ColorPrinter;
import entities.Printer;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int pages;
        Printer printer1 = new Printer(85, true);

        // Regular printing
        System.out.print("Enter the number of pages to print: ");
        pages = sc.nextInt();
        printer1.printPages(pages);
//        System.out.printf("\t\tSheets printed: %d.%n", printer1.getSheetsPrinted());

        // Adding toner
        System.out.print("Enter the amount of toner to add: ");
        int tonerLevel = sc.nextInt();
        printer1.addToner(tonerLevel);
//        System.out.printf("\t\tToner level: %d.%n", printer1.getTonerLevel());

        ColorPrinter colorPrinter = new ColorPrinter(95,
                                                true,
                                                100);

        // Adding color toner
        System.out.print("Enter the amount of black toner to add: ");
        int blackToner = sc.nextInt();
        System.out.print("Enter the amount of color toner to add: ");
        int colorToner = sc.nextInt();
        colorPrinter.addToner(blackToner, colorToner);

        System.out.print("Enter the number of b&w pages to print: ");
        pages = sc.nextInt();
        System.out.print("Enter the number of color pages to print: ");
        pages = sc.nextInt();
        colorPrinter.printPages(pages);

        colorPrinter.printColorPages(21);

    }
}
