package Main;
import Entidad.libro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        libro libro1 = new libro();
        System.out.println("Introduce el ISBN del libro");
        int ISBN = scanner.nextInt();
         libro1.setISBN(ISBN);
        System.out.println(libro1.getISBN());
         scanner.nextLine();
        System.out.println("Introduce el titulo del libro");
        String titulo = scanner.nextLine();
        libro1.setTitulo(titulo);
        System.out.println(libro1.getTitulo());
        System.out.println("Introduce el autor del libro");
        String autor = scanner.nextLine();
        libro1.setAutor(autor);
        System.out.println(libro1.getAutor());
        System.out.println("Introduce el numero de paginas del libro");
        int paginas = scanner.nextInt();
        libro1.setNumeroPaginas(paginas);
        System.out.println(libro1.getNumeroPaginas());
    }
}