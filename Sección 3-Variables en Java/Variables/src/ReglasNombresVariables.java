public class ReglasNombresVariables {
    public static void main(String[] args) {
        // Reglas para nombrar variables en Java
        String nombreCompleto = "Juan Perez"; // Correcto y buenas practicas
        System.out.println("nombreCompleto = " + nombreCompleto);
        String NombreCompleto = "Carlos Lara"; // Correcto pero no es una buena practica
        System.out.println("NombreCompleto = " + NombreCompleto);
        //String nombre-cliente = "Karla Lara"; // Incorrecto
        String nombre_cliente = "Karla Lara"; // Correcto pero no es una buena practica
        System.out.println("nombre_cliente = " + nombre_cliente);
        String _apellido = "Lara"; // Correcto y aceptable
        System.out.println("_apellido = " + _apellido);
        String $color = "Azul"; // Correcto y aceptable
        System.out.println("$color = " + $color);
        int totPzs = 10; // Correcto pero no es una buena practica (totPzs -> totalPiezas)
        System.out.println("totPzs = " + totPzs);
        int totalPiezas = 10; // Correcto y buenas practicas
        System.out.println("totalPiezas = " + totalPiezas);
        boolean casado = true; // Correcto, aun puede mejorar
        System.out.println("casado = " + casado);
        boolean esCasado = true; // Correcto y buenas practicas
        System.out.println("esCasado = " + esCasado);
        boolean isCasado = true; // Correcto y buenas practicas (is -> es) aunque depende del proyecto (mezcla de ingles y español)
        System.out.println("isCasado = " + isCasado);
        boolean tieneSaldo = false; // Correcto y buenas practicas
        System.out.println("tieneSaldo = " + tieneSaldo);
        boolean hasSaldo = false; // Correcto y buenas practicas (has -> tiene) aunque depende del proyecto (mezcla de ingles y español)
        System.out.println("hasSaldo = " + hasSaldo);
    }

}
