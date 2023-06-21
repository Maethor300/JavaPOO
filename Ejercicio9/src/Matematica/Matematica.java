package Matematica;

public class Matematica {
    private int numero1;
    private int numero2;
   public Matematica(){
   }
    public Matematica(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public void devolverMayor(){

        if(numero1 == numero2){
            System.out.println("Son iguales");
        }else if(numero1 < numero2) {
            System.out.println("El numero 2 es mayor");
        }else {
            System.out.println("El numero 1 es mayor");
        }
    }
    public double calcularPotencia(){
          double potencia;
          if(numero1 >= numero2){
                potencia = (Math.pow(numero1, numero2));
          }else {
              potencia = (Math.pow(numero2, numero1));
          }
          return potencia;
    }
    public void calculaRaiz(){
       double raiz;
       if(numero1 < numero2){
           raiz = Math.sqrt(numero1);
       }else {
           raiz = Math.sqrt(numero2);
       }
        System.out.println("La raiz es: " + raiz);
    }
    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
}
