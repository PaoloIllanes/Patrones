package iterator.ejercicios;


import java.util.Stack;

public class ListD implements IList{
        private Stack<String> empleados;

    public ListD(){
        empleados= new Stack<>();
        }
        public void add(String value){
            empleados.push(value);
        }

        @Override
        public IteratorConcreteListD iterator() {
            return new IteratorConcreteListD(this.empleados);
        }
    }

