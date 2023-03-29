package List;

/*
- EUC que contenga un método que reciba un arreglo tipo String y que retorne otro arreglo que
contenga las cadenas que contengan números.
 */

import Array.Ejercicio5Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ejercicio5List {
    List<String> cadenas;

    public Ejercicio5List(List<String> cadenas) {
        this.cadenas = cadenas;
    }

    public List<String> numericas(){
        int contador = 0;
        List<String> resultado = new ArrayList<String>();



        for(String cad: this.cadenas){ //contar cuantos son numericos
            try{
                int num = Integer.parseInt(cad);
                resultado.add(Integer.toString(num));
                contador ++;
            }
            catch (NumberFormatException e){}

        }

        return resultado;
    }

    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<String>();
        arrayList.add("a");
        arrayList.add("1");
        arrayList.add("b");
        arrayList.add("2");
        arrayList.add("3");
        arrayList.add("z");
        Ejercicio5List e5 = new Ejercicio5List(arrayList);

        System.out.println(e5.numericas());
    }
}
