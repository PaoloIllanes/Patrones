package factoryMethod.ejercicios;

public class CreatorPasajeSolidario extends CreatorPasajes{

    @Override
    public PasajeSolidario create() {

        Destino destino= new Destino();
        destino.setPais("Bolivia");
        destino.setCiudad("La Paz");
        destino.setAeropuerto("El alto");

        Origen origen= new Origen();
        origen.setPais("Bolivia");
        origen.setCiudad("Cochabamba");
        origen.setAeropuerto("Cochabamba");

        Avion avion= new Avion();
        avion.setCapacidad("200");
        avion.setMarca("boa");
        avion.setModelo("comercial");
        avion.setNumeroDeAsientos("434");

        Pasajero pasajero = new Pasajero();
        pasajero.setNombre("Jose");
        pasajero.setCi("4234324234");

        PasajeSolidario pasajeSolidario = new PasajeSolidario();
        pasajeSolidario.setCostoDePasaje("1200 Bs");
        pasajeSolidario.setAvion(avion);
        pasajeSolidario.setPasajero(pasajero);
        pasajeSolidario.setDescuento("100Bs");
        pasajeSolidario.setMotivoDeDescuento("Discapacidad");
        pasajeSolidario.setOrigen(origen);
        pasajeSolidario.setDestino(destino);
        pasajeSolidario.setNumeroAsiento("121");
        pasajeSolidario.setNumeroVuelo("33");

        return pasajeSolidario;
    }
}
