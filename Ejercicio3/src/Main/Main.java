package Main;

import operacion.Operacion;

public class Main {
    public static void main(String[] args) {
        Operacion operacion = new Operacion();
        operacion.crearOperacion();
        System.out.println("Suma: " + operacion.suma());
        System.out.println("Resta: " + operacion.resta());
        System.out.println("Multi: " + operacion.multi());
        System.out.println("Division: " + operacion.division());
    }
}