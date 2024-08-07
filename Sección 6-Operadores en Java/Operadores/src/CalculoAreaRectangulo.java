import java.util.Scanner;

public class CalculoAreaRectangulo {
    public static void main(String[] args) {
        System.out.println("*** Cálculo de Área de un Rectángulo ***");
        var consola = new Scanner(System.in);

        // Solicitamos los datos al usuario
        System.out.print("Proporciona la base: ");
        var base = Integer.parseInt(consola.nextLine());
        System.out.print("Proporciona la altura: ");
        var altura = Integer.parseInt(consola.nextLine());

        // Calculamos el área del rectángulo
        var area = base * altura;
        System.out.println("Área del rectángulo: " + area);

        // Calculamos el perímetro del rectángulo
        var perimetroRectangulo = 2 * (base + altura);
        System.out.println("Perímetro del rectángulo: " + perimetroRectangulo);
    }

}
