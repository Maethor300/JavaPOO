package Main;

import Cancion.Cancion;

public class Main {
    public static void main(String[] args) {
        Cancion cancion = new Cancion("wake me up", "Avicii");
        System.out.println(cancion.getAutor());
        System.out.println(cancion.getTitulo());

    }
}