import java.util.Scanner;

public class EstacionAnioMejorado {
    public static void main(String[] args) {
        System.out.println("*** Programa que determina la estación del año ***");

        var consola = new Scanner(System.in);

        System.out.print("Ingresa el mes del año (1-12): ");
        var mes = Integer.parseInt(consola.nextLine());

        // Uso de switch
        var estacion = switch (mes) {
            case 1, 2, 12 -> "Invierno";
            case 3, 4, 5 -> "Primavera";
            case 6, 7, 8 -> "Verano";
            case 9, 10, 11 -> "Otoño";
            default -> "Estación desconocida";
        };

        System.out.printf("La estación del año para el mes %d es: %s%n", mes, estacion);
    }

}
