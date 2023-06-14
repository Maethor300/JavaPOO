package Circulo;
import java.util.Locale;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Circunferencia {
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    private double radio;
    public String area;
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
    public String area1(){
        DecimalFormat df = new DecimalFormat("#.##");
        String string =  String.valueOf(Math.PI * radio * radio);
       String decimalFormat = df.format(Math.PI * radio * radio);
        this.area = string;
         return decimalFormat;
    }
    public String perimetro1(){
        DecimalFormat df = new DecimalFormat("#.##");
        this.perimetro = 2 * Math.PI * radio;
        String string = df.format(2 * Math.PI * radio);
        return string;
    }
}
