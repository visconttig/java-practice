package entities;
import entities.Appliance;

public class DishWasher extends Appliance {

    public DishWasher(){
        super();
    }

    public void doDishes(boolean hasWorkToDo){
        this.hasWorkToDo = hasWorkToDo;
    }
}
