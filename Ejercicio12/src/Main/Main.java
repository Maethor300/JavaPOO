package Main;

import Persona.Persona;

import java.util.Date;
public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.crearPersona();
        System.out.println(persona.getDate());
        persona.calcularEdad();
        persona.menorQue();
        System.out.println(persona.mostrarPersona());
    }
}