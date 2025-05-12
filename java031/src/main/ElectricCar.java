package main;

public class ElectricCar extends Car {
    private double avgKmPerCharge;
    private int batterySize;

    public ElectricCar(){
        this("No description", 10.0, 6);
    }

    public ElectricCar(String description,
                       double avgKmPerCharge,
                       int batterySize){
        super(description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    @Override
    public void startEngine(){
        printMessage("Starting electric motor...\n");
    }

   @Override
   public void drive(){
        printMessage("Electric car ==> Driving around...\n");
        printMessage(String.format("Type of car: %s.%n",
                                   this.getClass().getSimpleName()));
   }

   @Override
    protected void runEngine(int speed){
        printMessage(String.format("Running electric motor at %d RPM.%n", speed));
   }










}
