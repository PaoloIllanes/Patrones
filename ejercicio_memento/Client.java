package memento.ejercicios;



public class Client {

    public static void main (String []argsss ){
        MySQL mySQL= new MySQL();
        Database database= new Database();

        Backups backups;

        backups = new Backups("tabla1,tabla2","DB1");

        backups = new Backups("tabla1,tabla2,tabla3","DB1");
        database.setState(backups);
        mySQL.createBackup("6R5F88",database.createVersion());

        backups = new Backups("tabla1,tabla2,tabla3,tabla4","DB1");

        backups = new Backups("tabla1,tabla2,tabla3,tabla4","DB2");

        backups = new Backups("tabla1,tabla2,tabla3,tabla4,tabla5","DB2");
        database.setState(backups);
        mySQL.createBackup("777RRR",database.createVersion());

        backups = new Backups("tabla1,tabla2,tabla3,tabla4,tabla5,tabla6","DB2");

        database.restoreFromMemento(mySQL.getMemento("6R5F88"));




    }

}
