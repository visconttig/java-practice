package main;

public class GasPoweredCar extends Car {
    private double avgKmPerLitre;
    private int cylinders;

    public GasPoweredCar(){
        this("No description", 11.2, 6);
    }

    public GasPoweredCar(String description){
        this(description, 11.2, 6);
    }

    public GasPoweredCar(String description,
                         double avgKmPerLitre,
                         int cylinders){
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine(){
        printMessage("Starting Gas engine...\n");
    }

   @Override
   public void drive(){
        printMessage("Gas powered car driving around...\n");
   }

   @Override
    protected void runEngine(int speed){
        printMessage(String.format("Running gas engine at %d RPM.%n", speed));
   }














}
