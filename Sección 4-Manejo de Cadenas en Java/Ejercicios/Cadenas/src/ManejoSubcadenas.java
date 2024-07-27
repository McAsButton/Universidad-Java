public class ManejoSubcadenas {
    public static void main(String[] args) {
        // Tema de subcadenas
        // subString(inicio, fin) o subString(inicio)
        var cadena1 = "Hola Mundo";
        System.out.println("cadena = " + cadena1);

        // Extraer la subcadena de la posicion 0 a 4 (no incluyente) (Hola)
        var subcadena1 = cadena1.substring(0, 4);
        System.out.println("subcadena1 = " + subcadena1);

        // Extraer la subcadena de la posicion 5 al final (Mundo)
        var subcadena2 = cadena1.substring(5);
        System.out.println("subcadena2 = " + subcadena2);
        var subcadena3 = cadena1.substring(5, 10);
        System.out.println("subcadena3 = " + subcadena3);
    }

}
