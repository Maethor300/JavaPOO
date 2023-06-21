package Main;

import Vehiculo.Vehiculo;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vehiculo vehiculo1 = new Vehiculo();
        Vehiculo vehiculo2 = new Vehiculo();
        Vehiculo vehiculo3 = new Vehiculo();
        vehiculo1.crearVehiculo();
        vehiculo2.crearVehiculo();
        vehiculo3.crearVehiculo();
        System.out.println("Moverse");
        System.out.println( vehiculo1.moverse(10));
        System.out.println(vehiculo2.moverse(3));
        System.out.println(vehiculo3.moverse(4));
        double distancia = vehiculo1.moverse(10);
        double distancia1 = vehiculo2.moverse(3);
        double distancia2 = vehiculo3.moverse(4);
        System.out.println("Frenar");
        double frenar1 = vehiculo1.frenar(distancia);
        System.out.println(frenar1);
        double frenar2 = vehiculo2.frenar(distancia1);
        System.out.println(frenar2);
        double frenar3 = vehiculo3.frenar(distancia2);
        System.out.println(frenar3);
         if(frenar1 > frenar2 && frenar1 > frenar3){
             System.out.println("LLego primero el carro");
         } else if (frenar2 > frenar1 && frenar2 > frenar3) {
             System.out.println("LLego primero la moto");
         } else if (frenar3 > frenar1 && frenar3 > frenar2) {
             System.out.println("Llego primero la bicicleta");
         }
    }
}