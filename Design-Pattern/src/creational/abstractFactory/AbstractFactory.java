package creational.abstractFactory;

public abstract class AbstractFactory {

    abstract public Shape getShape(String name);

    abstract public Color getColor(String name);
}
