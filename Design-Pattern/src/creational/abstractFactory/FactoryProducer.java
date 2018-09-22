package creational.abstractFactory;

public class FactoryProducer {

    public static AbstractFactory getFactory(String factoryName){
        if(factoryName.equalsIgnoreCase("shape")){
            return new ShapeFactory();
        }
        if(factoryName.equalsIgnoreCase("color")){
            return new ColorFactory();
        }

        return null;
    }
}
