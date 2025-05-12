package main;
import main.GasPoweredCar;
import main.ElectricCar;
import main.HybridCar;

public class Main {
    public static void main(String[] args){
        Car car1 = new GasPoweredCar("The best Gas car");
        Car car2 = new ElectricCar();
        Car car3 = new HybridCar();


        car1.startEngine();
        car1.drive();
        car2.startEngine();
        car2.drive();
        car3.startEngine();
        car3.drive();

    }
}
