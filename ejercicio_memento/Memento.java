package memento.ejercicios;


public class Memento {

    private Backups state;

    public Memento(Backups stateSaved){
        this.state=stateSaved;
    }

    public Backups getState() {
        return state;
    }

}
