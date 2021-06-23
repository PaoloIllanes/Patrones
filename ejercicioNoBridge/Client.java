package bridge.ejercicioNoBridge;

public class Client {

    public static void main (String [] args){

        ISistemaOperativo windows = new Windows();
       windows.setArq32();
       windows.setArq64();
       windows.setArq128();

    }

}
