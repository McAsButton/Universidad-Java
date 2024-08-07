public class OperadorTernario {
    public static void main(String[] args) {
        System.out.println("*** Operador Ternario ***");
        // Sintaix: (condicion) ? valor1 : valor2

        //Determinar si un número es par o impar
        var numero = 10;
        var resultado = (numero % 2 == 0) ? "Es par" : "Es impar";
        System.out.println("El número " + numero + " " + resultado);

        // Calcular si es mayor de edad
        var edad = 20;
        var mensaje = (edad >= 18) ? "Eres mayor de edad" : "Eres menor de edad";
        System.out.println("Tienes " + edad + " años, " + mensaje);

        //Valor positivo, negativo o cero (operador ternario anidado)
        numero = 10;
        resultado = (numero > 0) ? "Positivo" : (numero < 0) ? "Negativo" : "Cero";
        System.out.println("El número " + numero + " es " + resultado);
    }

}
