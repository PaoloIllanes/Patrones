package builder.ejercicios;

import java.util.ArrayList;
import java.util.List;

public class PizzaHawaiana extends BuilderPizza {


    @Override
    public void buildIngredientes() {

        List<String> ing = new ArrayList<>();
        ing.add("salsa");
        ing.add("jamon");
        ing.add("piña");
        ing.add("cherry");
        pizza.setIngredientes(ing);

    }

    @Override
    public void buildTipoMasa() {

        pizza.setTipoMasa("Crujiente");

    }

    @Override
    public void buildQueso() {

        pizza.setTipoQueso("Cheddar");

    }
}
