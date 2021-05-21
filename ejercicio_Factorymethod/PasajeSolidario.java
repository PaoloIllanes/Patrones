package factoryMethod.ejercicios;


public class PasajeSolidario implements IPasaje {

    private String numeroVuelo;
    private Destino destino;
    private Origen origen;
    private Avion avion;
    private Pasajero pasajero;
    private String numeroAsiento;
    private String costoDePasaje;
    private String descuento;
    private String motivoDeDescuento;

    public PasajeSolidario(){
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
        System.out.println("Pasaje de Infantes - descuento: "+descuento);
        System.out.println("Pasaje de Infantes - motivoDeDescuento: "+motivoDeDescuento);
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

    public String getDescuento() {
        return descuento;
    }

    public void setDescuento(String descuento) {
        this.descuento = descuento;
    }

    public String getMotivoDeDescuento() {
        return motivoDeDescuento;
    }

    public void setMotivoDeDescuento(String motivoDeDescuento) {
        this.motivoDeDescuento = motivoDeDescuento;
    }
}
