package behavior.strategy;

public class StrategyDriver {


    public static void main(String[] args){
        Context context=new Context(new Add());

        context.executeStrategy(5,6);

        context=new Context(new Mutiply());

        context.executeStrategy(5,6);

    }


}
