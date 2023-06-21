package Figura;

import java.util.Scanner;
import java.util.Scanner;
public class Figura {
  private double lado;
  private double lado2;
  private double altura;

  private double radio;
  private double diagonal1;
  private double diagonal2;
  private String tipo;
  public void crearFigura(){
      Scanner scanner = new Scanner(System.in);
      System.out.println("Escribe el tipo de la figura");
      this.tipo = scanner.nextLine();
      switch (tipo){
          case "cuadrado":
              System.out.println("Digita el lado del cuadrado");
              this.lado = scanner.nextDouble();
          break;
          case "rectangulo":
              System.out.println("Digita el lado 1 del Rectangulo");
              this.lado = scanner.nextDouble();
              System.out.println("Digita el lado 2 del Rectangulo");
              this.lado2 = scanner.nextDouble();
          break;
          case "triangulo":
              System.out.println("Digita el lado 1 del Triangulo");
              this.lado = scanner.nextDouble();
              System.out.println("Digita la altura del triangulo");
              this.altura = scanner.nextDouble();
           break;
          case "circulo":
              System.out.println("Digita el radio del circulo");
              this.radio = scanner.nextDouble();
           break;
          case "hexagono":
              System.out.println("Digita los lados del Hexagono");
              this.lado = scanner.nextDouble();

           break;
          case "pentagono":
              System.out.println("Digita los lados del pentagono");
              this.lado = scanner.nextDouble();
          break;
          case "rombo":
              System.out.println("Digita los lados del Rombo");
              this.lado = scanner.nextDouble();
              System.out.println("Digita los lados del Diagonal 1 ");
              this.diagonal1 = scanner.nextDouble();
              System.out.println("Digita los lados del Diagonal 2 ");
              this.diagonal2 = scanner.nextDouble();

           break;
      }




  }
   public void operacion() {
       switch (tipo) {
           case "cuadrado":
                  double perimetroCua = lado * 4;
                  double areaCua = lado * lado;
               System.out.println("El perimetro del cuadrado es: " + perimetroCua);
               System.out.println("El area del cuadrado es: " + areaCua);
               break;
           case "rectangulo":
               double perimetroRec = lado + lado2 + lado + lado2;
               double areaRec = lado * lado2;
               System.out.println("El perimetro del rectangulo es: " + perimetroRec);
               System.out.println("El area del rectangulo: " + areaRec);
               break;
           case "triangulo":
                double perimetroTri = lado * 3;
                double areaTri =  lado * altura * 0.5;
               System.out.println("El perimetro del triangulo es: " + perimetroTri);
               System.out.println("El area del triangulo: " + areaTri);
               break;
           case "circulo":
                 double perimetroCir = Math.PI * radio * 2;
                 double areaCir = Math.PI * (radio * radio);
               System.out.println("El perimetro del triangulo es: " + perimetroCir);
               System.out.println("El area del circulo: " + areaCir);
               break;
           case "hexagono":
                  double perimetroHex = lado * 6;
                  double areaHex = 3 * Math.sqrt(3) / 2 * lado * lado;
               System.out.println("El perimetro del hexagono es: " + perimetroHex);
               System.out.println("El area del hexagono: " + areaHex);
               break;
           case "pentagono":
                 double perimetroPent = lado * 5;
                 double areaPent = 5 * Math.sqrt(5) / 5 * lado * lado;
               System.out.println("El perimetro del pentagono es: " + perimetroPent);
               System.out.println("El area del pentagono: " + areaPent);
               break;
           case "rombo":
                double perimetroRombo = lado * 4;
                double areaRombo = (diagonal1 * diagonal2) / 2;
               System.out.println("El perimetro del rombo es: " + perimetroRombo);
               System.out.println("El area del rombo: " + areaRombo);
               break;
       }
   }
}
