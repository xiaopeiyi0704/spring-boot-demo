package creational.abstractFactory;

public class ColorFactory extends AbstractFactory {

    @Override
    public Color getColor(String name) {
        if(name.equalsIgnoreCase("red")){
            return new Red();
        }

        if(name.equalsIgnoreCase("blue")){
            return new Blue();
        }
        return null;
    }

    public Shape getShape(String name){
        return null;
    }
}
