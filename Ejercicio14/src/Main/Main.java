package Main;

import Movil.Movil;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Movil movil = new Movil();
        movil.CargarCelular();
        movil.ingresarCodigo();
        System.out.println(Arrays.toString(movil.getCodigo()));
    }
}