package behavior.command;

public class TurnOffLightCommand implements Command {
    //reciever object
    Light light;

    public TurnOffLightCommand(Light light){
        this.light=light;
    }

    public void execute(){
        this.light.switchOff();
    }
}
