package MesDelAño;
import java.util.Scanner;
public class MesDelAño {
    private String meses[] = {
            "enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"
    };
    private String mesSecreto = meses[9];
    public void AdivinarMes(){
        System.out.println("Adivine el mes secreto. Introduzca el nombre del mes en minúsculas:");
        Scanner scanner = new Scanner(System.in);
        String mes = scanner.next();
         do {

             if(mes.equals(mesSecreto)){
                 System.out.println("Haz acertado");
                 break;
             }else {

                 System.out.println("No ha acertado. Intente adivinarlo introduciendo otro mes:");
                  mes = scanner.next();
             }
         }while(true);

    }
}
