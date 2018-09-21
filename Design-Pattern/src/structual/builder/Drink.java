package structual.builder;

public abstract class Drink implements Item {

        //Packing packing;

        public Packing getPacking(){
            return new Bottle();
        }
}
