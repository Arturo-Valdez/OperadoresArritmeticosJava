import java.util.Scanner;

public class RangoVariable {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        System.out.println("*** Rango de Variables");

        System.out.print("Proporciona un dato entero: ");
        var dato = Integer.parseInt(consola.nextLine());

        //Revisamos si esta dentro de rango
        var estaDentroRango = dato >= 1 && dato <=10;
        System.out.println("Variable Dentro de Rango (1 y 10) = " + estaDentroRango);

        //Revisar la logica inversa, si el dato esta fuera de rango
        var estaFueraRango = !(dato >= 1 && dato <=10);
        System.out.println("Variable Fuera de Rango (1 y 10) = " + estaFueraRango);
    }
}
