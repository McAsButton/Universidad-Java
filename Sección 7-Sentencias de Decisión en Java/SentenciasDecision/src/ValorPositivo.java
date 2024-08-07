import java.util.Scanner;

public class ValorPositivo {
    public static void main(String[] args) {
        System.out.println("*** Valor positivo ***");

        var consola = new Scanner(System.in);
        System.out.print("Proporciona un numero: ");
        var numero = Integer.parseInt(consola.nextLine());

        if (numero > 0) {
            System.out.println("El numero es positivo: " + numero);
        } else if (numero < 0) {
            System.out.println("El numero es negativo: " + numero);
        } else {
            System.out.println("Es cero: " + numero);
        }        
    }
}
