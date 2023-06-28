package Puntos;
import java.util.Scanner;
public class Puntos {
    private float x1;
    private float x2;
    private float y1;
    private float y2;
    public void operacion(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digita las coordenadas");
        System.out.println("X1");
        this.x1 = scanner.nextFloat();
        System.out.println("X2");
        this.x2 = scanner.nextFloat();
        System.out.println("Y1");
        this.y1 = scanner.nextFloat();
        System.out.println("Y2");
        this.y2 = scanner.nextFloat();
        double operacion = Math.sqrt( ((x2 - x1) * (x2 - x1))  + ((y2 - y1) * (y2 - y1)));
        System.out.println(operacion);
    }
}
