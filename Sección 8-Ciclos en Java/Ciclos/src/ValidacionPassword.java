import java.util.Scanner;

public class ValidacionPassword {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);

        System.out.println("*** Validación de Password ***");
        System.out.print("Ingrese su contraseña (al menos 6 caracteres): ");
        var password = consola.nextLine();

        while (password.length() < 6) {
            System.out.println("La contraseña debe tener al menos 6 caracteres");
            System.out.print("Ingrese su contraseña: ");
            password = consola.nextLine();
        }

        System.out.println("Contraseña válida " + password);
        consola.close();
    }

}
