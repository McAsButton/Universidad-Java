public class OperadorNot {
    public static void main(String[] args) {
        System.out.println("*** Operador NOT ***");
        boolean a = false;
        // Operador NOT !
        var resultado = !a;
        System.out.println("!a: " + resultado);

        a = true;
        resultado = !a;
        System.out.println("!a: " + resultado);
    }

}
