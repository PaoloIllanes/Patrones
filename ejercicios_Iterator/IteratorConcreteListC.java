package iterator.ejercicios;

import java.util.Vector;

public class IteratorConcreteListC implements Iterator {
    private Vector<String> empleados;
    private int position;
    public IteratorConcreteListC(Vector<String> empleados){
        this.empleados=empleados;
        this.position=0;
    }

    @Override
    public Object next() {
        return this.empleados.get(position++);
    }

    @Override
    public boolean hasNext() {
        return this.empleados.size() !=0 && this.empleados.size() > position;
    }
}