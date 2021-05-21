package factoryMethod.ejercicios;

public class PasajeStandart implements IPasaje {
    private String numeroVuelo;
    private Destino destino;
    private Origen  origen;
    private Avion avion;
    private Pasajero pasajero;
    private String numeroAsiento;
    private String costoDePasaje;

    public PasajeStandart(){
        avion = new Avion();
        pasajero= new Pasajero();
        origen = new Origen();
        destino= new Destino();
    }

    @Override
    public void crear() {
        System.out.println("Pasaje de Infantes - numeroVuelo: "+numeroVuelo);
        System.out.println("Pasaje de Infantes - numeroAsiento: "+numeroAsiento);
        System.out.println("Pasaje de Infantes - costoDePasaje: "+costoDePasaje);
        avion.showInfo();
        pasajero.showInfo();
        origen.showInfo();
        destino.showInfo();
    }

    public String getNumeroVuelo() {
        return numeroVuelo;
    }

    public void setNumeroVuelo(String numeroVuelo) {
        this.numeroVuelo = numeroVuelo;
    }

    public Destino getDestino() {
        return destino;
    }

    public void setDestino(Destino destino) {
        this.destino = destino;
    }

    public Origen getOrigen() {
        return origen;
    }

    public void setOrigen(Origen origen) {
        this.origen = origen;
    }

    public Avion getAvion() {
        return avion;
    }

    public void setAvion(Avion avion) {
        this.avion = avion;
    }

    public Pasajero getPasajero() {
        return pasajero;
    }

    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }

    public String getNumeroAsiento() {
        return numeroAsiento;
    }

    public void setNumeroAsiento(String numeroAsiento) {
        this.numeroAsiento = numeroAsiento;
    }

    public String getCostoDePasaje() {
        return costoDePasaje;
    }

    public void setCostoDePasaje(String costoDePasaje) {
        this.costoDePasaje = costoDePasaje;
    }
}
