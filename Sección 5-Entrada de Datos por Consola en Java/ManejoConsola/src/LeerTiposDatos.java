import java.util.Scanner;

public class LeerTiposDatos {
    public static void main(String[] args) {
        // Leer distintos tipos de datos
        // Leer un entero (int)
        var consola = new Scanner(System.in);
        System.out.print("Proporciona tu edad: ");
        var edad = consola.nextInt();
        System.out.println("edad = " + edad);
        // Leer un tipo de dato double
        System.out.print("Proporciona tu altura: ");
        var altura = consola.nextDouble();
        System.out.println("altura = " + altura);
        // Consumir el salto de línea
        consola.nextLine(); // Esto se hacer porque los metodos nextInt, nextDouble, etc. No consumen el salto de línea que se introduce al presionar enter
        // Leer un tipo string
        System.out.print("Proporciona tu nombre: ");
        var nombre = consola.nextLine();
        System.out.println("nombre = " + nombre);
        // Leer double o int sin usar los metodos nextInt o nextDouble
        // Conversion de datos
        System.out.print("Proporciona un valor entero: ");
        // var enteroString = consola.nextLine();
        // var entero = Integer.parseInt(enteroString);
        var entero = Integer.parseInt(consola.nextLine());
        System.out.println("entero = " + entero);
        // Tipo flotante
        System.out.print("Proporciona un valor flotante: ");
        var flotante = Float.parseFloat(consola.nextLine());
        System.out.println("flotante = " + flotante);
        // Double.ParseDouble()
        // Boolean.ParseBoolean()
        // Long.parseLong()
        // Short.parseShort()
        // Byte.parseByte()
        // etc.
        consola.close();
    }

}
