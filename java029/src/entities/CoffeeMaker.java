package entities;

public class CoffeeMaker extends Appliance {

    public CoffeeMaker(){
        super();
    }

    public void brewCoffee(boolean hasWorkToDo){
        this.hasWorkToDo = hasWorkToDo;
    }
}
