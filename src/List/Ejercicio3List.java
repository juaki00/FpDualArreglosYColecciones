package List;

/*
EUC que contenga un método que reciba un arreglo tipo int y que retorne otro arreglo de enteros
que contenga los 2 valores centrales del mismo. Ojo: debe validar que solo pueda trabajar con
arreglos de longitud par
 */

import Array.Ejercicio3Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ejercicio3List {

    List<Integer> numeros;

    public Ejercicio3List(List<Integer> lista) {
        if (lista == null || lista.size() < 1 || lista.size() % 2 != 0) {
            throw new RuntimeException("Lista con cantidad impar o igual a 0");
        } else {
            numeros = lista;
        }
    }

    public List<Integer> valoresCentrales() {
        List<Integer> resultado = new ArrayList<>();

        resultado.add(this.numeros.get((this.numeros.size() / 2) -1));
        resultado.add(this.numeros.get(this.numeros.size() / 2));
        return resultado;
    }



    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(7);
        Ejercicio3List e3 = new Ejercicio3List(arrayList);
        System.out.println(e3.valoresCentrales());
    }
}
