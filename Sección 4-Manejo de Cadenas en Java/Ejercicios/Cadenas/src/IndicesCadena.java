public class IndicesCadena {
    public static void main(String[] args) {
        // Manejo de indices en una cadena
        var cadena1 = "Hola Mundo";

        // Recuperar el primer caracter
        var primerCaracter = cadena1.charAt(0); // Recuperar el caracter de 'H'
        System.out.println("PrimerCaracter = " + primerCaracter);
        // Recuperar el ultimo caracter (en la posicion 9)
        var ultimoCaracter = cadena1.charAt(9); // Recuperar el caracter de 'o'
        System.out.println("UltimoCaracter = " + ultimoCaracter);
        // Recuperar el caracter en la posicion 5
        var caracterPosicion5 = cadena1.charAt(5); // Recuperar el caracter de 'M'
        System.out.println("CaracterPosicion5 = " + caracterPosicion5);
    }

}
