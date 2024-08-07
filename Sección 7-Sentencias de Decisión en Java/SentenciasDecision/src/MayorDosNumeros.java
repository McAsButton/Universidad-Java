import java.util.Scanner;

public class MayorDosNumeros {
    public static void main(String[] args) {
        System.out.println("*** Programa que determina el mayor de dos números ***");

        var consola = new Scanner(System.in);

        System.out.print("Ingresa el primer número: ");
        var numero1 = Integer.parseInt(consola.nextLine());
        
        System.out.print("Ingresa el segundo número: ");
        var numero2 = Integer.parseInt(consola.nextLine());


        if (numero1 > numero2) {
            System.out.printf("El número %d es mayor que %d%n", numero1, numero2);
        } else if (numero1 < numero2) {
            System.out.printf("El número %d es mayor que %d%n", numero2, numero1);
        } else {
            System.out.println("Ambos números son iguales");
        }
    }

}
