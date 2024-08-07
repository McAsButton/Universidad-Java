import java.util.Scanner;

public class TiendaLineaDescuentos {
    public static void main(String[] args) {
        System.out.println("*** Tienda en Línea Descuentos ***");
        var consola = new Scanner(System.in);

        // Condiciones
        final var MONTO_COMPRA_DESCUENTO = 1000;

        System.out.print("Cual fue el total de tu compra: ");
        var montoCompra = Double.parseDouble(consola.nextLine());

        System.out.print("Eres miembro de la tienda (true/false): ");
        var esMiembro = Boolean.parseBoolean(consola.nextLine());

        //Calculamos el descuento
        var descuento = 0.0;
        // verificamos los casos
        if (montoCompra >= MONTO_COMPRA_DESCUENTO && esMiembro) {
            descuento = 0.1;
        } else if (esMiembro) {
            descuento = 0.05;
        } else {
            descuento = 0.0;
        }

        // Hacemos los calculos
        if(descuento != 0){
            var montoDescuento = montoCompra * descuento;
            var montoFinal = montoCompra - montoDescuento;
            System.out.printf("""
                    %nFelicidades!, tu compra tiene un descuento de %.0f%%
                    Monto de la compra: $%.2f
                    Monto del descuento: $%.2f
                    Total a pagar: $%.2f
                    """, descuento * 100, montoCompra, montoDescuento, montoFinal);
        }
        else{
            System.out.printf("""
                                %nNo obtuviste ningun tipo de descuento.
                                Te invitamos a que te unas a nuestro programa de membresias.
                                Monto de la compra: $%.2f
                                """, montoCompra);
        }
    }

}
