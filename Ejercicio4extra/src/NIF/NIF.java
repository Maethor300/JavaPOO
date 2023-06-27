package NIF;
import java.util.Scanner;
public class NIF {
    private long numeroDNI;
    private String letra;
    public void crearNIF(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digita tu DNI");
        this.numeroDNI = scanner.nextLong();
        String listaNIF [] = {
              "T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"
        };
        long division = numeroDNI % 23;
        int indice = (int) division;
        String numero = listaNIF[indice];
        this.letra = numero;
    }
    public long getNumeroDNI() {
        return numeroDNI;
    }

    public void setNumeroDNI(long numeroDNI) {
        this.numeroDNI = numeroDNI;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }
}
