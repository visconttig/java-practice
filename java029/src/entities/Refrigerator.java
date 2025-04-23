package entities;
import entities.Appliance;

public class Refrigerator extends Appliance {

    public Refrigerator(){
        super();
    }

    public void orderFood(boolean hasWorkToDo){
        this.hasWorkToDo = hasWorkToDo;
    }

}
