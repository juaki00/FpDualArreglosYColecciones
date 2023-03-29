package List;

/*
EUC que contenga un método que reciba un arreglo tipo int y que retorne true (verdadero) si en la
primera o en la última posición hay un 6, y falso (false) si no.
*/

import java.util.ArrayList;
import java.util.List;

public class Ejercicio1List {
    List<Integer> lista;

    public Ejercicio1List(List<Integer> lista) {
        this.lista = lista;
    }

    public boolean empiezaTerminaEn6() {
        return this.lista.size() > 1 &&
                (this.lista.get(0) == 6 || this.lista.get(this.lista.size() - 1) == 6);
    }

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        Ejercicio1List e1 = new Ejercicio1List(arrayList);

        System.out.println(e1.empiezaTerminaEn6());
    }
}
