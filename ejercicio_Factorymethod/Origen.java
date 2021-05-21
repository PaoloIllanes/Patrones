package factoryMethod.ejercicios;

public class Origen {

    private String pais;
    private String ciudad;
    private String aeropuerto;


    public Origen(){}

    public String getNombre() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getAeropuerto() {
        return aeropuerto;
    }

    public void setAeropuerto(String aeropuerto) {
        this.aeropuerto = aeropuerto;
    }


    public void showInfo(){
        System.out.println("Origen pais: "+pais);
        System.out.println("Origen ciudad: "+ciudad);
        System.out.println("Origen aeropuerto: "+aeropuerto);

    }
}
