package structual.builder;

public abstract class Burger implements Item {

    //Packing packing;
    public Packing getPacking(){
        return new Wrapper();
    }


}
