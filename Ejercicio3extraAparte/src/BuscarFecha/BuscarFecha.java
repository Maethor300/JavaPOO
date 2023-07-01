package BuscarFecha;

import Menu.Menu;
import Pelicula.Pelicula;

import java.util.Scanner;

public class BuscarFecha {
    public void buscarFecha(){
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu();
        System.out.println("Digita la fecha porfavor en formato (formato: yyyy-MM-dd):");
        System.out.println("Puedes ser la fecha de inicio o de salida");
        String fecha = scanner.nextLine();
        Pelicula pelicula = new Pelicula();
        String[][] database = pelicula.getDataBase();
        boolean noEsta = true;
        for (int i = 0; i < database.length; i++) {
            for (int j = 0; j < 5; j++) {
                if(database[i][j]== null){
                    System.out.println("La base de datos esta vacia");
                    pelicula.CrearPelicula();
                }else {
                    if(database[i][5] != null && database[i][5].equals(fecha)){
                        System.out.print(database[i][j]+" ");
                        noEsta = false;
                    } else if (database[i][6] != null && database[i][6].equals(fecha)) {
                        System.out.print(database[i][j]+" ");
                        noEsta = false;
                    }
                }

            }
        }
        if(noEsta){
            System.out.println("No esta");
        }
    }
}
