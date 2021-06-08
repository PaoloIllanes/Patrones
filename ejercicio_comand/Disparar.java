package command.ejercicios;

public class Disparar implements IOperationBuild {

    private Juego rpg;

    public Disparar(Juego rpg){
        this.rpg=rpg;
    }

    @Override
    public void execute() {
        System.out.println("Disparando.....");
        this.rpg.dispararEnemigo();
    }
}
