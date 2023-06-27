package Curso;
import java.util.Scanner;
public class Curso {
    private String nombreCurso;
    private int cantidadHorasPorDia;
    private int cantidadDiasPorSemana;
    private String turno;
    private int precioPorHora;
    private   String  alumnos[] = new String[5];
    public Curso(){

    }

    public Curso(String nombreCurso, int cantidadHorasPorDia, int cantidadDiasPorSemana, String turno, int precioPorHora, String[] alumnos) {
        this.nombreCurso = nombreCurso;
        this.cantidadHorasPorDia = cantidadHorasPorDia;
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
        this.turno = turno;
        this.precioPorHora = precioPorHora;
        this.alumnos = alumnos;
    }
   public void cargarAlumnos(){
       for (int i = 1; i <= 5; i++) {
           System.out.println("Digita los nombres de tu alumnos");
           System.out.println("Almuno " + i);
           Scanner scanner = new Scanner(System.in);
           this.alumnos[i - 1] = scanner.nextLine();
       }
   }
   public void crearCursos(){
       Scanner scanner = new Scanner(System.in);
       System.out.println("Nombre del Curso: ");
       this.nombreCurso = scanner.nextLine();
       System.out.println("Cantidad de horas por Dia: ");
       this.cantidadHorasPorDia = scanner.nextInt();
       System.out.println("Cantidad de Dias por semana: ");
       this.cantidadDiasPorSemana = scanner.nextInt();
       scanner.nextLine();
       System.out.println("Turno : Mañana / Tarde: ");
       this.turno = scanner.nextLine();
       System.out.println("Precio por Hora: ");
       this.precioPorHora = scanner.nextInt();
       cargarAlumnos();
   }
   public void calcularGananciaSemanal(){
        int valor  = this.cantidadHorasPorDia * this.precioPorHora * 5 * this.cantidadDiasPorSemana;
       System.out.println("Ganancias semanales: " + valor);
   }
    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public int getCantidadHorasPorDia() {
        return cantidadHorasPorDia;
    }

    public void setCantidadHorasPorDia(int cantidadHorasPorDia) {
        this.cantidadHorasPorDia = cantidadHorasPorDia;
    }

    public int getCantidadDiasPorSemana() {
        return cantidadDiasPorSemana;
    }

    public void setCantidadDiasPorSemana(int cantidadDiasPorSemana) {
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public int getPrecioPorHora() {
        return precioPorHora;
    }

    public void setPrecioPorHora(int precioPorHora) {
        this.precioPorHora = precioPorHora;
    }

    public String[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(String[] alumnos) {
        this.alumnos = alumnos;
    }
}
