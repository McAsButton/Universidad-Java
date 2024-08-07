public class DetalleLibro {
    public static void main(String[] args) {
        // Detalle de un Libro
        String tituloLibro = "El señor de los anillos";
        int anioPublicacion = 1954;
        boolean libroDisponible = true;
        double precio = 500.50;
        // Imprimir el valor de las variables
        System.out.println("Titulo: " + tituloLibro);
        System.out.println("Año de Publicación: " + anioPublicacion);
        System.out.println("Disponible: " + libroDisponible);
        System.out.println("Precio: " + precio);
        // Modificar el titulo del libro
        tituloLibro = "El Señor de los Anillos";
        System.out.println("Titulo: " + tituloLibro);
    }

}
