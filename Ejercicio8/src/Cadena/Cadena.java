package Cadena;

import java.util.Scanner;

public class Cadena {
    private String frase ;
    private int longitud;
    public void mostrarVocales(){
        int conteo = 0;
        for (int i = 0; i < longitud; i++) {
            char vocal = frase.charAt(i);
            String toString = String.valueOf(vocal);

            if(toString.equals("a")|| toString.equals("e")||toString.equals("i")||toString.equals("o")||toString.equals("u")){
                conteo++;
            }
        }
        System.out.println("Cantidad de vocales: " + conteo);
    }
    public void invertirFrase(){
        String invertido = "";
        for (int i = longitud-1; i >= 0; i--) {
            char letra = frase.charAt(i);
            String Invertido = String.valueOf(letra);
            invertido = invertido + Invertido;
        }
        System.out.println("Invertido: " + invertido);

    }
    public void vecesRepetido(){

        int conteo = 0;
        int conteo2 = 0;
        String remplazar = frase.replace(" ","");
        int longitud1 = remplazar.length();
        String repetido = "";
        String letraRepetida = "";
        for (int i = 0; i < longitud1; i++) {
           int longitudRe = repetido.length();
            char letra = remplazar.charAt(i);
            String toString = String.valueOf(letra);

            for (int j = conteo2; j < longitudRe; j++) {
                char letra2 = repetido.charAt(j);
                String toString2 = String.valueOf(letra2);
                if(toString2.equals(toString)){
                    conteo++;
                    conteo2 = longitudRe;
                    letraRepetida = toString2;
                }

            }

            repetido = repetido + toString;

        }
        System.out.println("La Letra"+"["+letraRepetida +"]"+ " esta repetida " + conteo + " mas.");

    }
    public void compararLongitud(String palabra){
        String remplazar = frase.replace(" ","");
        String remplazar2 = palabra.replace(" ", "");
        int longitud1 = remplazar.length();
        int longitud2 = remplazar2.length();

        if(longitud1 == longitud2){
            System.out.println("El tamaño es igual");
        } else if (longitud1 > longitud2) {
            System.out.println("La palabra que ingresaste es mayor que la que viene por defecto");
        }else{
            System.out.println("La palabra es menor que la de defecto");
        }
    }
    public void unirFrases(String frase1){
        String fraseReal = "";
        int longitud1 = frase1.length();
        for (int i = 0; i < longitud1; i++) {
            char letra = frase1.charAt(i);
            String letraString = String.valueOf(letra);
            fraseReal = fraseReal + letraString + " ";
        }
        String unirTodo = frase.concat(fraseReal);

        System.out.println("La frase unida es: " + unirTodo);
    }
    public void reemplazar(String frase){
        Scanner scanner = new Scanner(System.in);
        int longitud = frase.length();
        String nuevaFrase = "";
        System.out.println("Digita una palabra o un Digito");
         String letra1 = scanner.nextLine();
        for (int i = 0; i < longitud; i++) {
            char letra = frase.charAt(i);
            String string = String.valueOf(letra);
            if(!string.equals("a")){
                nuevaFrase = nuevaFrase + string ;
            }else {
                nuevaFrase = nuevaFrase + letra1;
            }

        }
        System.out.println(nuevaFrase);
    }
    public void contiene(String frase){
        Scanner scanner = new Scanner(System.in);
        int longitud = frase.length();
        System.out.println("Digita un caracter");
        String caracter = scanner.nextLine();
        boolean opcion = false;
        for (int i = 0; i < longitud; i++) {
            char letra = frase.charAt(i);
            String stringLetra = String.valueOf(letra);
            if(stringLetra.equals(caracter)){
                 opcion = true;
            }

        }
        if(opcion){
            System.out.println("Contiene la letra o el caracter");
        }else {
            System.out.println("No esta");
        }
    }
    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
}
