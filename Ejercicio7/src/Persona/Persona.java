package Persona;
import java.util.Scanner;
import java.util.Locale;
public class Persona {
   private String name;
   private int yearsOld;
   private double peso;
   private double altura;
   private String sexo;
   private String atributo1;

   public Persona(){
      name = "";
      yearsOld = 0;
      peso = 0;
      altura = 0;
      sexo = "";
      atributo1 = "";

   }
   public Persona(String name, int yearsOld, double peso, double altura,String sexo ) {
      this.name = name;
      this.yearsOld = yearsOld;
      this.peso = peso;
      this.altura = altura;
      this.sexo = sexo;


   }
   public void crearPersona(){
      Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
      System.out.println("Introduce tu nombre: ");
      this.name = scanner.nextLine();
      System.out.println("Edad: ");
      this.yearsOld = scanner.nextInt();
      System.out.println("Peso: ");
      this.peso = scanner.nextDouble();
      System.out.println("Altura: ");
      this.altura = scanner.nextDouble();
      System.out.println("Sexo: " + "Hombre/Mujer/Otro");
      scanner.nextLine();
      String sexo = scanner.nextLine();
      String mayuscula = sexo.toUpperCase();
      if(mayuscula.equals("H") || mayuscula.equals("M") || mayuscula.equals("O")){
         this.sexo = mayuscula;
      }
      System.out.println("Quieres agregar otro atributo? S/N");
      String decision = scanner.nextLine();
      String Mayuscula = decision.toUpperCase();
      if(Mayuscula.equals("S")){
         System.out.println("Digita lo que quieras: ");

          this.atributo1 = scanner.nextLine();
      }

   }
   public int calcularIMC(){


        double operacion = peso/(altura * 2);
        if(operacion < 20){
           System.out.println("Tu peso es bajo");
           return -1;
        }else if(operacion >= 20 && operacion <= 25) {
           System.out.println("Tu peso esta bien");
           return 0;
        }else if(operacion > 25) {
           System.out.println("Tienes sobre peso");
           return 1;
        }else {
           return 2;
        }
   }


   public String getName() {
      return name;
   }

   public int getYearsOld() {
      return yearsOld;
   }

   public String getPeso() {
      String peso1 = String.valueOf(peso);
      return peso1 + " KG";
   }

   public String getAltura() {
      return String.valueOf(altura) + " Mts";
   }

   public String getSexo() {
      return sexo;
   }

   public String getAtributo1() {
      return atributo1;
   }
}
