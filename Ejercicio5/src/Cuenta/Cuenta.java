package Cuenta;
import java.util.Scanner;
public class Cuenta {
    private int numeroCuenta;
    private long DNI;
    private int saldo;
    private double interes;
    public Cuenta(){
        numeroCuenta = 0;
        DNI = 0;
        saldo = 0;
        interes = 0;
    }

    public Cuenta(int numeroCuenta, long DNI, int saldo, double interes) {
        this.numeroCuenta = numeroCuenta;
        this.DNI = DNI;
        this.saldo = saldo;
        this.interes = interes;
    }
     public void crearCuenta(){
        Scanner scanner = new Scanner(System.in);
         System.out.println("Introduce el numero de Cuenta: ");
         this.numeroCuenta = scanner.nextInt();
         System.out.println("Introduce el numero de DNI: ");
         this.DNI = scanner.nextLong();
         System.out.println("Introduce el saldo Actual: ");
         this.saldo = scanner.nextInt();
     }
     public void ingresar(){
        Scanner scanner = new Scanner(System.in);
         System.out.println("Ingresa la cantidad: ");
         int cantidad = scanner.nextInt();
         this.saldo = cantidad + saldo;
     }
     public void retirar(){
        Scanner scanner = new Scanner(System.in);
         System.out.println("Ingresa la cantidad que deseas retirar: ");
         int retiro = scanner.nextInt();
         if(retiro > saldo){
             System.out.println("---WARNING---");
             System.out.println("¡Tu saldo es inferior que deseas retirar!");
             this.saldo = 0;
         }else{
             this.saldo = saldo - retiro;
         }
     }
     public void extraccionRapida(){
        Scanner scanner = new Scanner(System.in);
         System.out.println("Introduce el saldo a retirar");
        int veintePC = scanner.nextInt();
        double porcentaje = saldo * 0.20;
        if(veintePC > porcentaje){
            System.out.println("Error es mas del veinte porciento");
        }else {
            this.saldo = saldo - veintePC;
        }
     }
    public int getSaldo() {
        return saldo;
    }
}
