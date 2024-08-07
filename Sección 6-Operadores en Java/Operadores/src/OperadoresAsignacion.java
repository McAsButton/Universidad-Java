public class OperadoresAsignacion {
    public static void main(String[] args) {
        System.out.println("*** Operadores de Asignación ***");
        // Operador de asignación simple
        var miNumero = 10; // Asignamos el valor 10 a la variable miNumero
        int miNumero2; // Declaramos la variable miNumero2 de tipo entero
        miNumero2 = 15; // Asignamos el valor 15 a la variable miNumero2
        System.out.println("miNumero2: " + miNumero2);

        // Operadores de asignación compuestos
        // +=
        miNumero += 5; // Equivale a: miNumero = miNumero + 5
        System.out.println("+=: " + miNumero);
        // -=, *=, /= y %=
        miNumero *= 2; // Equivale a: miNumero = miNumero * 2
        System.out.println("*=: " + miNumero);

        // Asignacion de variables multiples
        int a = 10, b = 15, c = 20; // Declaramos e inicializamos las variables a, b y c, las variables deben ser del mismo tipo y deben ser inicializadas con su valor respectivo
        System.out.printf("a: %d, b: %d, c: %d\n", a, b, c);
    }

}
