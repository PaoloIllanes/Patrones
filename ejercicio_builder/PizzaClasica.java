package builder.ejercicios;

import java.util.ArrayList;
import java.util.List;

public class PizzaClasica extends BuilderPizza{

    @Override
    public void buildIngredientes() {
        List<String> ing = new ArrayList<>();
        ing.add("salsa");
        ing.add("carne");
        ing.add("jamon");
        ing.add("extra queso");
        pizza.setIngredientes(ing);
    }

    @Override
    public void buildTipoMasa() {

        pizza.setTipoMasa("Crujiente");

    }

    @Override
    public void buildQueso() {

        pizza.setTipoQueso("dambo");

    }
}
