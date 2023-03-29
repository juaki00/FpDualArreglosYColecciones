package Array;
/*
EUC que contenga un método que reciba un arreglo tipo int y que retorne otro arreglo que contenga
los mismos valores del arreglo recibidos por parámetros pero invertidos.
 */

import java.lang.reflect.Array;
import java.util.Arrays;

public class Ejercicio4Array {
    int[] numeros;

    public Ejercicio4Array(int[] numeros) {
        this.numeros = numeros;
    }

    public int[] invertir() {
        int[] invertido = new int[this.numeros.length];

        for (int i = 0; i < this.numeros.length; i++) {
            invertido[this.numeros.length - i - 1] = this.numeros[i];
        }

        return invertido;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        Ejercicio4Array e4 = new Ejercicio4Array(array);
        System.out.println("Array original: " + Arrays.toString(array) + "\nArray invertido: " + Arrays.toString(e4.invertir()));
    }
}
