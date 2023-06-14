package Main;

import rectangulo.rectangulo;

public class Main {
    public static void main(String[] args) {
       rectangulo rectangulo = new rectangulo();
       rectangulo.crearRectangulo();
        System.out.println("Superficie: " + rectangulo.superficie());
        System.out.println("Perimetro: " + rectangulo.perimetro());
        System.out.println("Visualizacion: ");
        rectangulo.dibujo();
    }
}