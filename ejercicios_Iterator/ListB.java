package iterator.ejercicios;


public class ListB implements IList {

        private String[] empleados;
        private int position;

    public ListB(){
            position=0;
            empleados= new String[5];
        }
        public void add(String value){
            empleados[position]= value;
            position++;
        }

        @Override
        public IteratorConcreteListB iterator() {
            return new IteratorConcreteListB(this.empleados);
        }
    }

