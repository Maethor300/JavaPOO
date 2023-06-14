package Main;

import Cuenta.Cuenta;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cuenta cuenta = new Cuenta();
        boolean trueOr = true;
        cuenta.crearCuenta();
        do {
            System.out.println("---MENU---");

            System.out.println("Opcion 1 : Ingresar ");
            System.out.println("Opcion 2 : Retiro");
            System.out.println("Opcion 3 : Retirar 20%");
            System.out.println("Opcion 4 : Consultar Saldo");
            System.out.println("Opcion 5 : Consultar Datos");
            System.out.println("Opcion 6 : Salir");
            int num1 = scanner.nextInt();
            switch (num1){
                case 1 : cuenta.ingresar();
                    System.out.println("Saldo: " + cuenta.getSaldo());
                break;
                case 2 :
                    cuenta.retirar();
                    System.out.println("Saldo: " + cuenta.getSaldo());
                break;
                case 3:
                    cuenta.extraccionRapida();
                    System.out.println("Saldo: " + cuenta.getSaldo());
                case 4:
                    System.out.println(cuenta.getSaldo());
                break;
                case 5 :
                    cuenta.consultarDatos();
                break;
                case 6:
                    trueOr = false;
                break;
                default:
                    System.out.println("Error");
            }

        }while (trueOr);
    }
}