import java.util.Scanner;

public class EjercicioAutenticacion {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.println("*** Sistema de Autenticacion ***");

        //Credenciales autorizadas
        final var USUARIO = "admin";
        final var PASS = "admin123";

        System.out.print("Ingresa el usuario: ");
        var autUsuario = consola.nextLine();

        System.out.print("Ingresa el contraseña: ");
        var autPass = consola.nextLine();

        //Validacion que los valores sean iguales
        var autenticador = autUsuario.equals(USUARIO) && autPass.equals(PASS);
        System.out.println("Los datos son correctos?: " + autenticador);


    }
}
