package Movil;
import java.util.Scanner;
public class Movil {
    private String marca;
    private int precio;
    private String modelo;
    private double memoriaRam;
    private double almacenamiento;
    private int codigo[] = new int[7];

    public Movil() {

    }

    public Movil(String marca, int precio, String modelo, double memoriaRam, double almacenamiento, int codigo[]) {
        this.marca = marca;
        this.precio = precio;
        this.modelo = modelo;
        this.memoriaRam = memoriaRam;
        this.almacenamiento = almacenamiento;
        this.codigo = codigo;
    }

    public void CargarCelular() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digita la Marca: ");
        this.marca = scanner.nextLine();
        System.out.println("Digita el precio: ");
        this.precio = scanner.nextInt();
        System.out.println("Digita el modelo: ");
        this.modelo = scanner.next();
        System.out.println("Memoria Ram: ");
        this.memoriaRam = scanner.nextDouble();
        System.out.println("Almacenamiento");
        this.almacenamiento = scanner.nextDouble();
    }

    public void ingresarCodigo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digita el codigo del celular: ");
        System.out.println("Recuerda que son 7 Digitos");
        for (int i = 1; i <= 7; i++) {
            System.out.println("Digito " + i);
            this.codigo[i - 1] = scanner.nextInt();
        }
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(double memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public double getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(double almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public int[] getCodigo() {
        return codigo;
    }

    public void setCodigo(int[] codigo) {
        this.codigo = codigo;
    }
}
