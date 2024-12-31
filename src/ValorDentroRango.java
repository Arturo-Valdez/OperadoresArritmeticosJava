import java.util.Scanner;

public class ValorDentroRango {
    public static void main(String[] args) {
        System.out.println("*** Valor Dentro Rango ***");

        //Definimos los limites

        final var MINIMO = 0;
        final var MAXIMO = 5;

        //Soliciar u valor entre 0 y 5
        System.out.printf("Proporciona un dato entre 0 y 5: ");
        var valor = Integer.parseInt(new Scanner(System.in).nextLine());

        //Verificacion si el dato esta dentro del rango
        var estaDentroRango = valor >= MINIMO && valor <=MAXIMO;

        System.out.println("Esta Dentro Rango? = " + estaDentroRango);

    }
}
