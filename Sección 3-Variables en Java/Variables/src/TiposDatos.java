public class TiposDatos {
    public static void main(String[] args) {
        // Tipos de Datos en Java
        // Enteros (byte, short, int, long)(su valor por defecto es 0)
        byte tipoByte = 127; // -128 a 127
        System.out.println("tipoByte = " + tipoByte);
        short tipoShort = 32767; // -32768 a 32767
        System.out.println("tipoShort = " + tipoShort);
        int tipoInt = 2147483647; // -2147483648 a 2147483647
        System.out.println("tipoInt = " + tipoInt);
        long tipoLong = 987654321098765432L; // -9223372036854775808 a 9223372036854775807 //L o l para indicar que es long
        System.out.println("tipoLong = " + tipoLong);

        // Punto Flotante (float, double)(su valor por defecto es 0.0)
        float tipoFloat = 3.14F; // 1.4e-45 a 3.4028235e+38 //F o f para indicar que es float
        System.out.println("tipoFloat = " + tipoFloat);
        double tipoDouble = 3.1315; // 4.9e-324 a 1.7976931348623157e+308 //D o d para indicar que es double (opcional)
        System.out.println("tipoDouble = " + tipoDouble);

        // Caracter (su valor por defecto es '\u0000' o 0)
        char tipoChar = 'A'; // Caracteres Unicode
        System.out.println("tipoChar = " + tipoChar);
        tipoChar = 65; // Caracter Unicode equivalente a A
        System.out.println("tipoChar = " + tipoChar);
        tipoChar = '@';
        System.out.println("tipoChar = " + tipoChar);

        // Booleano (su valor por defecto es false)
        boolean tipoBoolean = true; // true o false
        System.out.println("tipoBoolean = " + tipoBoolean);
        tipoBoolean = false;
        System.out.println("tipoBoolean = " + tipoBoolean);

        //Tipos Object (Referencia)(su valor por defecto es null)
        String nombre = null; // Valor por defecto null (no apunta a ningun objeto)
        System.out.println("nombre = " + nombre);
        nombre = "Juan";
        System.out.println("nombre = " + nombre);
    }

}
