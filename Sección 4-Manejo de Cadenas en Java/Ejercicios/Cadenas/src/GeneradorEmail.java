public class GeneradorEmail {
    public static void main(String[] args) {
        // Generar un email
        //Nombre completo del usuario
        System.out.println("*** Generador de email ***");
        var nombreCompleto = "Miguel Angel Santa ";
        System.out.println("Nombre = " + nombreCompleto);

        // procesar o normalizar el nombre del usuario
        // 1. Eliminar los espacios en blanco al inicio y al final
        var nombreNormalizado = nombreCompleto.strip();
        // 2. Reemplazar los espacios en blanco por un punto
        nombreNormalizado = nombreNormalizado.replace(" ", ".");
        // 3. Convertir a minúsculas
        nombreNormalizado = nombreNormalizado.toLowerCase();
        System.out.println("Nombre Normalizado = " + nombreNormalizado);
        
        System.out.println();
        // Datos de la empresa
        var empresa = " Global Crypt ";
        System.out.println("Nombre empresa: " + empresa);
        var dominio = "com.co";
        System.out.println("Extension del dominio: " + dominio);

        // Quitamos los espacios en blanco y convertimos a minúsculas
        var empresaNormalizada = empresa.strip().toLowerCase().replace(" ", "");
        var dominioEmpresaNormalizado = empresaNormalizada + "." + dominio;

        System.out.println();
        // Creamos el email final
        var emailNormalizado = nombreNormalizado + "@" + dominioEmpresaNormalizado;
        System.out.println("Email: " + emailNormalizado);
    }

}
