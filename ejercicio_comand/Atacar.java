package command.ejercicios;

public class Atacar implements IOperationBuild {

    private Juego juego;

    public Atacar(Juego juego){
        this.juego=juego;
    }

    @Override
    public void execute() {
        System.out.println("running test.....");
        this.juego.atacarEnemigo();
    }
}

