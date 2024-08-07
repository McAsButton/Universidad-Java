import java.util.Scanner;

public class SistemaEnvios {
    public static void main(String[] args) {
        System.out.println("*** Sistema de envíos ***");
        
        // Crear objeto Scanner
        var consola = new Scanner(System.in);
        // Variables
        final var COSTO_NACIONAL = 10;
        final var COSTO_INTERNACIONAL = 20;

        // Ingresar destino
        System.out.print("Ingrese el destino del paquete (nacional o internacional): ");
        var destino = consola.nextLine().strip().toLowerCase();

        // Ingresar peso
        System.out.print("Ingrese el peso del paquete (en kg): ");
        var peso = Double.parseDouble(consola.nextLine());

        // Calcular costo switch mejorada  
        Double costoEnvio = switch (destino) {
            case "nacional" -> peso * COSTO_NACIONAL;
            case "internacional" -> peso * COSTO_INTERNACIONAL;
            default -> {
                System.out.println("Destino no válido");
                yield null;
            }
        };

        // var costoEnvio = 0.0;
        // if (destino.equals("nacional")) {
        //     costoEnvio = peso * COSTO_NACIONAL;
        // } else if (destino.equals("internacional")) {
        //     costoEnvio = peso * COSTO_INTERNACIONAL;
        // } else {
        //     System.out.println("Destino no válido");
        // }

        // Mostrar costo
        if (costoEnvio != null)
            System.out.printf("El costo de envío es: $%.2f", costoEnvio);
    }

}
