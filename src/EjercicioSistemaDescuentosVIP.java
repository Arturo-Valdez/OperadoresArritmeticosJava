import java.util.Scanner;

public class EjercicioSistemaDescuentosVIP {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.println("*** Sistema de Descuentos VIP ***");

        final var NO_PRODUCTOS_DESCUENTO = 10;

        System.out.print("Cuantos productos compraste hoy?: ");
        var cantidadProductos = Integer.parseInt(consola.nextLine());

        System.out.print("Tienes la membresia de la tienda (true/false): ");
        var tienesMembresia = Boolean.parseBoolean(consola.nextLine());

        var esElegibleDescuento = cantidadProductos >= NO_PRODUCTOS_DESCUENTO && tienesMembresia;

        System.out.println("Es elegible para el Descuento? = " + esElegibleDescuento);


    }
}
