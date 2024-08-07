public class DiaSemanaExpresiones {
    public static void main(String[] args) {
        System.out.println("*** Día de la Semana con Expresiones ***");
        var dia = 1; // 1: Lunes, 2: Martes, ..., 7: Domingo
        
        // var diaSemana = switch (dia) {
        //     case 1 -> "Lunes";
        //     case 2 -> "Martes";
        //     case 3 -> "Miércoles";
        //     case 4 -> "Jueves";
        //     case 5 -> "Viernes";
        //     case 6 -> "Sábado";
        //     case 7 -> "Domingo";
        //     default -> "Día no válido";
        // };
        
        // System.out.println("diaSemana = " + diaSemana);

        switch (dia) {
            case 1 -> System.out.println("Lunes");
            case 2 -> System.out.println("Martes");
            case 3 -> System.out.println("Miércoles");
            case 4 -> System.out.println("Jueves");
            case 5 -> System.out.println("Viernes");
            case 6 -> System.out.println("Sábado");
            case 7 -> System.out.println("Domingo");
            default -> System.out.println("Día no válido");
        }
    }

}
