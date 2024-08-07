import java.util.Scanner;

public class SistemaReservaHotel {
    public static void main(String[] args) {
        System.out.println("*** Sistema de Reserva de Hotel ***");

        // Constantes
        final var PRECIO_HABITACION_SIN_VISTA = 150.50;
        final var PRECIO_HABITACION_CON_VISTA = 190.50;

        // Pedimos los valores al usuario
        var consola = new Scanner(System.in);

        System.out.print("Ingresa tu nombre: ");
        var nombreUsuario = consola.nextLine();

        System.out.print("Dias de hospedaje: ");
        var diasHospedaje = Integer.parseInt(consola.nextLine());

        System.out.print("Deseas habitación con vista al mar (true/false): ");
        var habitacionConVista = Boolean.parseBoolean(consola.nextLine());

        // Calculamos el costo total
        var costoTotal = 0.0;
        if (habitacionConVista) {
            costoTotal = PRECIO_HABITACION_CON_VISTA * diasHospedaje;
        } else {
            costoTotal = PRECIO_HABITACION_SIN_VISTA * diasHospedaje;
        }

        // Mostramos los detalles de la reserva
        System.out.printf("""
                %n-------------- Resumen de la Reserva --------------
                Nombre del Cliente: %s
                Dias de Hospedaje: %d
                Costo Total: $%.2f
                Habitación con Vista al Mar: %s
                --------------------------------------------------
                """
                , nombreUsuario, diasHospedaje, costoTotal, habitacionConVista ? "Sí" : "No");
    }

}
