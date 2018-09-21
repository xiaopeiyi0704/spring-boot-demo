package structual.builder;

public class MealBuilder {
    //Meal meal=new Meal();

    public Meal prepareMeal(String burgerType, String drinkType){
        Meal meal=new Meal();
        if(burgerType.equalsIgnoreCase("meatBurger")) {
            Item burger = new MeatBurger();
            meal.addItem(burger);
        }else{
            //
        }

        if(drinkType.equalsIgnoreCase("coke")){
            Item drink=new Coke();
            meal.addItem(drink);
        }else{

        }

        return meal;


    }
}
