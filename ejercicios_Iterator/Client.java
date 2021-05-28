package iterator.ejercicios;


public class Client {

    public static void main (String[] args){

        ListA listA = new ListA();
        listA.add("Pedro1");
        listA.add("Pedro2");
        listA.add("Pedro3");
        listA.add("Pedro4");
        listA.add("Pedro5");

        ListB listB = new ListB();
        listB.add("Jhon1");
        listB.add("Jhon2");
        listB.add("Jhon3");
        listB.add("Jhon4");
        listB.add("Jhon5");

        ListC listC = new ListC();
        listC.add("Sergio1");
        listC.add("Sergio2");
        listC.add("Sergio3");
        listC.add("Sergio4");
        listC.add("Sergio5");

        ListD listD = new ListD();
        listD.add("Diego1");
        listD.add("Diego2");
        listD.add("Diego3");
        listD.add("Diego4");
        listD.add("Diego5");

        Iterator iterator = listA.iterator();
        while (iterator.hasNext()){
            System.out.println("Nombre: "+iterator.next());
        }
        iterator = listB.iterator();
        while (iterator.hasNext()){
            System.out.println("Nombre: "+iterator.next());
        }

        iterator = listC.iterator();
        while (iterator.hasNext()){
            System.out.println("Nombre: "+iterator.next());
        }

        iterator = listD.iterator();
        while (iterator.hasNext()){
            System.out.println("Nombre: "+iterator.next());
        }
    }

}
