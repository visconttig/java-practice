package entities;
import java.util.Scanner;

public class Printer {
    private int tonerLevel;
    private int sheetsPrinted;
    private boolean isDoubleSide;

    public Printer(int tonerLevel, boolean isDoubleSide){
        this.tonerLevel = tonerLevel;
        sheetsPrinted = 0;
        this.isDoubleSide = isDoubleSide;
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
        if(tonerLevel >= 100){
            this.tonerLevel = 100;
            System.out.printf("\t\tNew toner level: %d.%n", getTonerLevel());
            return -1;
        } else if(tonerLevel < 0){
            throw new Error("Toner amount must be a positive number.");
        }
        if(tonerLevel != 0){
            this.tonerLevel = tonerLevel;
        }
        System.out.printf("Toner level: %d.%n", getTonerLevel());
        return this.tonerLevel;
    }

    protected void decreaseTonerLevel(int sheetsPrinted){
        this.tonerLevel -= calculateSheets(sheetsPrinted);
        System.out.printf("\t\tNew b&w toner level: %d.%n", getTonerLevel());
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
        setSheetsPrinted(sheets);
        System.out.println("Printing pages...");
        System.out.printf("Sheets printed: %d.%n", getSheetsPrinted());
        decreaseTonerLevel(pages);
        return sheets;
    }



}
