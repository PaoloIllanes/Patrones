package bridge.ejercicioNoBridge;

public class Linux implements ISistemaOperativo{
    public void setArq32() {
        System.out.println("Arquitectura de 32 bits");
    }

    @Override
    public void setArq64() {
        System.out.println("Arquitectura de 64 bits");
    }

    @Override
    public void setArq128() {
        System.out.println("Arquitectura de 128 bits");
    }
}
