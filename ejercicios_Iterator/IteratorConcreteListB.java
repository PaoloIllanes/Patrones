package iterator.ejercicios;

public class IteratorConcreteListB implements Iterator{
    private String [] empleados;
    private int position;

    public IteratorConcreteListB(String [] empleados){
        this.empleados=empleados;
    }

    @Override
    public Object next() {
        return empleados[position++];
    }

    @Override
    public boolean hasNext() {
        return empleados.length != 0 && position < empleados.length ;
    }
}
