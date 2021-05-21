package factoryMethod.ejercicios;

public class CreatorPasajeStandart extends CreatorPasajes{

    @Override
    public PasajeStandart create() {

        Destino destino= new Destino();
        destino.setPais("Argentina");
        destino.setCiudad("Cordoba");
        destino.setAeropuerto("Cordoba");

        Origen origen= new Origen();
        origen.setPais("Bolivia");
        origen.setCiudad("Tarija");
        origen.setAeropuerto("Tarija");

        Avion avion= new Avion();
        avion.setCapacidad("200");
        avion.setMarca("tam");
        avion.setModelo("comercial");
        avion.setNumeroDeAsientos("56");

        Pasajero pasajero = new Pasajero();
        pasajero.setNombre("Alvaro");
        pasajero.setCi("67676757");

        PasajeStandart pasajeStandart = new PasajeStandart();
        pasajeStandart.setCostoDePasaje("2000");
        pasajeStandart.setAvion(avion);
        pasajeStandart.setPasajero(pasajero);
        pasajeStandart.setNumeroVuelo("67");
        pasajeStandart.setNumeroAsiento("112");
        pasajeStandart.setOrigen(origen);
        pasajeStandart.setDestino(destino);


        return pasajeStandart;
    }
}
