package builder.ejercicios;

public class Cocinero {
    private BuilderPizza builderPizza;
    public void setBuilderPizza(BuilderPizza builderPizza){
        this.builderPizza = builderPizza;
    }
    public Pizza getPizza(){
        return builderPizza.getPizza();
    }

    public void armarPizza(){
        this.builderPizza.buildTipoMasa();
        this.builderPizza.buildQueso();
        this.builderPizza.buildIngredientes();
    }
}
