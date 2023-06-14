package Cafetera;
import java.util.Scanner;
public class Cafetera {
       private double capacidadMaxima;
       private double cantidadActual;

    public Cafetera() {

    }

    public void llenarCafetera(){

        Scanner scanner = new Scanner(System.in);
        double cantidadActual = scanner.nextDouble();
        if(cantidadActual > capacidadMaxima ){
            System.out.println("¡Se sobrepasa de la capacidad!");
        }else {
            capacidadMaxima = cantidadActual;
        }
    }
}
