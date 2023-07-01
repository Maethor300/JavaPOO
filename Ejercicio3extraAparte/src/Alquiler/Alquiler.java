package Alquiler;
import Menu.Menu;
import Pelicula.Pelicula;

import java.util.Locale;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Date;
import java.time.LocalDate;

import Pelicula.Pelicula;

public class Alquiler {
    private String peliculaAlquilada;
    private LocalDate fechaIncio;
    private LocalDate fechaFin;
    private static int precio ;

    public void crearAlquiler(){
        Menu menu = new Menu();
        Pelicula pelicula = new Pelicula();
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Nombre de la pelicula");
        String name = scanner.nextLine();
        this.peliculaAlquilada = name;
        System.out.println("Ingrese una fecha Inicio (formato: yyyy-MM-dd):");
        String fechaTexto = scanner.nextLine();
        LocalDate fecha = LocalDate.parse(fechaTexto);
        this.fechaIncio = fecha;
        System.out.println("Ingrese una fecha Final (formato: yyyy-MM-dd):");
        String fechaTexto2 = scanner.nextLine();
        LocalDate fecha2 = LocalDate.parse(fechaTexto2);
        this.fechaFin= fecha2;
        String dataBase[][] = pelicula.getDataBase();
        System.out.println("Digita el precio");
        this.precio = this.precio + scanner.nextInt();
        for (int i = 0; i < dataBase.length; i++) {
            for (int j = 0; j < 8; j++) {
                if(dataBase[0][0] == null){
                    System.out.println("No hay peliculas disponibles");
                    pelicula.CrearPelicula();
                }else {
                     if(dataBase[i][0].equals(this.peliculaAlquilada)&& dataBase[i][4].equals("true")){
                         dataBase[i][4] = "false";
                         String fechaIncioString = String.valueOf(fechaIncio);
                         dataBase[i][5] = fechaIncioString;
                         String fechaFinString = String.valueOf(fechaFin);
                         dataBase[i][6] = fechaFinString;
                         String valor = String.valueOf(precio);
                         dataBase[i][7] = valor;
                         menu.menu();
                     }
                }
            }
            System.out.println();
        }

    }
    public String getPeliculaAlquilada() {
        return peliculaAlquilada;
    }

    public void setPeliculaAlquilada(String peliculaAlquilada) {
        this.peliculaAlquilada = peliculaAlquilada;
    }

    public LocalDate getFechaIncio() {
        return fechaIncio;
    }

    public void setFechaIncio(LocalDate fechaIncio) {
        this.fechaIncio = fechaIncio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
