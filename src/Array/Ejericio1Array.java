package Array;

/*
EUC que contenga un método que reciba un arreglo tipo int y que retorne true (verdadero) si en la
primera o en la última posición hay un 6, y falso (false) si no.
*/

public class Ejericio1Array {

    public Ejericio1Array() {
    }

    public boolean empiezaTerminaEn6(int[] a) {
        return a != null && a.length > 0 && (a[0] == 6 | a[a.length -1] == 6);
    }

    public static void main(String[] args) {
        Ejericio1Array e1 = new Ejericio1Array();
        int arrayNull[] = null;
        int arrayVacio[] = new int[0];
        int array[] = {1, 2, 3, 4, 5, 1};

        System.out.println(e1.empiezaTerminaEn6(array));
    }
}
