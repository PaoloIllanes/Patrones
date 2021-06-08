package command.ejercicios;

import java.util.ArrayList;
import java.util.List;

public class Invoker {

    private List<IOperationBuild> commandList = new ArrayList<>();

    public Invoker(){}

    public void addCommand(IOperationBuild concreteCommand){
        commandList.add(concreteCommand);
    }

    public void executeCommands(){
        for (IOperationBuild command: commandList) {
            command.execute();
        }
        commandList.clear();
    }

}
