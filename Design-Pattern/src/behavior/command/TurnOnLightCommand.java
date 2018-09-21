package behavior.command;

public class TurnOnLightCommand implements Command{
    //reciever object
    Light light;

    public TurnOnLightCommand(Light light){
        this.light=light;
    }

    @Override
    public void execute() {
        this.light.switchOn();;
    }
}
