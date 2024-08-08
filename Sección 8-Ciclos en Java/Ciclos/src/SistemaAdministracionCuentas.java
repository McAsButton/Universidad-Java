import java.util.Scanner;

public class SistemaAdministracionCuentas {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        var salir = false;
        // Comenzar con la iteración del menú
        while (!salir) {
            System.out.print("""
                    *** Sistema de Administración de Cuentas ***
                    Menu:
                    1. Crear cuenta
                    2. Eliminar cuenta
                    3. Salir
                    Escoge una opcion:\s""");
            var opcion = Integer.parseInt(consola.nextLine());
            // Evaluar la opción seleccionada
            switch (opcion) {
                case 1 -> System.out.println("Creando cuenta...\n");
                case 2 -> System.out.println("Eliminando cuenta...\n");
                case 3 -> {
                    System.out.println("Saliendo del sistema...");
                    salir = true;
                }
                default -> System.out.println("Opción no válida\n");
            }
        }
        System.out.println("Gracias por utilizar el sistema");
        consola.close();
    }

}
