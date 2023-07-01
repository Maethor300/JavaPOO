package Pelicula;
import Alquiler.Alquiler;
import Menu.Menu;

import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;
import java.time.LocalDate;
public class Pelicula {
      private String titulo;
      private String genero;
      private String año;
      private String duracion;
      private static int count = 0 ;
      private static String dataBase[][] =  new String[100][8];
      private static String comparacion [][] = new String[100][5];
      public void CrearPelicula(){
            Alquiler alquiler = new Alquiler();
            int count2;
            Menu menu = new Menu();

            Scanner scanner = new Scanner(System.in);


             do {
                   count2 = count;
                   boolean trueOrFalse1 = true;
                   String[] pelicula = new String[5];
                   System.out.println("Digita el titulo de la pelicula");
                   String titulo = scanner.nextLine();
                   System.out.print("Ingrese el genero de la pelicula");
                   String genero = scanner.nextLine();
                   System.out.println("Digita el año de la pelicula");
                   String año = scanner.nextLine();
                   System.out.println("Digita la duracion de la pelicula");
                   String duracion = scanner.nextLine();
                   boolean alquiladoOrNot = true;
                   String toString = String.valueOf(alquiladoOrNot);
                               this.titulo = titulo;
                               this.genero = genero;
                               this.año = año;
                               this.duracion = duracion;
                               pelicula[0] = titulo;
                               pelicula[1] = genero;
                               pelicula[2] = año;
                               pelicula[3] = duracion;
                               pelicula[4] = toString;

                   for (int i = count2 ; i < dataBase.length; i++) {
                         for (int j = 0; j < pelicula.length; j++) {
                               if(i > count2){
                                     dataBase[i][j] = "  *  ";
                               }else {

                                     for (int k = 0; k < comparacion.length; k++) {
                                           if(dataBase[i][0] != null && dataBase[i][0].equals(comparacion[k][0])){
                                                 System.out.println("La pelicula ya existe");
                                                   trueOrFalse1 = false;
                                                 break;
                                           }else {
                                                 if(k == 0&&j == 0){
                                                       this.count++;
                                                 }
                                                 dataBase[i][j] = pelicula[j];
                                           }
                                     }

                               }

                         }

                   }
                   for (int i = count2; i < dataBase.length; i++) {
                         for (int j = 0; j < 5; j++) {
                               this.comparacion[i][0] = titulo;
                         }
                   }
                   System.out.println("Quieres agregar otra S/N");
                   String desicion = scanner.nextLine();
                   String mayuscula = desicion.toUpperCase();
                   if(count < 2){
                         System.out.println("Tiene que agregar minimo 2 peliculas");
                   }else {
                         if(mayuscula.equals("N")){
                               menu.menu();
                               break;
                         }
                   }



             }while(true);
            System.out.println();
      }

      public String getTitulo() {
            return titulo;
      }

      public void setTitulo(String titulo) {
            this.titulo = titulo;
      }

      public String getGenero() {
            return genero;
      }

      public void setGenero(String genero) {
            this.genero = genero;
      }

      public String getAño() {
            return año;
      }

      public void setAño(String año) {
            this.año = año;
      }

      public String getDuracion() {
            return duracion;
      }

      public void setDuracion(String duracion) {
            this.duracion = duracion;
      }

      public String[][] getDataBase() {
            return dataBase;
      }

      public void setDataBase(String[][] dataBase) {
            this.dataBase = dataBase;
      }

      public int getCount() {
            return count;
      }

      public void setCount(int count) {
            this.count = this.count + count;
      }
}
