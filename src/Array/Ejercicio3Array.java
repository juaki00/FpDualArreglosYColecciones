package Array;

import java.util.Arrays;

/*
EUC que contenga un método que reciba un arreglo tipo int y que retorne otro arreglo de enteros
que contenga los 2 valores centrales del mismo. Ojo: debe validar que solo pueda trabajar con
arreglos de longitud par
 */
public class Ejercicio3Array {
    int[] numeros;

    public Ejercicio3Array(int[] a) {
        if (a.length > 0 && a.length % 2 != 0) {
            throw new RuntimeException("Array con cantidad impar o igual a 0");
        } else {
            numeros = a;
        }
    }

    public int[] valoresCentrales() {
        return new int[]{
                this.numeros[this.numeros.length / 2 - 1],
                this.numeros[this.numeros.length / 2]
        };
    }

    @Override
    public String toString() {
        return "Ejercicio3Array{" +
                "numeros=" + Arrays.toString(numeros) +
                '}';
    }

    public static void main(String[] args) {

        int[] numeros = {1, 2, 3, 4};
        Ejercicio3Array e3 = new Ejercicio3Array(numeros);
        System.out.println(Arrays.toString(e3.valoresCentrales()));
    }
}
