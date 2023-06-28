package Main;

import Raices.Raices;

public class Main {
    public static void main(String[] args) {
        Raices raices = new Raices(1,-4,4);
        int resultado = raices.getDiscriminante();
        raices.calcular(resultado);


    }
}