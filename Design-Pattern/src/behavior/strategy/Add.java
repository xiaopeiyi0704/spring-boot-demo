package behavior.strategy;

public class Add implements Strategy {

    @Override
    public void doOperation(int a, int b) {
        System.out.println(a+b);
    }
}
