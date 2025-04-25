package entities;

public class ColorPrinter extends Printer {
    private int colorTonerLevel;

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
            this.colorTonerLevel = colorTonerLevel;
        } // otherwise keep the same
        System.out.printf("Color Toner Level: %d.%n", getColorTonerLevel());
    }


    protected void decreaseColorTonerLevel(int sheetsPrinted){
        System.out.println("Decrease toner level in ColorPrinter.");
        colorTonerLevel -= calculateSheets(sheetsPrinted);
        System.out.printf("\t\tNew color toner level: %d.%n", getColorTonerLevel());
    }

    public int printColorPages(int numberOfPages){
        System.out.println("Printing color pages...");
        decreaseColorTonerLevel(numberOfPages);
        setSheetsPrinted(calculateSheets(numberOfPages));
        System.out.printf("Sheets printed: %d.%n", getSheetsPrinted());
        return calculateSheets(numberOfPages, getIsDoubleSide());
    }

}
