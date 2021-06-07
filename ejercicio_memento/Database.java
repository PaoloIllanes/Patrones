package memento.ejercicios;

public class Database {

    private Backups state;

    public Database(){}

    public void setState(Backups state) {
        System.out.println("**** Set State *****");
        state.info();
        this.state = state;
    }

    public Memento createVersion(){
        System.out.println("**** Create State *****");
        state.info();
        return new Memento(this.state) ;
    }

    public void restoreFromMemento(Memento memento){
        this.state=memento.getState();
        System.out.println("**** State Restored *****");
        this.state.info();
    }

}
