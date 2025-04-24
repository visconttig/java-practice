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

    public void printColorPages(int numberOfPages){
        var sheets = super.printPages(numberOfPages);
        if(sheets %2 == 0){
            colorTonerLevel -= sheets;
        } else {
            colorTonerLevel -= (sheets + 1);
        }
    }

}
