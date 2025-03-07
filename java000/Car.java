public class Car {
  String model;
  int year;
  String brand;
  double motor;
  String color;
  int numberOfDoors;
  int weight; // for internal purposes

  public void printDetails(){
    System.out.printf("The car is a %s, built on %d, of color %s", brand, year, color);
  }

  public String getColor(){
    return this.color;
  }

  public int getNumberOfDoors(){
    return this.numberOfDoors;
  }
}