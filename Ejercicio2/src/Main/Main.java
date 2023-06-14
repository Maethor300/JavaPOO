package Main;

import Circulo.Circunferencia;

public class Main {
    public static void main(String[] args) {
        Circunferencia circulo = new Circunferencia();
        System.out.println("Introduce el radio del circulo: ");
        circulo.crearCircunferencia();
        System.out.println("Radio: " + circulo.getRadio());

        System.out.println("Area: " + circulo.area1());

        System.out.println("Perimetro: " + circulo.perimetro1());
    }
}