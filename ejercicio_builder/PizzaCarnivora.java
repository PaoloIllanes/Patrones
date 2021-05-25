package builder.ejercicios;
import java.util.ArrayList;
import java.util.List;
public class PizzaCarnivora extends BuilderPizza{



    @Override
    public void buildIngredientes() {
        List<String> ing = new ArrayList<>();
        ing.add("salsa");
        ing.add("carne");
        ing.add("tocino");
        ing.add("aceitunas");
        pizza.setIngredientes(ing);
    }

    @Override
    public void buildTipoMasa() {
        pizza.setTipoMasa("Madre");
    }

    @Override
    public void buildQueso() {
        pizza.setTipoQueso("Mozzarela");
    }
}
