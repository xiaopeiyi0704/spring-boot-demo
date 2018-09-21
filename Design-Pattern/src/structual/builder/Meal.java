package structual.builder;

import java.util.ArrayList;
import java.util.List;

public class Meal {

    List<Item> itemList=new ArrayList<Item>();

    public void addItem(Item item){
        itemList.add(item);
    }

    public void getTotal(){
        float total=0.0f;
        for(Item item: itemList){
            total=total+item.getPrice();

        }
        System.out.println("Total: "+total);


    }

    public void showItems(){
        for(Item item: itemList){

            System.out.println(item.getName());
            System.out.println(item.getPrice());
            System.out.println(item.getPacking().getPacking());

        }

    }
}
