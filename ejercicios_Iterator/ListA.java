package iterator.ejercicios;

import java.util.ArrayList;
import java.util.List;

public class ListA implements IList {

    private List<String> empleados;

    public ListA(){
        empleados= new ArrayList<>();
    }
    public void add(String value){
        empleados.add(value);
    }

    @Override
    public IteratorConcreteListA iterator() {
        return new IteratorConcreteListA(this.empleados);
    }
}