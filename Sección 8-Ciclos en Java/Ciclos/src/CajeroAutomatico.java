import java.util.Scanner;

public class CajeroAutomatico {
    public static void main(String[] args) {
        System.out.println("*** Cajero Automático ***");

        final var SALDO_INICIAL = 1000.0;
        var saldo = SALDO_INICIAL;
        var consola = new Scanner(System.in);

        var salir = false;
        while (!salir) {
            System.out.print("""
                1. Consultar saldo
                2. Retirar dinero
                3. Depositar dinero
                4. Salir
                Elige una opción:\s""");
            var opcion = consola.nextInt();

            switch(opcion){
                case 1 -> System.out.printf("Tu saldo es: %.2f%n%n", saldo);
                case 2 -> {
                    System.out.print("Ingresa la cantidad a retirar: ");
                    var retiro = consola.nextDouble();
                    if (retiro > saldo) {
                        System.out.println("Saldo insuficiente \n");
                    } else {
                        saldo -= retiro;
                        System.out.printf("Retiro exitoso, tu saldo es: %.2f%n%n", saldo);
                    }
                }
                case 3 -> {
                    System.out.print("Ingresa la cantidad a depositar: ");
                    var deposito = consola.nextDouble();
                    saldo += deposito;
                    System.out.printf("Depósito exitoso, tu saldo es: %.2f%n%n", saldo);
                }
                case 4 -> salir = true;
                default -> System.out.println("Opción inválida \n");
            }
        }
        System.out.println("Gracias por utilizar el cajero automático");
        consola.close();
    }

}
