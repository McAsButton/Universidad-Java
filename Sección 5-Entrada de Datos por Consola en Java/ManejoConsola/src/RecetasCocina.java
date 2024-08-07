import java.util.Scanner;

public class RecetasCocina {
    public static void main(String[] args) {
        System.out.println("*** Recetas de Cocina ***");
        var consola = new Scanner(System.in);

        // Nombre de la receta
        System.out.print("Ingresa el nombre de la receta: ");
        var nombreReceta = consola.nextLine();

        // Ingredientes
        System.out.print("Ingresa los ingredientes (separados por comas): ");
        var ingredientes = consola.nextLine();

        // Tiempo de preparación
        System.out.print("Ingresa el tiempo de preparación en minutos: ");        
        var tiempoPreparacion = Integer.parseInt(consola.nextLine());

        // Dificultad
        System.out.print("Ingresa la dificultad (fácil, media, difícil): ");
        var dificultad = consola.nextLine();

        // Imprimir la receta
        System.out.println("\n--- Receta de Cocina ---");
        System.out.println("Nombre Receta: " + nombreReceta);
        System.out.println("Ingredientes: " + ingredientes);
        System.out.println("Tiempo de preparación: " + tiempoPreparacion + " minutos");
        System.out.println("Dificultad: " + dificultad);

        consola.close();
    }

}
