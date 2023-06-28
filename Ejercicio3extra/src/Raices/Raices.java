package Raices;

public class Raices {
    private int a;
    private int b;
    private int c;

    public Raices(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getDiscriminante(){
        int operacion = (b*b) -(4*a*c);
        System.out.println(operacion);
        return operacion;
    }
    public void tieneRaices(int resultado){
        if(resultado >= 0){
            System.out.println("Tiene raices");
        }
    }
    public void tieneRaiz(int resultado){
        if(resultado == 0){
            System.out.println("Tiene unica solucion");
        }
    }
    public void obtenerRaices(int resultado){
        double resultado1 = (-b + (Math.sqrt(resultado))) / (2*a);
        System.out.println(resultado1);
        double resultado2 = (-b - (Math.sqrt(resultado))) / (2*a);
        System.out.println(resultado2);
    }
    public void obtenerRaiz(){
       double resultado1 = -b / (2*a);
        System.out.println(resultado1);
    }
    public void calcular(int resultado){
        if(resultado == 0){
            tieneRaiz(resultado);
            obtenerRaiz();
        }else {
            tieneRaices(resultado);
            obtenerRaices(resultado);
        }
    }
}
