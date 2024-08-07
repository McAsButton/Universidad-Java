public class TipoVar {
    public static void main(String[] args) {
        System.out.println("***Uso de var en Java***");
        // Sin el uso de var
        String nombre1 = "Juan";
        System.out.println("nombre1 = " + nombre1);
        // Con el uso de var
        var nombre2 = "Carlos";
        System.out.println("nombre2 = " + nombre2);
        // Definir otras variables con var
        var edad = 30; // Se infiere tipo int
        System.out.println("edad = " + edad);
        var sueldo = 2000.5F; // Se infiere tipo float
        System.out.println("sueldo = " + sueldo);
        var esCasado = false; // Se infiere tipo boolean
        System.out.println("esCasado = " + esCasado);
        esCasado = true; // Se puede cambiar el valor de la variable boolean
        //esCasado = "No"; // Error: incompatible types: String cannot be converted to boolean (Porque la variable es de tipo boolean)

        // Se debe definir e inicializar la variable en la misma línea
        //var precio; // Error: cannot infer type for local variable precio
        //precio = 100.5; // Error: cannot infer type for local variable precio

        // Se debe poder inferir el tipo de dato
        //var apellido = null; // No se puede inferir el tipo de dato null
    }

}
