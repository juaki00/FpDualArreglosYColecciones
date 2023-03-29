package Array;

/*
    EUC que contenga un método que reciba un arreglo tipo String y que retorne otro arreglo que
    contenga las cadenas que contengan números.
 */

import java.util.Arrays;

public class Ejercicio5Array {
    String[] cadenas;

    public Ejercicio5Array(String[] cadenas) {
        this.cadenas = cadenas;
    }

    public String[] numericas(){
        int contador = 0;
        String[] resultado;

        for(String cad: this.cadenas){ //contar cuantos son numericos
            try{
                int num = Integer.parseInt(cad);
                contador ++;
            }
            catch (NumberFormatException e){}
        }

        resultado = new String[contador];
        contador = 0;

        for(String cad: this.cadenas){
            try{
                int num = Integer.parseInt(cad);
                resultado[contador] = cad;
                contador ++;
            }
            catch (NumberFormatException e){}

        }

        return resultado;
    }

    public static void main(String[] args) {
        String[] cadenas = {"Hola","4","Si","2","3"};
        Ejercicio5Array e5 = new Ejercicio5Array(cadenas);

        System.out.println(Arrays.toString(e5.numericas()));
    }
}
