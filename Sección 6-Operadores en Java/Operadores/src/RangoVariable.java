import java.util.Scanner;

public class RangoVariable {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);

        System.out.print("Proporciona un dato entero: ");
        var dato = Integer.parseInt(consola.nextLine());

        // Revisamos si esta dentro de Rango (entre 1 y 10)
        var estaEnRango = dato >= 1 && dato <= 10;
        System.out.println("El dato proporcionado esta en el rango de 1 a 10: " + estaEnRango);

        //Revisar la logica inversa, si el dato no esta en el rango
        var noEstaEnRango = !(dato >= 1 && dato <= 10);
        System.out.println("El dato proporcionado NO esta en el rango de 1 a 10: " + noEstaEnRango);
    }

}
