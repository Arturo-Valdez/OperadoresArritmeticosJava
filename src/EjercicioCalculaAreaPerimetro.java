import java.util.Scanner;

public class EjercicioCalculaAreaPerimetro {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.println("*** Calculo Area y Perimetro de un Rectangulo ***");

        System.out.print("Ingresa la base del rectangulo: ");
        var base = Integer.parseInt(consola.nextLine());

        System.out.print("Ingresa la altura del rectangulo: ");
        var altura = Integer.parseInt(consola.nextLine());

        //Calcular Area
        var area = base * altura;

        //Calcular Perimetro
        var perimetro = 2 * (base + altura);

        System.out.printf("""
                \n*** Area y Perimetro ***
                \n\tBase = %d
                \tAltura = %d
                
                \tArea = %d
                \tPerimetro = %d
                """,base,altura,area,perimetro);
    }
}
