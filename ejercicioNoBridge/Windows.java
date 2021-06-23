package bridge.ejercicioNoBridge;

public class Windows implements ISistemaOperativo{
    @Override
    public void setArq32() {
        System.out.println("Arquitectura de 32 bits");
    }

    @Override
    public void setArq64() {
        System.out.println("No se puede instalar esta arquitectura");
    }

    @Override
    public void setArq128() {
        System.out.println("No se puede instalar esta arquitectura");
    }
}
