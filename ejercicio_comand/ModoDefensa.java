package command.ejercicios;

public class ModoDefensa implements IOperationBuild {

    private Juego juego;

    public ModoDefensa(Juego juego){
        this.juego=juego;
    }

    @Override
    public void execute() {
        System.out.println("Cambiando a modo defensa");
        this.juego.activarModoDefensa();
    }
}
