import java.util.Random;
import java.util.Scanner;

public class GeneradorIDUnico {
    public static void main(String[] args) {
        System.out.println(" *** Generador de ID Único ***");

        var consola = new Scanner(System.in);
        
        // Solicitar el nombre del empleado
        System.out.print("Proporciona el nombre del empleado: ");
        var nombre = consola.nextLine().trim();

        // Solicitar el apellido del empleado
        System.out.print("Proporciona el apellido del empleado: ");
        var apellido = consola.nextLine().trim();

        // Solicitar el año de nacimiento del empleado
        System.out.print("Proporciona el año de nacimiento del empleado: ");
        var anioNacimiento = Integer.parseInt(consola.nextLine().trim());

        // Generar aleatorio entre 1 y 9999
        var random = new Random();
        var numeroAleatorio = random.nextInt(9999) + 1;

        // Generar ID Único con los datos proporcionados (primeras dos letras del nombre y apellido en mayúsculas, dos ultimos dígitos del año de nacimiento y número aleatorio de 4 dígitos)
        var idUnico = String.format("%s%s%02d%04d", nombre.substring(0, 2).toUpperCase(), apellido.substring(0, 2).toUpperCase(), anioNacimiento % 100, numeroAleatorio);

        System.out.printf("""
                %nHola %s, 
                \tTu nuevo número de identificación (ID) generado por el sistema es: 
                \t%s
                \t!Felicidades!
                """, nombre, idUnico);
        
        consola.close();
    }

}
