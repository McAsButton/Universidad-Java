import java.util.Scanner;

public class SaludYFitness {
    public static void main(String[] args) {
        System.out.println("*** Salud y Fitness ***");

        // Constantes
        final var META_PASOS_DIARIOS = 10000;
        final var CALORIAS_POR_PASO = 0.04; // valor aproximado, kilocalorías

        // Pedimos los valores al usuario
        var consola = new Scanner(System.in);

        System.out.print("Ingresa tu nombre: ");
        var nombreUsuario = consola.nextLine();

        System.out.print("Ingresa los pasos caminados hoy: ");
        var pasosDiarios = Integer.parseInt(consola.nextLine());

        // Verificamos si la meta de pasos fue alcanzada
        var metaAlcanzada = (pasosDiarios >= META_PASOS_DIARIOS) ? "Sí :)" : "No :(";

        // Calculamos las calorías quemadas
        var caloriasQuemadas = pasosDiarios * CALORIAS_POR_PASO;

        // Mostramos los resultados
        System.out.printf("""
            %nUsuario: %s
            Pasos caminados hoy: %d
            Calorias quemadas: %.2f kcal
            Meta de pasos diarios alcanzada: %s
            -----------------------------------------
            La meta de pasos diarios es de %d pasos
            """, nombreUsuario, pasosDiarios, caloriasQuemadas, metaAlcanzada, META_PASOS_DIARIOS);
    }

}
