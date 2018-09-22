package creational.factory;

public class ShapeFactory {

    public Shape getShape(String name){

        if(name.equalsIgnoreCase("circle")){
            return new Circle();
        }

        if(name.equalsIgnoreCase("square")){
            return new Square();
        }
        return null;
    }
}
