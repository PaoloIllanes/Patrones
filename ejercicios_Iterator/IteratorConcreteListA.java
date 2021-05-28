package iterator.ejercicios;

import java.util.List;

public class IteratorConcreteListA implements Iterator{
    private List<String> empleados;
    private int position;

    public IteratorConcreteListA(List<String> empleados){

        this.empleados=empleados;
    }

    @Override
    public Object next() {
        return empleados.get(position++);
    }

    @Override
    public boolean hasNext() {
        return !empleados.isEmpty() && position < empleados.size() ;
    }
}
