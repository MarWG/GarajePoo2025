

package Vista;

import java.util.Scanner;

public class ValidarDatos {
    private static Scanner scanner = new Scanner(System.in);

    public static double validarDouble() {
        while (!scanner.hasNextDouble()) {
            System.out.println("Valor no valido. Solo numeros enteros o decimal.");
            scanner.next(); 
        }
        return scanner.nextDouble();
    }

    public static int validarEntero() {
        while (!scanner.hasNextInt()) {
            System.out.println("Valor no valido. Solo numeros enteros.");
            scanner.next(); 
        }
        return scanner.nextInt();
    }
}

