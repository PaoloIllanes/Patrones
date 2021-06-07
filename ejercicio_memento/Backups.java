package memento.ejercicios;

public class Backups {

    private String tablas;
    private String databaseName;

    public Backups (String tablas, String databaseName){
        this.tablas= tablas;
        this.databaseName= databaseName;
    }

    public String gettablas() {
        return tablas;
    }

    public void settablas(String tablas) {
        this.tablas = tablas;
    }

    public String isDatabaseName() {
        return databaseName;
    }

    public void setDatabaseName(String databaseName) {
        databaseName = databaseName;
    }

    public void info(){
        System.out.println("INFO> tablas: "+tablas);
        System.out.println("INFO> databaseName: "+databaseName);
    }

}
