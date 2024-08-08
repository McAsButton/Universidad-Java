import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        System.out.println("*** Calculadora ***");

        // Variables
        var consola = new Scanner(System.in);
        var salir = false;
        var numero1 = 0.0;
        var numero2 = 0.0;

        // menu de opciones
        while (!salir) {
            System.out.print("""
                    Operaciones disponibles:
                    1. Sumar
                    2. Restar
                    3. Multiplicar
                    4. Dividir
                    5. Salir
                    Elige una opción:\s""");
            var opcion = consola.nextInt();

            if (opcion >= 1 && opcion <= 4) {
                System.out.print("Ingresa el primer número: ");
                numero1 = consola.nextDouble();
                System.out.print("Ingresa el segundo número: ");
                numero2 = consola.nextDouble();
            }

            switch (opcion) {
                case 1 -> System.out.printf("El resultado de la suma %.2f + %.2f es: %.2f%n%n", numero1, numero2,
                        numero1 + numero2);
                case 2 -> System.out.printf("El resultado de la resta %.2f - %.2f es: %.2f%n%n", numero1, numero2,
                        numero1 - numero2);
                case 3 -> System.out.printf("El resultado de la multiplicación %.2f * %.2f es: %.2f%n%n", numero1,
                        numero2, numero1 * numero2);
                case 4 -> {
                    if (numero2 == 0) {
                        System.out.println("No se puede dividir entre cero\n");
                    } else {
                        System.out.printf("El resultado de la división %.2f / %.2f es: %.2f%n%n", numero1, numero2,
                                numero1 / numero2);
                    }
                }
                case 5 -> salir = true;
                default -> System.out.println("Opción inválida \n");
            }
        }
        System.out.println("Gracias por utilizar la calculadora");
        consola.close();
    }

}
