package factoryMethod.ejercicios;

public class Destino {

    private String pais;
    private String ciudad;
    private String aeropuerto;


    public Destino(){}

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
        System.out.println("Destino pais: "+pais);
        System.out.println("Destino ciudad: "+ciudad);
        System.out.println("Destino aeropuerto: "+aeropuerto);

    }
}
