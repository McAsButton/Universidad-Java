public class ComparacionCadenas {
    public static void main(String[] args) {
        // Comparacion de cadenas (pool de cadenas)
        var cadena1 = "Java";
        var cadena2 = "Java"; // Se recupera del pool de cadenas (no se crea un nuevo objeto)
        var cadena3 = new String("Java"); // Se crea un nuevo objeto en memoria

        // Comparacion de cadenas (==) comparan las referencias de los objetos
        System.out.print("cadena1 es igual en referencia a cadena2: ");
        System.out.println(cadena1 == cadena2); // true

        // Comparamos cadena1 con cadena3 (referencias de objetos)
        System.out.print("cadena1 es igual en referencia a cadena3: ");
        System.out.println(cadena1 == cadena3); // false

        // Comparacion de cadenas (equals) comparan el contenido de los objetos
        System.out.print("cadena1 es igual en contenido a cadena3: ");
        System.out.println(cadena1.equals(cadena3)); // true        
    }

}
