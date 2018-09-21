package behavior.observer;

public class BinaryObserver extends Observer {



    BinaryObserver(Subject subject){
        this.subject=subject;
        this.subject.addObserver(this);
    }

    public void update(){

        System.out.println("Binary state is "+ Integer.toBinaryString( subject.getState() ) );

    }
}
