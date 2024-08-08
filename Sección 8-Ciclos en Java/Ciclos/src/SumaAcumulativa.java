public class SumaAcumulativa {
    public static void main(String[] args) {
        System.out.println("*** Suma Acumulativa ***");
        
        final var MAXIMO = 5;
        var acumuladorSuma = 0;

        // *Iterar los valores ciclo while
        // var numero = 1;
        // while (numero <= MAXIMO) {
        //     // Imprimir lo que se va a sumar
        //     System.out.println("(acumuladorSuma + numero) -> " + acumuladorSuma + " + " + numero + " = " + (acumuladorSuma + numero));
        //     // Realizar la suma acumulativa
        //     acumuladorSuma += numero++; // acumuladorSuma = acumuladorSuma + numero;
        //     // Imprimir la suma parcial acumulada
        //     System.out.println("Suma parcial acumulada -> " + acumuladorSuma + "\n");
        // }
        // System.out.println("La suma de los primeros " + MAXIMO + " números es: " + acumuladorSuma);

        // *Iterar los valores ciclo do-while
        // var numero = 1;
        // do {
        //     // Imprimir lo que se va a sumar
        //     System.out.println("(acumuladorSuma + numero) -> " + acumuladorSuma + " + " + numero + " = " + (acumuladorSuma + numero));
        //     // Realizar la suma acumulativa
        //     acumuladorSuma += numero++; // acumuladorSuma = acumuladorSuma + numero;
        //     // Imprimir la suma parcial acumulada
        //     System.out.println("Suma parcial acumulada -> " + acumuladorSuma + "\n");
        // } while (numero <= MAXIMO);
        // System.out.println("La suma de los primeros " + MAXIMO + " números es: " + acumuladorSuma);

        // *Iterar los valores ciclo for
        for (var numero = 1; numero <= MAXIMO; numero++) {
            // Imprimir lo que se va a sumar
            System.out.println("(acumuladorSuma + numero) -> " + acumuladorSuma + " + " + numero + " = " + (acumuladorSuma + numero));
            // Realizar la suma acumulativa
            acumuladorSuma += numero; // acumuladorSuma = acumuladorSuma + numero;
            // Imprimir la suma parcial acumulada
            System.out.println("Suma parcial acumulada -> " + acumuladorSuma + "\n");
        }
        System.out.println("La suma de los primeros " + MAXIMO + " números es: " + acumuladorSuma);
    }

}
