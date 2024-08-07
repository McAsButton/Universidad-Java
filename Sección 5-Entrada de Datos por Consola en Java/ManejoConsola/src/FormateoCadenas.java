public class FormateoCadenas {
    public static void main(String[] args) {
        System.out.println(" *** Formateo de Cadenas ***");
        var nombre = "Matías";
        var edad = 35;
        var salario = 21000.50;

        // String.format
        var mensaje = String.format("Nombre: %s, Edad: %d, Salario: $%.2f", nombre, edad, salario);
        System.out.println(mensaje);

        // System.out.printf
        System.out.printf("Nombre: %s, Edad: %d, Salario: $%.2f %n", nombre, edad, salario);

        var numeroEmpleado = 12;
        // Formateo un bloque de texto
        mensaje = """
                %nDetalle Persona:\s
                -----------------------------------
                \tNombre: %s
                \tNp. Empleado: %04d
                \tEdad: %d años
                \tSalario: $%.2f
                """.formatted(nombre, numeroEmpleado, edad, salario);
        System.out.println(mensaje);

        // Formateo un bloque de texto con System.out.printf
        System.out.printf("""
                %nDetalle Persona:\s
                -----------------------------------
                \tNombre: %s
                \tNp. Empleado: %04d
                \tEdad: %d años
                \tSalario: $%.2f
                %n""", nombre, numeroEmpleado, edad, salario);
    }

}
