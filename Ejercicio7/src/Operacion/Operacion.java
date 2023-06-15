package Operacion;

import Persona.Persona;

public class Operacion {
    public static int conteo = 0;
    public static int conteo1 = 0;
    public static int conteo2 = 0;
    public static int conteoEdad = 0;
    public static int conteoEdad1 = 0;

    public void conteoPeso(int peso, int peso1, int peso2, int peso3, int peso4){

         if(peso == -1){
             conteo++;
         }else if(peso == 0){
             conteo1++;
         }else if(peso == 1){
             conteo2++;
         }
        if(peso1 == -1){
            conteo++;
        }else if(peso1 == 0){
            conteo1++;
        }else if(peso1 == 1){
            conteo2++;
        }
        if(peso2 == -1){
            conteo++;
        }else if(peso2 == 0){
            conteo1++;
        }else if(peso2 == 1){
            conteo2++;
        }
        if(peso3 == -1){
            conteo++;
        }else if(peso3 == 0){
            conteo1++;
        }else if(peso3 == 1){
            conteo2++;
        }
        if(peso4 == -1){
            conteo++;
        }else if(peso4 == 0){
            conteo1++;
        }else if(peso4 == 1){
            conteo2++;
        }


    }
    public void esMayorDeEdad(int edad,int edad1, int edad2,int edad3,int edad4){

        if(edad < 18){
            conteoEdad++;
        }else {
            conteoEdad1++;
        }
        if(edad1 < 18){
            conteoEdad++;
        }else {
            conteoEdad1++;
        }
        if(edad2 < 18){
            conteoEdad++;
        }else {
            conteoEdad1++;
        }
        if(edad3 < 18){
            conteoEdad++;
        }else {
            conteoEdad1++;
        }
        if(edad4 < 18){
            conteoEdad++;
        }else {
            conteoEdad1++;
        }
    }
}
