package Ahorcado;
import java.util.Arrays;
import java.util.Scanner;
public class Ahorcado {
    private String palabra [];
    private int palabrasEncontradas = 0;
    private int jugadasMaximas;
    public Ahorcado(){

    }
    public Ahorcado(String[] palabra, int palabrasEncontradas, int jugadasMaximas) {
        this.palabra = palabra;
        this.palabrasEncontradas = palabrasEncontradas;
        this.jugadasMaximas = jugadasMaximas;
    }
    public int crearJuego(){
       Scanner scanner = new Scanner(System.in);
       System.out.println("Digita una palabra");
       String palabra = scanner.nextLine();
       String palabraSinEspacio = palabra.replace(" ","");
        int longitud = palabraSinEspacio.length();
        this.palabra = new String[longitud];
        for (int i = 0; i < longitud; i++) {
            char letra = palabraSinEspacio.charAt(i);
            String letraPalabra = String.valueOf(letra);
            this.palabra[i] = letraPalabra;
        }
        System.out.println("Digita la cantidad de jugadas maximas");
        int maximas = scanner.nextInt();
        this.jugadasMaximas = maximas;
        return maximas;
    }
    public void longitud(){
        System.out.println("Deberas encontrar " + this.palabra.length + " palabras");
    }
    public void buscar(String letra){

        boolean trueOrfalse = true;
        for (int i = 0; i < this.palabra.length; i++) {
            if(palabra[i].equals(letra)){

                trueOrfalse = true;
                break;
            }else {
                trueOrfalse = false;
            }
        }
         if(trueOrfalse){
             System.out.println("Esta la palabra");
         }else {
             System.out.println("No esta la palabra");
         }
    }
    public String encontradas(int maximas){
        Scanner scanner = new Scanner(System.in);

        String letra = "";
        int conteoTrue = 0;
        int conteoFalse = this.palabra.length;
        int i  = 1;

        boolean trueOrfalse = true;
        boolean trueOrFalse2 = true;
        boolean trueOrFalse3 = true;
        String YaContado[] = new String[maximas];
        do {
            metodoIntentos();
            System.out.println("Digita una letra");
            Arrays.fill(YaContado, letra);
            letra = scanner.next();
            buscar(letra);
            for (int j = 0; j < this.palabra.length ;j++) {
                for (int l = 0; l < YaContado.length; l++) {
                    if(YaContado[l].equals(letra)){

                        trueOrFalse2 = true;
                    }else {
                        trueOrFalse2 = false;
                    }
                }
                if(trueOrFalse2){
                    trueOrFalse3 = false;
                }else {
                    if(this.palabra[j].equals(letra)){
                        conteoTrue++;
                        conteoFalse = this.palabra.length - conteoTrue;
                    }
                }

            }

            if(!trueOrFalse3){
                System.out.println("Ya encontraste esta letra");
            }
            System.out.println("Número de letras (encontradas, faltantes):"+" ("+ conteoTrue+","+ conteoFalse+")");
            i++;
            if(conteoFalse == 0){
                System.out.println("Encontraste la palabra");
                break;
            }else {
                System.out.println("No encontraste la palabra");
            }
            System.out.println(conteoFalse);
        }while(i <= maximas);

        return letra;
    }
    public void metodoIntentos(){
        System.out.println("Intentos restantes: " + this.jugadasMaximas--);
    }
    public void juego(){
        int maximas = crearJuego();
        System.out.println(Arrays.toString(getPalabra()));
        longitud();
        encontradas(maximas);
    }
    public String[] getPalabra() {
        return palabra;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }

    public int getPalabrasEncontradas() {
        return palabrasEncontradas;
    }

    public void setPalabrasEncontradas(int palabrasEncontradas) {
        this.palabrasEncontradas = palabrasEncontradas;
    }

    public int getJugadasMaximas() {
        return jugadasMaximas;
    }

    public void setJugadasMaximas(int jugadasMaximas) {
        this.jugadasMaximas = jugadasMaximas;
    }
}
