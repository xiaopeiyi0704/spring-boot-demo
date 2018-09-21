package behavior.command;

public class CommandDriver {

    public static void main(String[] args){

        Light light=new Light();
        RemoteControl rc=new RemoteControl();

        Command turnOnLightCommand=new TurnOnLightCommand(light);
        rc.setCommand(turnOnLightCommand);
        rc.pressButton();

        Command turnOffLightCommand=new TurnOffLightCommand(light);
        rc.setCommand(turnOffLightCommand);
        rc.pressButton();




    }
}
