 import java.util.Scanner;
import java.util.Date;
public class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.println("Digita el dia");
        int dia  = scanner.nextInt();
        System.out.println("Digita el mes");
        int mes = scanner.nextInt();
        System.out.println("Digita el año");
        int año = scanner.nextInt();
       Date miFecha = new Date(año - 1900 ,mes  ,dia);
       Date date = new Date();
       int getYears1 = date.getYear();
       int getYears2 = miFecha.getYear();
       int operacion = getYears1 - getYears2;
        if(operacion < 0){
            System.out.println("El tiempo de diferencia entre años es: " + operacion * - 1 + " Años Mas");
        }else {
            System.out.println("El tiempo de diferencia entre años es: " + operacion + " Años Menos");
        }


    }
}