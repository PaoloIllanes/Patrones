package bridge.ejercicios;

public class Linux implements ISistemaOperativo{
    private IArquitectura arq;
    private String version;

    public Linux(String version,IArquitectura arq){
        this.version= version;
        this.arq=arq;
    }


    @Override
    public void seleccionarArquitectura() {
        System.out.println("Instalando SO : "+version);
        arq.setArq();
    }
}
