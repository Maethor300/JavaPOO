package MostrarAllPeliculas;

import Pelicula.Pelicula;

public class MostrarAllPeliculas {
    Pelicula pelicula = new Pelicula();
    String database[][] = pelicula.getDataBase();
    public void mostrarAllPeliculas(){
        for (int i = 0; i < database.length; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(database[i][j]+ " ");
            }
            System.out.println();
        }

    }
}
