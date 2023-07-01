package MostrarPrecioTotal;

import Alquiler.Alquiler;
import Pelicula.Pelicula;

public class MostrarPrecioTotal {

    public void mostrarPrecio(){
        Alquiler alquiler = new Alquiler();
        Pelicula pelicula = new Pelicula();
        String database[][] = pelicula.getDataBase();
        int total = alquiler.getPrecio();
        boolean trueOrfalse = true;
        for (int i = 0; i < database.length; i++) {
            for (int j = 0; j < 8; j++) {
                if(database[i][7] == null){
                   trueOrfalse = false;
                }
            }
        }
        if(trueOrfalse){
            System.out.print("No hay info");
        }else {
            System.out.print(total);
        }
    }
}
