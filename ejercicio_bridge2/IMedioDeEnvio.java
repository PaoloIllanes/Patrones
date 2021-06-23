package bridge.ejercicio_2;

public abstract class IMedioDeEnvio {

    private int costoEnv;

    public IMedioDeEnvio(int costoEnv){
        this.costoEnv=costoEnv;
    }




    void cobrarEnvio(Paquete paquete){
        int costoTotal;
        int costoAdicional ;
        System.out.println("Costo del Paquete: "+ paquete.getPrecio()+" $");
        int temp = paquete.getPrecio()/100;
        costoAdicional=temp*costoEnv;
        costoTotal =costoAdicional+paquete.getPrecio();
        System.out.println("Costo de Envio: "+ costoAdicional+" $");
        System.out.println("Costo Total: "+ costoTotal+" $");
    }

}
