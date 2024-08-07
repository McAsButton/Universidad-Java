public class OperadorOr {
    public static void main(String[] args) {
        System.out.println("*** Operador OR ***");
        boolean a = true, b = false;
        // Operador OR ||
        var resultado = a || b;
        System.out.println("a || b: " + resultado);

        a = false;
        b = false;
        resultado = a || b;
        System.out.println("a || b: " + resultado);
    }

}
