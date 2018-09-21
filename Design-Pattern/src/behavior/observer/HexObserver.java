package behavior.observer;

public class HexObserver extends Observer {

    public HexObserver(Subject subject){
        this.subject=subject;
        this.subject.addObserver(this);
    }

    public void update(){
        System.out.println("Hex state is: "+ Integer.toHexString( subject.getState() ).toUpperCase() );

    }
}
