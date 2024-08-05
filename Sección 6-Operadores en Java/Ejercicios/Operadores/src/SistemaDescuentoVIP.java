import java.util.Scanner;

public class SistemaDescuentoVIP {
    public static void main(String[] args) {
        System.out.println("*** Sistema de Descuento VIP ***");
        // Definimos los valores con los que vamos a trabajar
        final var NO_PRODUCTOS_DESCUENTO = 10;
        var consola = new Scanner(System.in);

        // Solicitamos la cantidad de productos comprados hoy
        System.out.print("Ingrese la cantidad de productos comprados hoy: ");
        var cantidadProductos = Integer.parseInt(consola.nextLine());

        // Verificamos si el cliente tiene derecho a un descuento
        System.out.println("¿Tiene membresía de la tienda? (true/false): ");
        var tieneMembresia = Boolean.parseBoolean(consola.nextLine());

        // Verificamos si el cliente tiene derecho a un descuento
        var esElegibleDescuento = cantidadProductos >= NO_PRODUCTOS_DESCUENTO && tieneMembresia;
        
        System.out.println("Tienes acceso a un descuento: " + esElegibleDescuento);
    }

}
