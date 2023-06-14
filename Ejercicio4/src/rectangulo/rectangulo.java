package rectangulo;
import java.util.Scanner;
public class rectangulo {
    private double base;
    private double altura;

    public void crearRectangulo(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la base: ");
        this.base = scanner.nextDouble();
        System.out.println("Introduce la altura: ");
        this.altura = scanner.nextDouble();
    }
    public double superficie(){
        return base * altura;
    }
    public double perimetro(){
        return (base + altura) * 2;
    }
    public void dibujo(){
        for (int i = 0; i < base; i++) {
            for (int j = 0; j < altura; j++) {
                if(i == 0 || j == 0 || i == base -1 || j == altura -1){
                    System.out.print("  *");
                }else {
                    System.out.print("   ");
                }
            }
            System.out.println(" ");
        }

    }
}
