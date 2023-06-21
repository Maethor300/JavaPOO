package Main;
import java.util.Scanner;
import Cadena.Cadena;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cadena cadena = new Cadena();
        System.out.println("Digita una frase: ");
        String frase = scanner.nextLine();
        char first = frase.charAt(0);

        String fraseReal = " ";
        for (int i = 0; i < frase.length(); i++) {
            char letra = frase.charAt(i);
            String letraString = String.valueOf(letra);
            fraseReal = fraseReal + letraString + " ";
        }
        int longitud = fraseReal.length();
        cadena.setFrase(fraseReal);
        cadena.setLongitud(longitud);
         cadena.mostrarVocales();
         cadena.invertirFrase();
         cadena.vecesRepetido();
         cadena.compararLongitud("hamburgesa");
         cadena.unirFrases("unirFrase");
         cadena.reemplazar("finished");
         cadena.contiene("camarografo");
    }
}