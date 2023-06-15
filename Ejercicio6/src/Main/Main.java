package Main;

import Cafetera.Cafetera;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Cafetera cafetera = new Cafetera();
        cafetera.llenarCafetera();

        boolean trueOr = true;
        do {
            cafetera.vaciar();

            System.out.println("Cantidad Actual: " + cafetera.getCantidadActual());

            if (  cafetera.getCantidadActual() == 0) {
                trueOr = false;
            }else if(cafetera.getCantidadActual() < cafetera.ServirTaza()){
                trueOr = false;
            }
            cafetera.agregarCafe();
        }while(trueOr);
    }
}