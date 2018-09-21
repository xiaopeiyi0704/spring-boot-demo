package behavior.strategy;

public class Context {

    Strategy strategy;

    public Context(Strategy strategy){
        this.strategy=strategy;
    }

    public void executeStrategy(int a, int b){

        strategy.doOperation(a,b);
    }
}
