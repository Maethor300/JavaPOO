package BuscarTitulo;
import Menu.Menu;
import Pelicula.Pelicula;

import java.util.Scanner;
public class BuscarTitulo {
    public void buscarPelicula(){
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu();
        System.out.println("Digita el nombre de la pelicula que desees buscar");
        String nombre = scanner.nextLine();
        Pelicula pelicula = new Pelicula();
        String[][] database = pelicula.getDataBase();
        boolean noEsta = true;
        for (int i = 0; i < database.length; i++) {
            for (int j = 0; j < 5; j++) {
                if(database[i][j]== null){
                    System.out.println("La base de datos esta vacia");
                    menu.menu();
                }else {
                    if(database[i][0].equals(nombre)){
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
