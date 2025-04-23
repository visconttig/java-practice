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

    public int addToner(int tonerLevel){
        if(tonerLevel > 100){
            this.tonerLevel = 100;
            System.out.printf("Toner level: %d.%n", getTonerLevel());
            return -1;
        } else if(tonerLevel > 0){
            throw new Error("Toner amount must be a positive number.");
        }
        this.tonerLevel = tonerLevel;
        System.out.printf("Toner level: %d.%n", getTonerLevel());
        return tonerLevel;
    }

    public int printPages(int pages){
        int sheets = (pages % 2 == 0) ? ( pages / 2) : ((pages / 2) + (pages % 2));
        sheetsPrinted += sheets;
        System.out.println("Printing pages...");
        System.out.printf("Sheets printed: %d.%n", getSheetsPrinted());
        return sheets;
    }



}
