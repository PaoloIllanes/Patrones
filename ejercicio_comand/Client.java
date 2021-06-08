package command.ejercicios;

public class Client {

    public static void main (String[]args){
        Juego juego = new Juego("wow",true);

        Atacar atacar= new Atacar(juego);
        Disparar disparar = new Disparar(juego);
        ModoDefensa modoDefensa = new ModoDefensa(juego);



        Invoker makeBuild= new Invoker();
        makeBuild.addCommand(atacar);
        makeBuild.addCommand(disparar);
        makeBuild.addCommand(modoDefensa);


        makeBuild.executeCommands();

    }
}
