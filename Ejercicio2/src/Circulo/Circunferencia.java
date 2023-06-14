package Circulo;
import java.util.Locale;
import java.util.Scanner;
public class Circunferencia {
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    private double radio;
    public double area;
    public double perimetro;
    public void Circunferencia(double radio){
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void crearCircunferencia(){
        this.radio = scanner.nextDouble();
    }
    public void area1(){
        this.area = Math.PI * radio * radio;
    }
    public void perimetro1(){
        this.perimetro = 2 * Math.PI * radio;
    }
}
