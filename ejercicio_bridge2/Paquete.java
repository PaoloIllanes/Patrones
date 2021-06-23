package bridge.ejercicio_2;

public class Paquete {
    private int precio;
    private String nombrePaquete;

    public Paquete(int precio,String nombrePaquete){
        this.nombrePaquete= nombrePaquete;
        this.precio=precio;

    }

    public int getPrecio() {
        return precio;
    }

    public String getNombrePaquete() {
        return nombrePaquete;
    }
}
