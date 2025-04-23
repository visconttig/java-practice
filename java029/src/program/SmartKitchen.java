package program;
import entities.Refrigerator;
import entities.DishWasher;
import entities.CoffeeMaker;

public class SmartKitchen {
    CoffeeMaker brewMaster;
    DishWasher dishWasher;
    Refrigerator iceBox;

    public SmartKitchen(){
        brewMaster = new CoffeeMaker();
        dishWasher = new DishWasher();
        iceBox = new Refrigerator();
    }


    public void addWater(boolean hasWorkToDo){
        brewMaster.brewCoffee(hasWorkToDo);
    }

    public void pourMilk(boolean hasWorkToDo){
        iceBox.orderFood(hasWorkToDo);
    }

    public void loadDishWasher(boolean hasWorkToDo){
        dishWasher.doDishes(hasWorkToDo);
    }

    public void setKitchenState(boolean refrigeratorWork,
                                 boolean dishWasherWork,
                                 boolean coffeeMakerWork){
        pourMilk(refrigeratorWork);
        addWater(coffeeMakerWork);
        loadDishWasher(dishWasherWork);

    }


    public void doKitchenWork(){
        setKitchenState(true, true, true);
    }











}
