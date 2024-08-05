import java.util.Scanner;

public class SistemaPrestamoLibros {
    public static void main(String[] args) {
        System.out.println("*** Sistema de Préstamo de Libros ***");
        // Definimos los valores con los que vamos a trabajar
        final var DISTANCIA_PERMITIDA_KM = 3;
        var consola = new Scanner(System.in);

        // Solicitamos los datos al usuario
        System.out.print("Cuentas con credencial de estudiante (true/false): ");
        var tieneCredencial = Boolean.parseBoolean(consola.nextLine());
        System.out.print("Distancia de tu domicilio a la biblioteca (km): ");
        var distanciaDomicilio = Integer.parseInt(consola.nextLine());

        var esElegiblePrestamo = tieneCredencial || distanciaDomicilio <= DISTANCIA_PERMITIDA_KM;

        System.out.print("¿Puedes solicitar un libro en préstamo? " + esElegiblePrestamo);
    }

}
