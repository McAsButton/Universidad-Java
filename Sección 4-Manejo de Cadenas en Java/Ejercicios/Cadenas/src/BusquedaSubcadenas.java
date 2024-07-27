public class BusquedaSubcadenas {
    public static void main(String[] args) {
        // Buscar una subcadena en una cadena
        // indexOf() - devuelve la posicion en la que se encuentra la primera coincidencia
        var cadena1 = "Hola Mundo";
        // Buscar subcadena "Hola"
        var indice1 = cadena1.indexOf("Hola");
        System.out.println("indice1 = " + indice1);
        // lastIndexOF() - devuelve la posicion en la que se encuentra la ultima coincidencia
        // Buscar subcadena "Mundo"
        var indice2 = cadena1.lastIndexOf("Mundo");
        System.out.println("indice2 = " + indice2);
        // Buscar subcadena que no existe devuelve -1 (indexOf y lastIndexOf)
        var indice3 = cadena1.indexOf("Java");
        System.out.println("indice3 = " + indice3);
    }

}
