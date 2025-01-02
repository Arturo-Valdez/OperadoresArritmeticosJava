import java.util.Scanner;

public class EjercicioGeneracionTicketVenta {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.println("*** Generacion del ticket de venta ***");
        final double IVA = 0.16;

        System.out.print("Precio leche: ");
        var precioLeche = Double.parseDouble(consola.nextLine());

        System.out.print("Precio pan: ");
        var precioPan = Double.parseDouble(consola.nextLine());

        System.out.print("Precio tortillas: ");
        var precioTortillas = Double.parseDouble(consola.nextLine());

        System.out.print("Precio huevo: ");
        var precioHuevos = Double.parseDouble(consola.nextLine());

        System.out.print("Aplicar descuento (%)?: ");
        var descuentoPorcentaje = Integer.parseInt(consola.nextLine());

        //Calculo de subtotal (sin impuestos)
        var subtotal = precioHuevos + precioLeche + precioPan + precioTortillas;

        //Aplicar descuento
        var descuento = subtotal * (descuentoPorcentaje / 100.0);

        //Subtotal con descuento
        var subtotalConDescuento = subtotal - descuento;
        
        //Obtener impuesto a sumar al subtotal
        var impuestos  = subtotalConDescuento * IVA;
        
        //Total a pagar con impuestos
        var total = subtotalConDescuento + impuestos;


        //GENERANDO TICKET
        System.out.printf("""
                \n\t*** Tiecket de compra ***
                \n\tLeche             $%.2f
                \tPan               $%.2f
                \tTortillas         $%.2f
                \tHuevo             $%.2f
                \t-------------------------
                \tSubtotal          $%.2f
                \tDescuento(%d%%)    $%.2f
                \tImpuestos(16%%)    $%.2f
                \tTotal             $%.2f
                
                """,precioLeche,precioPan,precioTortillas,precioHuevos,subtotal,descuentoPorcentaje,
                subtotalConDescuento,impuestos,total);
    }
}
