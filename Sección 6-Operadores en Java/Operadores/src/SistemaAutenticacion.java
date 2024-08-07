import java.util.Scanner;

public class SistemaAutenticacion {
    public static void main(String[] args) {
        System.out.println("*** Sistema de Autenticación ***");
        var consola = new Scanner(System.in);

        // Definimos los valores con los que vamos a trabajar
        final var USUARIO = "admin";
        final var PASSWORD = "1234";

        // Solicitamos los datos al usuario
        System.out.print("Usuario: ");
        var usuario = consola.nextLine();
        System.out.print("Contraseña: ");
        var password = consola.nextLine();

        var esAutenticado = usuario.equals(USUARIO) && password.equals(PASSWORD);

        System.out.println("¿El usuario está autenticado? " + esAutenticado);
    }

}
