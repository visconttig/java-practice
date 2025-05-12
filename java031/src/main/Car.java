package main;

public class Car {
    private String description;

    public Car(){
        this("No description.");
    }

    public Car(String description){
        this.description = description;
    }

    public void startEngine(){
       printMessage("Starting engine...");
    }

    public void drive(){
        printMessage("Driving around...\n");
    }

    protected void runEngine(int speed){
        printMessage(String.format("Running engine at %d RPM.", speed));
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        if(!(description.isEmpty())){
            this.description = description;
        }
    }

    public void printMessage(String message){
        System.out.print(message);
    }
}







