package Array;

/*
EUC que contenga un método que reciba un arreglo tipo int y que retorne true (verdadero) este no
contiene un 2 o un 3 en sus valores, y falso (false) si contiene un 2 o un 3 en sus valores.
 */

public class Ejercicio2Array {
    int[] arreglo;

    public Ejercicio2Array(int[] arreglo) {
        this.arreglo = arreglo;
    }

    public boolean contiene2o3(int[] a){
        boolean contiene = false;
        int i = 0;

        while(i < a.length){
            if(a[i] == 2 || a[i] == 3){
                contiene = true;
                i = a.length;
            }
            i++;
        }
        return contiene;
    }

    public static void main(String[] args) {
        int[] a = {0,1,1,3};
        Ejercicio2Array e2 = new Ejercicio2Array(a);

        System.out.println(e2.contiene2o3(e2.arreglo));
    }
}
