package factoryMethod.ejercicios;

public class Avion {
    private String marca;
    private String capacidad;
    private String numeroDeAsientos;
    private String modelo;

    public Avion(){}

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    public String getNumeroDeAsientos() {
        return numeroDeAsientos;
    }

    public void setNumeroDeAsientos(String numeroDeAsientos) {
        this.numeroDeAsientos = numeroDeAsientos;
    }

    public void showInfo(){
        System.out.println("Avion marca: "+marca);
        System.out.println("Avion capacidad: "+capacidad);
        System.out.println("Avion numeroDeAsientos: "+numeroDeAsientos);
        System.out.println("Avion modelo: "+modelo);

    }
}
