package List;

import java.util.ArrayList;
import java.util.List;


public class Ejercicio2List {

    List<Integer> lista;

    public Ejercicio2List(List<Integer> lista) {
        this.lista = lista;
    }

    public boolean contiene2o3(){
        boolean contiene = false;
        int i = 0;

        while(i < this.lista.size()){
            if(this.lista.get(i) == 2 || this.lista.get(i) == 3){
                contiene = true;
                i = this.lista.size();
            }
            i++;
        }
        return contiene;
    }

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(2);
        arrayList.add(21);
        arrayList.add(32);
        arrayList.add(4);
        arrayList.add(5);
        Ejercicio2List e2 = new Ejercicio2List(arrayList);

        System.out.println(e2.contiene2o3());
    }
}
