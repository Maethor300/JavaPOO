package Main;

import Operacion.Operacion;
import Persona.Persona;

public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();
        Operacion operacion = new Operacion();
        persona.crearPersona();
        Persona persona1 = new Persona("Emma", 23, 69,1.65,"H" );
        Persona persona2 = new Persona("Daniel", 30, 80,1.70,"M" );
        Persona persona3 = new Persona("Enmanuel", 21, 75,1.77,"M" );
        Persona persona4 = new Persona("Manuela", 15, 55,1.50,"H" );
        int peso = persona.calcularIMC();
        System.out.println(persona.getName()+": "+ peso);
        int peso1 = persona1.calcularIMC();
        System.out.println(persona1.getName()+": "+ peso1);
        int peso2 = persona2.calcularIMC();
        System.out.println(persona2.getName()+": "+ peso2);
        int peso3 = persona3.calcularIMC();
        System.out.println(persona3.getName()+": "+ peso3);
        int peso4 = persona4.calcularIMC();
        System.out.println(persona4.getName()+": "+ peso4);
        int edad = persona.getYearsOld();
        int edad1 = persona1.getYearsOld();
        int edad2 = persona2.getYearsOld();
        int edad3 = persona3.getYearsOld();
        int edad4 = persona4.getYearsOld();
        operacion.conteoPeso(peso,peso1,peso2,peso3,peso4);
        operacion.esMayorDeEdad(edad,edad1,edad2,edad3,edad4);
        System.out.println("Cantidad bajo peso son: " + Operacion.conteo);
        System.out.println("Cantidad que estan bien de peso: " + Operacion.conteo1);
        System.out.println("Cantidad que tiene sobre peso: " + Operacion.conteo2);
        System.out.println("Cantidad de mayoria de edad: " + Operacion.conteoEdad1);
        System.out.println("Cantidad de menor de edad: " + Operacion.conteoEdad);



    }
}