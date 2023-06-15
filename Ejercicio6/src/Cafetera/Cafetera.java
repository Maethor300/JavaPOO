package Cafetera;
import java.util.Scanner;
public class Cafetera {
       private double  capacidadMaxima;
       private  double cantidadActual ;

    public Cafetera() {

    }

    public void llenarCafetera(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cantidad Actual: ");
        double cantidadActual = scanner.nextDouble();
           this.capacidadMaxima = cantidadActual;
           this.cantidadActual = cantidadActual;
    }
    public double ServirTaza(){
         Scanner scanner = new Scanner(System.in);
        System.out.println("Indica el tamaño de la taza: ");
         double llenarTaza = scanner.nextDouble();
         if(llenarTaza > cantidadActual){

             System.out.println("Es mayor la capacidad: ");

             double resta = llenarTaza - cantidadActual;
             System.out.println("Se llena con lo que queda: " + resta);
             this.cantidadActual = cantidadActual - llenarTaza;
         }else {
             this.cantidadActual = cantidadActual - llenarTaza;

         }
         return llenarTaza;
    }
         public void vaciar(){
        Scanner scanner = new Scanner(System.in);
             System.out.println("Quieres Vaciar la cafetera S/N");
             String decision = scanner.nextLine();
             String mayuscula = decision.toUpperCase();
             if(mayuscula.equals("S")){
                 this.cantidadActual = 0;
             }
         }
         public void agregarCafe(){
             Scanner scanner = new Scanner(System.in);
             System.out.println("Quieres Agregar mas cafe S/N");
             String decision = scanner.nextLine();
             String mayuscula = decision.toUpperCase();
             if(mayuscula.equals("S")  ){
                 System.out.println("Agregar Cafe: ");
                 int cantidad = scanner.nextInt();
                 if(cantidad+cantidadActual > capacidadMaxima){
                     System.out.println("La cantidad se excede");
                     System.out.println("Cantidad Actual:" +cantidadActual);
                 }else {
                     this.cantidadActual = cantidadActual + cantidad;
                 }
             }
         }

    public double getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public double getCantidadActual() {
        return cantidadActual;
    }
}
