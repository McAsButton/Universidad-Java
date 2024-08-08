import java.util.Scanner;

public class JuegoAdivinanza {
    public static void main(String[] args) {
        System.out.println("*** Juego de Adivinanza ***");

        var consola = new Scanner(System.in);

        var numeroSecreto = (int) (Math.random() * 50);
        var intentos = 0;
        var numeroJugador = 0;
        final var MAX_INTENTOS = 10;

        while (numeroJugador != numeroSecreto && intentos < MAX_INTENTOS) {
            System.out.print("Ingrese un número entre 0 y 50: ");
            numeroJugador = Integer.parseInt(consola.nextLine());
            System.out.println("Intento # " + ++intentos);
            if (numeroJugador < numeroSecreto) {
                System.out.println("El número secreto es mayor");
            } else if (numeroJugador > numeroSecreto) {
                System.out.println("El número secreto es menor");
            }
        }

        if (intentos < MAX_INTENTOS) {
            System.out.println(
                    "Felicidades, adivinaste el número secreto: " + numeroSecreto + " en " + intentos + " intentos");
        } else {
            System.out.println("Lo siento, te has quedado sin intentos. El número secreto era: " + numeroSecreto);
        }
        consola.close();
    }

}
