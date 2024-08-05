import java.util.Scanner;

public class TicketVentaDescuento {
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

        System.out.print("Aplicar algun descuento? (%)");
        var descuentoPorcentaje = Integer.parseInt(consola.nextLine());

        // Calculamos el subtotal(sin impuestos)
        var subTotal = precioLeche + precioPan + precioLechuga + precioPlatanos;
        // Aplicamos el descuento
        var descuento = subTotal * (descuentoPorcentaje / 100.0);
        //Subtotal con descuento
        var subTotalDescuento = subTotal - descuento;
        // Calculamos el impuesto (16%)
        var impuesto = subTotalDescuento * 0.16;
        // Calculamos el total
        var costoTotalCompra = subTotalDescuento + impuesto;

        //Imprimimos el ticket de venta
        System.out.printf("""
                %nTicket de Venta
                ---------------
                Subtotal: $%.2f
                Descuento: $%.2f (%d%%)
                Impuesto (16%%): $%.2f
                Costo total: $%.2f
                """, subTotal, descuento, descuentoPorcentaje, impuesto, costoTotalCompra);
    }

}
