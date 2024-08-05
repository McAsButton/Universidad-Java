public class OperadoresComparacion {
    public static void main(String[] args) {
        System.out.println("*** Operadores de Comparación ***");
        int a = 3, b = 2;
        // Operador de igualdad ==
        var resultado = (a == b);
        System.out.println("a == b: " + resultado);
        // Operador de desigualdad !=
        resultado = a != b;
        System.out.println("a != b: " + resultado);
        // Mayor que >
        resultado = a > b;
        System.out.println("a > b: " + resultado);
        // Mayor o igual que >=
        resultado = a >= b;
        System.out.println("a >= b: " + resultado);
        // Menor que <
        resultado = a < b;
        System.out.println("a < b: " + resultado);
        // Menor o igual que <=
        resultado = a <= b;
        System.out.println("a <= b: " + resultado);
    }

}
