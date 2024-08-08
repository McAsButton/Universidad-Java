public class CicloDoWhile {
    public static void main(String[] args) {
        System.out.println("*** Ciclo Do While ***");

        var contador = 1;
        do {
            System.out.println("contador = " + contador++);
        } while (contador <= 3);
    }

}
