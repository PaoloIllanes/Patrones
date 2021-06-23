package bridge.ejercicio_2;

public class EmpresaSRL implements IEmpresa{
    private String nombreEmpresa;

    public EmpresaSRL(String nombreEmpresa){
        this.nombreEmpresa= nombreEmpresa;
        this.nombreEmpresa=nombreEmpresa;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    @Override
    public void enviarPaquete(Paquete paquete, IMedioDeEnvio medioDeEnvio) {
        System.out.println("**************************************");
        System.out.println("Realizando envio");
        System.out.println("Empresa : "+getNombreEmpresa());
        System.out.println("Enviando : "+paquete.getNombrePaquete());
        medioDeEnvio.cobrarEnvio(paquete);
        System.out.println("**************************************");
    }
}
