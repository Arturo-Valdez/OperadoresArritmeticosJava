import java.util.Scanner;

public class EjercicioSistemaPrestamoLibros {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.println("*** Sistema Prestamo de Libros");
        final var DISTANCIA_PERMITIDA_KM = 3.0;

        System.out.print("Cuenta con credencial de estudiante(true/false)? : ");
        var tieneCredencial = Boolean.parseBoolean(consola.nextLine());

        System.out.print("Ingrese la distanica donde recides?: ");
        var distanciaVivienda = Double.parseDouble(consola.nextLine());

        var prestamoLibro = tieneCredencial || distanciaVivienda <= DISTANCIA_PERMITIDA_KM;

        System.out.println("Prestamo Libro es? = " + prestamoLibro);
    }
}
