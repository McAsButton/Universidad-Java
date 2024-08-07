import java.util.Scanner;

public class EstacionAnio {
    public static void main(String[] args) {
        System.out.println("*** Programa que determina la estación del año ***");

        var consola = new Scanner(System.in);

        System.out.print("Ingresa el mes del año (1-12): ");
        var mes = Integer.parseInt(consola.nextLine());

        var estacion = "Estación desconocida";

        // Las condiciones no requieren llaves si solo hay una instrucción
        if (mes == 1 || mes == 2 || mes == 12)
            estacion = "Invierno";
        else if (mes == 3 || mes == 4 || mes == 5)
            estacion = "Primavera";
        else if (mes == 6 || mes == 7 || mes == 8)
            estacion = "Verano";
        else if (mes == 9 || mes == 10 || mes == 11)
            estacion = "Otoño";

        System.out.printf("La estación del año para el mes %d es: %s%n", mes, estacion);
    }

}
