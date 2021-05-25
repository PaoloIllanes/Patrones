package builder.ejercicios;

import java.util.List;

public class Pizza {
    private String tipoQueso;
    private String tipoMasa;
    private List<String> ingredientes;


    public Pizza(){}

    public String getTipoQueso() {
        return tipoQueso;
    }

    public void setTipoQueso(String tipoQueso) {
        this.tipoQueso = tipoQueso;
    }

    public String getTipoMasa() {
        return tipoMasa;
    }

    public void setTipoMasa(String tipoMasa) {
        this.tipoMasa = tipoMasa;
    }

    public List<String> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<String> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public void showData() {
        System.out.println("tipoQueso : "+tipoQueso);
        System.out.println("tipoMasa : "+tipoMasa);
        System.out.print( "ingredientes : " +"[");
        for(String i : ingredientes) {
            System.out.print( i + ", ");
        }
        System.out.print("]");
    }
}
