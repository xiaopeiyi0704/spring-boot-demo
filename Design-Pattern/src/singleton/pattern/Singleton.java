package singleton.pattern;

public class Singleton {

    //eager
    private final static Singleton singleton=new Singleton();

    private Singleton(){};

    public static Singleton getSingletonInstance(){

        System.out.println("Get eager singleton");
        return singleton;
    }

    //lazy
    /*private static Singleton singleton;

    private Singleton(){};

    public static Singleton getSingletonInstance(){
        if(singleton==null){
            singleton=new Singleton();
        }
        System.out.println("Get lazy singleton");
        return singleton;
    }*/
}
