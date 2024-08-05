public class OperadoresUnarios {
    public static void main(String[] args) {
        System.out.println("*** Operadores Unarios ***");
        int a = 3, b = -2, resultado;
        // Operador unario +
        resultado = +a;
        System.out.println("Operador unario +: " + resultado);
        // Operador unario -
        resultado = -a;
        System.out.println("Operador unario -: " + resultado);

        // Operadores unarios incremento y decremento
        // Pre-incremento
        a = 3;
        resultado = ++a; //primero se incrementa y despues se usa el valor
        System.out.println("Pre-incremento ++: " + resultado);
        System.out.println("Valor de a: " + a);
        // Post-incremento
        a = 3;
        resultado = a++; //primero se usa el valor y despues se incrementa
        System.out.println("Post-incremento ++: " + resultado);
        System.out.println("Valor de a: " + a);
        // La variable en el pre-incremento se incrementa antes de asignar el valor a la variable resultado y en el post-incremento se incrementa después de asignar el valor a la variable resultado y en la siguiente instrucción.

        // Pre-decremento
        b = -2;
        resultado = --b; //primero de decrementa y despues se usa el valor
        System.out.println("Pre-decremento --: " + resultado);
        System.out.println("Valor de b: " + b);
        // Post-decremento
        b = -2;
        resultado = b--; //primero se usa el valor y despues se decrementa
        System.out.println("Post-decremento --: " + resultado);
        System.out.println("Valor de b: " + b);
        // La variable en el pre-decremento se decrementa antes de asignar el valor a la variable resultado y en el post-decremento se decrementa después de asignar el valor a la variable resultado y en la siguiente instrucción.
    }

}
