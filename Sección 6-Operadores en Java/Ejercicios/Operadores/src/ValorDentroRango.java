import java.util.Scanner;

public class ValorDentroRango {
    public static void main(String[] args) {
        System.out.println("*** Valor dentro de un rango ***");
        // Definimos los limites del rango
        final var MINIMO = 0;
        final var MAXIMO = 5;
        //Soliciamos un valor entre 0 y 5
        System.out.print("Ingrese un valor entre 0 y 5: ");
        var dato = Integer.parseInt(new Scanner(System.in).nextLine());
        // Verificamos si el valor ingresado esta dentro del rango
        var estaDentroRango = dato >= MINIMO && dato <= MAXIMO;
        System.out.println("El valor " + dato + " esta dentro del rango: " + estaDentroRango);
        
    }

}
