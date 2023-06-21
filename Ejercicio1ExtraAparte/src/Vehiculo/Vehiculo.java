package Vehiculo;
import java.util.Scanner;
public class Vehiculo {
private String marca;
private String modelo;
private int year;
private String tipo;

public Vehiculo(){

}
public void crearVehiculo(){
    Scanner scanner = new Scanner(System.in);
    //System.out.println("Digita la marca");
    //this.marca = scanner.next();
    //System.out.println("Digita el modelo");
    //this.modelo = scanner.next();
    //System.out.println("Digita el año");
    //this.year = scanner.nextInt();
    System.out.println("Digita el tipo");
    this.tipo = scanner.next();

}
public double moverse(int segundos){
       double distancia1 = 0;

    switch (tipo){
        case "carro":  distancia1 = 3 * segundos;
        break;
        case "moto":  distancia1 = 2 * segundos;
        break;
        case "bicicleta" : distancia1 = segundos;
        break;
    }
   return  distancia1;
}
public double frenar(double distancia){


    switch (tipo){
        case "carro":
              distancia  = distancia + 2;

            break;
        case "moto":
            distancia += 2;
        break;

    }
    return  distancia;
}

}
