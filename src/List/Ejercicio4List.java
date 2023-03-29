package List;

/*
EUC que contenga un método que reciba un arreglo tipo int y que retorne otro arreglo que contenga
los mismos valores del arreglo recibidos por parámetros pero invertidos.
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ejercicio4List {
    List<Integer> numeros;

    public Ejercicio4List(List<Integer> numeros) {
        this.numeros = numeros;
    }

    public List<Integer> invertir() {
        List<Integer> invertido = new ArrayList<Integer>();

        for (int i = 0; i < this.numeros.size(); i++) {
            invertido.add(this.numeros.get(this.numeros.size() - i -1));
        }

        return invertido;
    }

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(7);
        Ejercicio4List e4 = new Ejercicio4List(arrayList);
        System.out.println(e4.invertir());
    }
}
