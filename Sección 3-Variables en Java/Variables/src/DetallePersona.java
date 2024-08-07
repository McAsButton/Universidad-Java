public class DetallePersona {
    public static void main(String[] args) {
        // Detalle de una Persona
        String nombreCompleto = "Miguel Angel";
        int edad = 31;
        double estaturaD = 1.80;
        float estaturaF = 1.80F; // al ser una variable float se debe agregar la F al final del valor decimal porque por defecto Java toma los valores decimales como double
        String pais = "Colombia";
        boolean casado = true;
        char esCasado = 'S'; // S-Sí / N-No
        // Imprimir el valor de las variables
        System.out.println("Nombre: " + nombreCompleto);
        System.out.println("Edad: " + edad);
        System.out.println("Estatura: " + estaturaD);
        System.out.println("Estatura: " + estaturaF);
        System.out.println("País: " + pais);
        System.out.println("Casado: " + casado);
        System.out.println("Es casado: " + esCasado);
    }

}
