package entities;
import java.util.Scanner;

public class Printer {
    private int tonerLevel;
    private int sheetsPrinted;
    private boolean isDoubleSide;

    public Printer(){
        this(100, false);
        this.sheetsPrinted = 0;
    }

    public Printer(int tonerLevel, boolean isDoubleSide){
        this.tonerLevel = tonerLevel;
        this.isDoubleSide = isDoubleSide;
        this.sheetsPrinted = 0;
    }

    public int getTonerLevel(){
        return tonerLevel;
    }

    public int getSheetsPrinted(){
        return sheetsPrinted;
    }

    public boolean getIsDoubleSide(){
        return isDoubleSide;
    }

    protected void setSheetsPrinted(int sheetsPrinted){
        this.sheetsPrinted += sheetsPrinted;
    }

    public int addToner(int tonerLevel){
        System.out.println("Adding toner...");
        if((this.tonerLevel + tonerLevel) >= 100){
            this.tonerLevel = 100;
            System.out.printf("\t\tNew toner level: %d.%n", getTonerLevel());
            return -1;
        } else if(tonerLevel < 0){
            System.out.println("Toner amount must be a positive number.");
            return -2;
        }
        if(tonerLevel != 0){
            this.tonerLevel += tonerLevel;
        }
        System.out.printf("Black toner level: %d.%n\t\t***\t\t***%n", getTonerLevel());
        return this.tonerLevel;
    }

    protected void decreaseTonerLevel(int sheetsPrinted){
        this.tonerLevel -= calculateSheets(sheetsPrinted);
        System.out.printf("\t\tNew b&w toner level: %d.%n\t\t***\t\t***%n", getTonerLevel());
    }

    protected int calculateSheets(int pages){
        return (int)((pages % 2 == 0) ? (pages / 2) : ((pages / 2) + 1));
    }

    protected int calculateSheets(int pages, boolean isDoubleSide){
        if(isDoubleSide){
            return pages;
        } else {
            return calculateSheets(pages);
        }
    }

    public int printPages(int pages){
        int sheets = calculateSheets(pages, getIsDoubleSide());
        if((getTonerLevel() - sheets) >= 0){
            System.out.println("Printing pages...");
            setSheetsPrinted(sheets);
            System.out.printf("Sheets printed: %d.%n", getSheetsPrinted());
            decreaseTonerLevel(pages);
            return sheets;
        } else {
            System.out.printf("Not enough toner for printing that number of pages.%n" +
                                      "Max number of pages to print: %d.%n\t\t***\t\t***%n",
                              (getTonerLevel() * 2));
        }

        return -1;
    }



}
