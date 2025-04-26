package entities;

public class ColorPrinter extends Printer {
    private int colorTonerLevel;

    public ColorPrinter(){
        this(100, false, 100);
    }

    public ColorPrinter(int tonerLevel,
                        boolean isDoubleSide,
                        int colorTonerLevel){
        super(tonerLevel, isDoubleSide);
        if((colorTonerLevel >= 1) && (colorTonerLevel <= 100)){
            this.colorTonerLevel = colorTonerLevel;
        } else {
            this.colorTonerLevel = 100;
        }
    }

    public int getColorTonerLevel(){
        return colorTonerLevel;
    }

    public void addToner(int blackTonerLevel, int colorTonerLevel){
        super.addToner(blackTonerLevel);
        if((colorTonerLevel >= 1) && (colorTonerLevel <= 100)){
            if((this.colorTonerLevel + colorTonerLevel) >= 100){
                this.colorTonerLevel = 100;
            } else {
                this.colorTonerLevel += colorTonerLevel;
            }
        } else {
            System.out.println("Toner level to add must be a number between 1 and 100 (inclusive).");
        }
        System.out.printf("Color Toner Level: %d.%n", getColorTonerLevel());
    }


    protected void decreaseColorTonerLevel(int sheetsPrinted){
        colorTonerLevel -= calculateSheets(sheetsPrinted);
        System.out.printf("\t\tNew color toner level: %d.%n\t\t***\t\t***%n", getColorTonerLevel());
    }

    public int printColorPages(int numberOfPages){
        if((getColorTonerLevel() - calculateSheets(numberOfPages)) >= 0){
            System.out.println("Printing color pages...");
            setSheetsPrinted(calculateSheets(numberOfPages));
            System.out.printf("Sheets printed: %d.%n", getSheetsPrinted());
            decreaseColorTonerLevel(numberOfPages);
            return calculateSheets(numberOfPages, getIsDoubleSide());
        } else {
            System.out.printf("Not enough color toner to print that number of pages.%n" +
                                      "Max number of pages to print: %d.%n\t\t***\t\t***%n", (getColorTonerLevel() * 2));
        }

        return -1;
    }

}
