package Main;

import Curso.Curso;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.crearCursos();
        System.out.println(Arrays.toString(curso.getAlumnos()));
        curso.calcularGananciaSemanal();
    }
}