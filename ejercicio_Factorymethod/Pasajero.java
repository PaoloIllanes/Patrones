package factoryMethod.ejercicios;

public class Pasajero {

    private String nombre;
    private String ci;


    public Pasajero(){}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public void showInfo(){
        System.out.println("Pasajero nombre: "+nombre);
        System.out.println("Pasajero ci: "+ci);


    }
}
