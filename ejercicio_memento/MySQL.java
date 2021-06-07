package memento.ejercicios;


import java.util.HashMap;
import java.util.Map;

public class MySQL {

    private Map<String, Memento> stateSaved= new HashMap<>();

    public void createBackup(String backup, Memento memento){
        stateSaved.put(backup,memento);
    }

    public Memento getMemento(String commitCode){
        return stateSaved.get(commitCode);
    }

}
