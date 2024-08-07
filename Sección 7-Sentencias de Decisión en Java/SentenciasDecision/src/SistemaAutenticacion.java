import java.util.Scanner;

public class SistemaAutenticacion {
    public static void main(String[] args) {
        System.out.println("*** Sistema de autenticación ***");
        // Crear objeto Scanner
        var consola = new Scanner(System.in);

        // Variables
        final var USUARIO_VALIDO = "admin";
        final var CONTRASENA_VALIDA = "1234";

        // Ingresar usuario
        System.out.print("Ingrese el usuario: ");
        var usuario = consola.nextLine().strip();

        // Ingresar contraseña
        System.out.print("Ingrese la contraseña: ");
        var contrasena = consola.nextLine().strip();

        // Autenticar usuario
        // 4 Casos: 1. Usuario y contraseña correctos, 2. Usuario correcto y contraseña incorrecta, 3. Usuario incorrecto y contraseña correcta, 4. Usuario y contraseña incorrectos
        // if (usuario.equals(USUARIO) && contrasena.equals(CONTRASENA)) {
        //     System.out.println("Bienvenido al sistema!");
        // } else if (usuario.equals(USUARIO)) {
        //     System.out.println("Contraseña incorrecta");
        // } else if (contrasena.equals(CONTRASENA)) {
        //     System.out.println("Usuario incorrecto");
        // } else {
        //     System.out.println("Usuario y contraseña incorrectos");
        // }

        // Switch mejorada
        var mensajeAutenticacion = switch (usuario) {
            case USUARIO_VALIDO -> CONTRASENA_VALIDA.equals(contrasena) ? "Bienvenido al sistema!" : "Contraseña incorrecta";
            default -> CONTRASENA_VALIDA.equals(contrasena) ? "Usuario incorrecto" : "Usuario y contraseña incorrectos";
        };

        System.out.println(mensajeAutenticacion);
    }

}