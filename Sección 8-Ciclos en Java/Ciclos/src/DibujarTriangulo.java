import java.util.Scanner;

public class DibujarTriangulo {
    public static void main(String[] args) {
        System.out.println("*** Dibujar un triangulo ***");
        var consola = new Scanner(System.in);
        System.out.print("Proporciona el numero de filas: ");
        var numeroFilas = Integer.parseInt(consola.nextLine());

        for (var fila = 1; fila <= numeroFilas; fila++) {
            var espacios = " ".repeat(numeroFilas - fila);
            var asteriscos = "*".repeat(2 * fila - 1);
            System.out.println(espacios + asteriscos);
        }
        consola.close();
    }

}
