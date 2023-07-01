package PeliculasDisponibles;

import Menu.Menu;
import Pelicula.Pelicula;

public class PeliculasDisponibles {
    Pelicula pelicula = new Pelicula();

    public void mostrarPeliculas(){
        Menu menu = new Menu();
        String database[][] = pelicula.getDataBase();
        for (int i = 0; i < database.length; i++) {
            for (int j = 0; j < 5; j++) {
                if(database[i][j] == null){
                    System.out.println("No hay ninguna en la base de datos");
                    pelicula.CrearPelicula();
                }else {
                    if(database[i][4].equals("true")){
                        System.out.print("Disponibles: " + database[i][0] + " ");
                        break;
                    }else if(database[i][4].equals("false")){
                        System.out.print("No Disponibles: " + database[i][0] + " ");
                         break;
                    }
                }

            }

        }
    }
}
