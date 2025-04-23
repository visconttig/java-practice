import java.util.Scanner;
import entities.Printer;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int pages;
        Printer printer1 = new Printer(85, true);
        System.out.print("Enter the number of pages to print: ");
        pages = sc.nextInt();
        printer1.printPages(pages);
        System.out.printf("\t\tSheets printed: %d.%n", printer1.getSheetsPrinted());
        printer1.addToner(325);
        System.out.printf("\t\tToner level: %d.%n", printer1.getTonerLevel());

    }
}
