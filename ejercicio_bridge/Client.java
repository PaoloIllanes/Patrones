package bridge.ejercicios;

public class Client {

    public static void main(String[] args){

        ISistemaOperativo Ubuntu = new Linux("Ubuntu",new Arqx64());
        Ubuntu.seleccionarArquitectura();

        ISistemaOperativo Centos = new Linux("Centos",new Arqx86());
        Centos.seleccionarArquitectura();

        ISistemaOperativo Windows10 = new Windows("Windows 10",new Arqx128());
        Windows10.seleccionarArquitectura();

        ISistemaOperativo Windows7 = new Windows("Windows 7",new Arqx64());
        Windows7.seleccionarArquitectura();





    }

}
