package Main;

import Matematica.Matematica;

public class Main {
    public static void main(String[] args) {
        int aleatorio1 = (int) (Math.random() * 10);
        int aleatorio2 = (int) (Math.random() * 10);
        Matematica matematica = new Matematica(aleatorio1, aleatorio2);
        System.out.println("Numero 1: " + matematica.getNumero1()+ " Numero 2: " + matematica.getNumero2());
        matematica.devolverMayor();
        System.out.println("La potencia es: " + matematica.calcularPotencia());
        matematica.calculaRaiz();
    }
}