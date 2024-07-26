public class DetalleProducto {
    public static void main(String[] args) {
        // Variables para un detalle de un producto
        System.out.println("***Tienda en Linea (Detalle Producto)***");
        String nombreProducto = "Portátil Asus"; 
        double precioProducto = 1299.99;
        int cantidadDisponible = 10;
        boolean disponibleVenta = true;
        // Imprimir los valores de las variables
        System.out.println("nombreProducto = " + nombreProducto);
        System.out.println("precio = " + precioProducto);
        System.out.println("cantidadDisponible = " + cantidadDisponible);
        System.out.println("disponibleVenta = " + disponibleVenta);
        // Cambiar los valores de las variables
        nombreProducto = "Portátil Asus ROG Strix G15 Advantage Edition";
        precioProducto = 7000;
        cantidadDisponible = 0;
        disponibleVenta = false;
        // Imprimir los nuevos valores de las variables
        System.out.println();
        System.out.println("nombreProducto = " + nombreProducto);
        System.out.println("precio = " + precioProducto);
        System.out.println("cantidadDisponible = " + cantidadDisponible);
        System.out.println("disponibleVenta = " + disponibleVenta);
    }

}
