package operacion;
import java.util.Scanner;
public class Operacion {
    Scanner scanner = new Scanner(System.in);
    private double numero1;
    private double numero2;

    public Operacion(){

    }

    public Operacion(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    public void crearOperacion(){
        System.out.println("Digita el numero uno: ");
        this.numero1 = scanner.nextDouble();
        System.out.println("Digita el numero dos: ");
         this.numero2 = scanner.nextDouble();
    }
    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }
    public double suma(){
        return numero1 + numero2;
    }
    public double resta(){
        return numero1 - numero2;
    }
    public double multi(){
        return numero1 * numero2;
    }
    public double division(){
        return numero1 / numero2;
    }
}
