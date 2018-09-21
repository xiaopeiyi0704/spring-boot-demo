package behavior.command;

//invoker
public class RemoteControl {

    Command command;

    public void setCommand(Command cmd){

        this.command=cmd;
    }

    public void pressButton(){
        this.command.execute();
    }

}
