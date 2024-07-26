public class Constantes {
    public static void main(String[] args) {
        System.out.println("***Uso de Constantes en Java***");
        // Definir una constante
        final var DIAS_SEMANA = 7;
        System.out.println("DIAS_SEMANA = " + DIAS_SEMANA);
        //DIAS_SEMANA = 8; // Error: cannot assign a value to final variable DIAS_SEMANA
        final var PI = 3.1416;
        System.out.println("PI = " + PI);
        System.out.println("Math.PI = " + Math.PI);
        final var MENSAJE_BIENVENIDA = "Bienvenid@ a la Universidad Java";
        System.out.println("MENSAJE_BIENVENIDA = " + MENSAJE_BIENVENIDA);
        final var MINUTOS_POR_SEGUNDO = 60;
        System.out.println("MINUTOS_POR_SEGUNDO = " + MINUTOS_POR_SEGUNDO);
    }

}
