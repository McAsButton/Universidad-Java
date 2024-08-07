import java.util.Scanner;

public class SistemaCalificaciones {
    public static void main(String[] args) {
        System.out.println("*** Programa que determina la calificación obtenida ***");

        var consola = new Scanner(System.in);
        System.out.print("Ingresa la calificación obtenida (0-10): ");
        var calificacion = Double.parseDouble(consola.nextLine());
        var calificacionTexto = "";

        // Uso de if-else
        if (calificacion >= 9 && calificacion <= 10) {
            calificacionTexto = "A";
        } else if (calificacion >= 8 && calificacion < 9) {
            calificacionTexto = "B";
        } else if (calificacion >= 7 && calificacion < 8) {
            calificacionTexto = "C";
        } else if (calificacion >= 6 && calificacion < 7) {
            calificacionTexto = "D";
        } else if (calificacion >= 0 && calificacion < 6) {
            calificacionTexto = "F";
        } else {
            calificacionTexto = "Valor desconocido";
        }

        // Inprimir calificación obtenida
        System.out.printf("Calificación %.1f es equivalente a %s\n", calificacion, calificacionTexto);
    }

}
