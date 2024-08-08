public class NumerosInversos {
    public static void main(String[] args) {
        System.out.println("*** Números inversos ***");

        var contador = 10;
        do {
            System.out.println("contador = " + contador--);
        } while (contador > 0);
    }

}
