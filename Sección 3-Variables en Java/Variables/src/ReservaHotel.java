public class ReservaHotel {
    public static void main(String[] args) {
        System.out.println("*** Sistema de Reserva de Hoteles ***");

        // Definimos las variables
        var nombreCliente = "Miguel Santa";
        var diasEstancia = 7;
        var tarifaDiaria = 1200.00;
        var tieneVistaAlMar = true;

        // Mostrar el detalle de la reserva
        System.out.println("nombreCliente = " + nombreCliente);
        System.out.println("diasEstancia = " + diasEstancia);
        System.out.println("tarifaDiaria = " + tarifaDiaria);
        System.out.println("tieneVistaAlMar = " + tieneVistaAlMar);

        // Modificamos algunos valores
        diasEstancia = 5;
        tarifaDiaria = 800.00;
        tieneVistaAlMar = false;

        // Mostrar el detalle de la reserva
        System.out.println();
        System.out.println("Nuevos datos de la reservación: ");
        System.out.println("nombreCliente = " + nombreCliente);
        System.out.println("diasEstancia = " + diasEstancia);
        System.out.println("tarifaDiaria = " + tarifaDiaria);
        System.out.println("tieneVistaAlMar = " + tieneVistaAlMar);
    }

}
