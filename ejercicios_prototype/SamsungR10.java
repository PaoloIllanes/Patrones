package prototype.ejercicios;

import prototype.ejemplos.partidodefutbol.EntradaFisica;
import prototype.ejemplos.partidodefutbol.Tiempo;

public class SamsungR10 {

    private String tamano;
    private String cpu;
    private String memory;
    private String sim;
    private String versionAndroid;
    private String camara;
    private String bluetoo;
    private String cantidadDeMemoriasExternas;
    private String tipoBateria;
    private String accesorios;

    public SamsungR10(){}

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getSim() {
        return sim;
    }

    public void setSim(String sim) {
        this.sim = sim;
    }

    public String getVersionAndroid() {
        return versionAndroid;
    }

    public void setVersionAndroid(String versionAndroid) {
        this.versionAndroid = versionAndroid;
    }

    public String getCamara() {
        return camara;
    }

    public void setCamara(String camara) {
        this.camara = camara;
    }

    public String getBluetoo() {
        return bluetoo;
    }

    public void setBluetoo(String bluetoo) {
        this.bluetoo = bluetoo;
    }

    public String getCantidadDeMemoriasExternas() {
        return cantidadDeMemoriasExternas;
    }

    public void setCantidadDeMemoriasExternas(String cantidadDeMemoriasExternas) {
        this.cantidadDeMemoriasExternas = cantidadDeMemoriasExternas;
    }

    public String getTipoBateria() {
        return tipoBateria;
    }

    public void setTipoBateria(String tipoBateria) {
        this.tipoBateria = tipoBateria;
    }

    public String getAccesorios() {
        return accesorios;
    }

    public void setAccesorios(String accesorios) {
        this.accesorios = accesorios;
    }

    @Override
    public Object clone() {
        SamsungR10 objClone= new SamsungR10();
        objClone.setTamano(this.tamano);
        objClone.setCpu(this.cpu);
        objClone.setMemory(this.memory);
        objClone.setSim(this.sim);
        objClone.setVersionAndroid(this.versionAndroid);
        objClone.setCamara(this.camara);
        objClone.setBluetoo(this.bluetoo);
        objClone.setCantidadDeMemoriasExternas(this.cantidadDeMemoriasExternas);
        objClone.setTipoBateria(this.tipoBateria);
        objClone.setAccesorios(this.accesorios);
        return objClone;
    }

    public void showInformation(){
        System.out.println("***********************");
        System.out.println("tamano"+tamano);
        System.out.println("cpu"+cpu);
        System.out.println("memory"+memory);
        System.out.println("sim"+sim);
        System.out.println("versionAndroid"+versionAndroid);
        System.out.println("camara"+camara);
        System.out.println("bluetoo"+bluetoo);
        System.out.println("cantidadDeMemoriasExternas"+cantidadDeMemoriasExternas);
        System.out.println("tipoBateria"+cantidadDeMemoriasExternas);
        System.out.println("accesorios"+cantidadDeMemoriasExternas);
    }
}
