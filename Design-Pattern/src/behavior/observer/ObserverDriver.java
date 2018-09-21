package behavior.observer;

public class ObserverDriver {

    public static void main(String[] args){

        Subject subject =new Subject();


        Observer bo=new BinaryObserver(subject);
        Observer ho=new HexObserver(subject);
        subject.setState(15);

        subject.notifyAllObservers();



    }
}
