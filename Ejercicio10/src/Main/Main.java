package Main;


import Array1.Array1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Array1 array1 = new Array1();
        array1.llenarArray();
        System.out.println("Array 1");
        System.out.println(Arrays.toString(array1.getArray1()));
        System.out.println("Array 2");
        System.out.println(Arrays.toString(array1.getArray2()));
        System.out.println("Array 1 ordenado");
        array1.ordenarArray1();
        System.out.println(Arrays.toString(array1.getArray1()));
        System.out.println("Reorganizar Array 2");
        array1.reorganizarArray2();
        System.out.println(Arrays.toString(array1.getArray2()));
    }
}