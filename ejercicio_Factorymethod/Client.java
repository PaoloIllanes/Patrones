package factoryMethod.ejercicios;


public class Client {

    public  static void main (String[]args){
        CreatorPasajes pasajeInfantes= new CreatorPasajeInfantes();
        pasajeInfantes.create().crear();
        System.out.println("*****************************");
        CreatorPasajes pasajeSolidario= new CreatorPasajeSolidario();
        pasajeSolidario.create().crear();
        System.out.println("*****************************");
        CreatorPasajes pasajeStandart =  new CreatorPasajeStandart();
        pasajeStandart.create().crear();
        System.out.println("*****************************");
    }
}
