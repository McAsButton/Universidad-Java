public class OperadorAnd {
    public static void main(String[] args) {
        System.out.println("*** Operador AND ***");
        boolean a = true, b = false;
        // Operador AND &&
        var resultado = a && b;
        System.out.println("a && b: " + resultado);

        a = true;
        b = true;
        resultado = a && b;
        System.out.println("a && b: " + resultado);
    }

}
