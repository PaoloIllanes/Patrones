package command.ejercicios;

public class Juego {
    private String name;
    private boolean freeToPlay;

    public Juego(String name, boolean freeToPlay){
        this.name= name;
        this.freeToPlay=freeToPlay;
    }

    public void showInfo(){
        System.out.println("name: "+name);
        System.out.println("freeToPlay: "+freeToPlay);
    }

    public void atacarEnemigo(){
        System.out.println("COMMAND>atacarEnemigo....");
        this.showInfo();
    }

    public void activarModoDefensa(){
        System.out.println("COMMAND>activarModoDefensa....");
        this.showInfo();
    }

    public void dispararEnemigo(){
        System.out.println("COMMAND>dispararEnemigo ... ");
        this.showInfo();
    }

}
