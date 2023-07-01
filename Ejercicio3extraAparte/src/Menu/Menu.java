package Menu;
import Alquiler.Alquiler;
import BuscarFecha.BuscarFecha;
import BuscarGenero.BuscarGenero;
import BuscarTitulo.BuscarTitulo;
import MostrarAllPeliculas.MostrarAllPeliculas;
import Pelicula.Pelicula;
import PeliculasDisponibles.PeliculasDisponibles;

import java.util.Scanner;

public class Menu {
    public void menu(){
        Pelicula pelicula = new Pelicula();
        Alquiler alquiler = new Alquiler();
        MostrarAllPeliculas  mostrarMovie = new MostrarAllPeliculas();
        BuscarGenero buscarGenero = new BuscarGenero();
        PeliculasDisponibles peliculasDisponibles = new PeliculasDisponibles();
        BuscarTitulo buscarTitulo = new BuscarTitulo();
        BuscarFecha buscarFecha = new BuscarFecha();
        Scanner scanner = new Scanner(System.in);
        boolean trueOrFalse = true;

        do {
            System.out.println("----MENU----");
            System.out.println("1: Crear Pelicula");
            System.out.println("2: Crear alquiler");
            System.out.println("3: Listar Todas las peliculas");
            System.out.println("4: Listar Todos los alquileres");
            System.out.println("5: Buscar una pelicula por titulo");
            System.out.println("6: Buscar una pelicula por genero");
            System.out.println("7: Buscar un alquiler por fecha");
            System.out.println("8: Consultar valor");
            System.out.println("9: Salir");
            int escojer = scanner.nextInt();
            switch (escojer){
                case 1:

                        if(pelicula.getCount() == 1){
                            pelicula.setCount(1);
                            pelicula.CrearPelicula();
                        }else {

                            pelicula.CrearPelicula();
                        }
                break;
                case 2:
                    alquiler.crearAlquiler();
                break;
                case 3:
                    mostrarMovie.mostrarAllPeliculas();
                break;
                case 4:
                    peliculasDisponibles.mostrarPeliculas();
                break;
                case 5:
                    buscarTitulo.buscarPelicula();
                    break;
                case 6:
                     buscarGenero.BuscarGenero();
                case 7:
                    buscarFecha.buscarFecha();
                case 9:
                    trueOrFalse = false;
                break;
                default:

            }
            if(!trueOrFalse){
                break;
            }
        }while (true);
    }
}
