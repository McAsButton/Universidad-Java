public class ReemplazarSubcadenas {
    public static void main(String[] args) {
        // Reemplazar subcadenas en una cadena
        var cadena = "Hola Mundo";
        System.out.println("cadena = " + cadena);

        // Reemplazar "Mundo" por "a todos"
        var nuevaCadena = cadena.replace("Mundo", "a todos");
        System.out.println("nuevaCadena = " + nuevaCadena);

        // Reemplazar "Hola" por "Saludos"
        nuevaCadena = cadena.replace("Hola", "Saludos");
        System.out.println("nuevaCadena = " + nuevaCadena);
    }

}