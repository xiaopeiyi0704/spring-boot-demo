package behavior.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    private int state;
    List<Observer> observerlist=new ArrayList<Observer>();



    public int getState(){
        return this.state;
    }

    public void setState(int state){
        this.state=state;
    }



    public void addObserver(Observer observer){
        observerlist.add(observer);
    }

    public void notifyAllObservers(){

        for(Observer observer: observerlist ){

            observer.update();
        }
    }

}
