package main;

public class HybridCar extends Car {
    private double avgKmPerLitre;
    private int batterySize;
    private int cylinders;

    public HybridCar(){
        this("No description.",
             10.0,
             4,
             6);
    }

    public HybridCar(String description,
                     double avgKmPerLitre,
                     int batterySize,
                     int cylinders){
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine(){
        printMessage("Hybrid car starting engine / motor...\n");
    }

    @Override
    public void drive(){
        printMessage("Hybrid car driving around...\n");
    }

    @Override
    protected void runEngine(int speed){
        printMessage(String.format("Running engine / motor at %d RPM.%n", speed));
    }












}
