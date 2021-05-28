package iterator.ejercicios;


import java.util.Vector;

public class ListC implements IList {

    private Vector<String> empleados;

    public ListC(){

        empleados= new Vector<>();
    }
    public void add(String value){

        empleados.add(value);
    }

    @Override
    public IteratorConcreteListC iterator() {

        return new IteratorConcreteListC(this.empleados);
    }
}
