package factoryMethod.ejercicios;


public class CreatorPasajeInfantes extends CreatorPasajes{

    @Override
    public PasajeInfantes create() {

        Destino destino= new Destino();
        destino.setPais("Peru");
        destino.setCiudad("Lima");
        destino.setAeropuerto("Lima");

        Origen origen= new Origen();
        origen.setPais("Bolivia");
        origen.setCiudad("Santa Cruz");
        origen.setAeropuerto("Santa Cruz");

        Avion avion= new Avion();
        avion.setCapacidad("300");
        avion.setMarca("tam");
        avion.setModelo("comercial");
        avion.setNumeroDeAsientos("222");

        Pasajero pasajero = new Pasajero();
        pasajero.setNombre("Alejandro");
        pasajero.setCi("3434324");

        PasajeInfantes pasajeInfantes = new PasajeInfantes();
        pasajeInfantes.setCostoEspecial("1000");
        pasajeInfantes.setAvion(avion);
        pasajeInfantes.setPasajero(pasajero);
        pasajeInfantes.setNumeroVuelo("44");
        pasajeInfantes.setNumeroAsiento("215");
        pasajeInfantes.setOrigen(origen);
        pasajeInfantes.setDestino(destino);


        return pasajeInfantes;
    }
}
