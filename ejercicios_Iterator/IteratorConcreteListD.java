package iterator.ejercicios;


import java.util.Stack;

public class IteratorConcreteListD implements Iterator{
    private Stack<String> empleados;
    private int position;
    public IteratorConcreteListD(Stack<String> empleados){
        this.empleados=empleados;
        this.position=0;
    }

    @Override
    public Object next() {
        return this.empleados.get(position++);
    }

    @Override
    public boolean hasNext() {

        return !this.empleados.empty() && this.empleados.size() > position;
    }
}

