package creational.abstractFactory;

public class ShapeFactory extends AbstractFactory{

    public Shape getShape(String name){

        if(name.equalsIgnoreCase("circle")){
            return new Circle();
        }

        if(name.equalsIgnoreCase("square")){
            return new Square();
        }
        return null;
    }

    public Color getColor(String name){
        return null;
    }
}
