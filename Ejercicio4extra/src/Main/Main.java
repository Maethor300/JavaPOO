package Main;

import NIF.NIF;

public class Main {
    public static void main(String[] args) {
        NIF nif = new NIF();
        nif.crearNIF();
        System.out.println(nif.getNumeroDNI() +"-"+nif.getLetra());
    }
}