package structual.builder;

public class BuilderPatternDriver {

    public static void main(String[]args){

        MealBuilder mb=new MealBuilder();
        Meal meal=mb.prepareMeal("meatBurger", "coke");
        meal.showItems();
        meal.getTotal();
    }
}
