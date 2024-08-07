import java.util.Random;

public class NumerosAleatorios {
    public static void main(String[] args) {
        System.out.println(" *** Números Aleatorios ***");
        var random = new Random();

        // Generar un número aleatorio entre 0 y 9
        var numeroAleatorio = random.nextInt(10);
        System.out.println("numeroAleatorio entre 0 y 9 = " + numeroAleatorio);

        // Generar un número aleatorio entre 1 y 10
        numeroAleatorio = random.nextInt(10) + 1;
        System.out.println("numeroAleatorio entre 1 y 10 = " + numeroAleatorio);

        // Generar un número flotante entre 0.0 y 1.0
        var numeroAleatorioFlotante = random.nextFloat();
        System.out.println("numeroAleatorioFlotante entre 0.0 y 1.0 = " + numeroAleatorioFlotante);

        // Simular el lanzamiento de un dado (número entre 1 y 6)
        var dado = random.nextInt(6) + 1;
        System.out.println("Lanzamiento de dado = " + dado);
    }

}
