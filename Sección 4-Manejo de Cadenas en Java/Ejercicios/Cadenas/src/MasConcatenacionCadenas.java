public class MasConcatenacionCadenas {
    public static void main(String[] args) {
        // Mas formas de concatenar cadenas en Java
        var cadena1 = "Hola";
        var cadena2 = "Mundo";
        var cadena3 = cadena1 + " " + cadena2; // Forma 1
        System.out.println("cadena3 usando + = " + cadena3);

        // Concatenacion con concat (Forma 2)
        cadena3 = cadena1.concat(" ").concat(cadena2);
        System.out.println("cadena3 usando concat= " + cadena3);

        // Concatenacion con StringBuilder (Forma 3)
        var constructorCadenas = new StringBuilder();
        constructorCadenas.append(cadena1);
        constructorCadenas.append(" ");
        constructorCadenas.append(cadena2);
        //constructorCadenas.append(cadena1).append(" ").append(cadena2);
        var resultado = constructorCadenas.toString();
        System.out.println("resultado usando StringBuilder = " + resultado);

        // Concatenacion con StringBuffer (Forma 4)
        var stringBuffer = new StringBuffer();
        stringBuffer.append(cadena1).append(" ").append(cadena2);
        resultado = stringBuffer.toString();
        System.out.println("resultado usando StringBuffer = " + resultado);

        // Concatenacion con String.join (Forma 5)
        resultado = String.join(" ", cadena1, cadena2);
        System.out.println("resultado usando String.join = " + resultado);
    }

}
