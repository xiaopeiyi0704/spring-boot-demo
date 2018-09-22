package creational.factory;

public class FactoryDirver {

    public static void main(String[]args){
        ShapeFactory sf=new ShapeFactory();
        Shape shape;

        shape=sf.getShape("circle");
        shape.draw();

        shape=sf.getShape("square");
        shape.draw();

    }



}
