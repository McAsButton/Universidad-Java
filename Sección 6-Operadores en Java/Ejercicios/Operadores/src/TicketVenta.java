import java.util.Scanner;

public class TicketVenta {
    public static void main(String[] args) {
        System.out.println("*** Generación Ticket de Venta ***");
        var consola = new Scanner(System.in);
        // Definimos los valores con los que vamos a trabajar
        System.out.print("Precio leche: ");
        var precioLeche = Double.parseDouble(consola.nextLine());
        System.out.print("Precio pan: ");
        var precioPan = Double.parseDouble(consola.nextLine());
        System.out.print("Precio lechuga: ");
        var precioLechuga = Double.parseDouble(consola.nextLine());
        System.out.print("Precio plátanos: ");
        var precioPlatanos = Double.parseDouble(consola.nextLine());

        // Calculamos el subtotal(sin impuestos)
        var subtotal = precioLeche + precioPan + precioLechuga + precioPlatanos;
        // Calculamos el impuesto (16%)
        var impuesto = subtotal * 0.16;
        // Calculamos el total
        var costoTotalCompra = subtotal + impuesto;

        //Imprimimos el ticket de venta
        System.out.printf("""
                %nTicket de Venta
                ---------------
                Subtotal: $%.2f
                Impuesto (16%%): $%.2f
                Costo total: $%.2f
                """, subtotal, impuesto, costoTotalCompra);
    }

}
