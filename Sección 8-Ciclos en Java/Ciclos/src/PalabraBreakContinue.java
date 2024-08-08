public class PalabraBreakContinue {
    public static void main(String[] args) {
        System.out.println("*** Break y Continue ***");

        //Ejemplo de break, imprimir solo el primer numero par
        System.out.println("Palabra break");
        for (var numero = 1; numero <= 10; numero++) {
            if (numero % 2 == 0) {
                System.out.print(numero + " ");
                break;
            }
        }

        //Ejemplo de continue, imprimir solo los numeros pares
        System.out.println("\nPalabra continue");
        for (var numero = 1; numero <= 10; numero++) {
            if (numero % 2 != 0) { //Si el numero es impar, no se imprime
                continue; //Se salta a la siguiente iteración
            }
            System.out.print(numero + " "); //Solo se imprime si es par
        }
    }

}