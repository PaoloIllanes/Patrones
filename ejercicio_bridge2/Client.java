package bridge.ejercicio_2;

public class Client {

    public static void main(String[] args){
        //Medios de envio
        IMedioDeEnvio aire =  new Aire();
        IMedioDeEnvio tierra = new Tierra();
        IMedioDeEnvio tren = new Tren();
        IMedioDeEnvio avion = new Avion();
        IMedioDeEnvio mar = new Mar();

        //Empresas
        IEmpresa Fedex =  new EmpresaSA("Fedex");
        IEmpresa WesternUnion =  new EmpresaSRL("Western Union");

        //Paquetes
        Paquete laptop = new Paquete(400,"laptop");
        Paquete tablet = new Paquete(100,"tablet");
        Paquete celular = new Paquete(250,"celular");
        Paquete television = new Paquete(10000,"television");
        Paquete ps4 = new Paquete(500,"ps4");
        Paquete procesador = new Paquete(700,"procesador");

        //Enviar paquetes

        Fedex.enviarPaquete(laptop,aire);
        Fedex.enviarPaquete(tablet,tierra);
        Fedex.enviarPaquete(celular,tren);
        WesternUnion.enviarPaquete(television,avion);
        WesternUnion.enviarPaquete(ps4,mar);
        WesternUnion.enviarPaquete(procesador,aire);



    }

}
