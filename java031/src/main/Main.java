package main;
import main.GasPoweredCar;
import main.ElectricCar;
import main.HybridCar;

public class Main {
    public static void main(String[] args){
        Car car = new Car("2024 Mazda Elixir");
        runCar(car);
        Car ferrari = new HybridCar("2002 Ferrari Carrera",
                                    6,
                                    4,
                                    8);
        runCar(ferrari);
        Car tesla = new ElectricCar("2025 Tesla X",
                                    725,
                                    8);
        runCar(tesla);

    }

    public static void runCar(Car car){
        car.startEngine();
        car.drive();
    }
}
