package creational.abstractFactory;

public class AbstractFactoryDirver {

    public static void main(String[]args){

        AbstractFactory shapeFactory=FactoryProducer.getFactory("shape");

        Shape shape=shapeFactory.getShape("circle");

        shape.draw();

        shape=shapeFactory.getShape("square");

        shape.draw();


        AbstractFactory colorFactory=FactoryProducer.getFactory("color");

        Color color=colorFactory.getColor("red");

        color.draw();

        color=colorFactory.getColor("blue");

        color.draw();
    }



}
