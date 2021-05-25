package builder.ejercicios;


public class Client {

    public static void main (String []args){
        Cocinero Pepe= new Cocinero();
        PizzaClasica pizzaClasica = new PizzaClasica();
        PizzaCarnivora pizzaCarnivora = new PizzaCarnivora();
        PizzaHawaiana pizzaHawaiana = new PizzaHawaiana();

        Pepe.setBuilderPizza(pizzaClasica);
        Pepe.armarPizza();

        Pizza computadoraI9 = Pepe.getPizza();
        computadoraI9.showData();

        Pepe.setBuilderPizza(pizzaCarnivora);
        Pepe.armarPizza();

        Pizza computadoraI7 = Pepe.getPizza();
        computadoraI7.showData();

        Pepe.setBuilderPizza(pizzaHawaiana);
        Pepe.armarPizza();

        Pizza computadoraI5 = Pepe.getPizza();
        computadoraI5.showData();

    }
}
