package Vista;

import Controlador.GarajeControlador;
import java.util.Scanner;

public class Menu {
    private GarajeControlador oController;
    private Scanner oScanner;

    public Menu() {
        this.oController = new GarajeControlador();
        this.oScanner = new Scanner(System.in);
    }

    public void iniciar() {

        limpiarPantalla();
        System.out.println("Bienvenido al sistema de gestion de garaje");

        System.out.print("Ingrese el nombre del garaje: ");
        String nombreGaraje = oScanner.nextLine();

        System.out.print("Ingrese el precio del cambio de una rueda: ");
        double precioCambioRueda = ValidarDatos.validarDouble();

        System.out.print("Ingrese la capacidad maxima del garaje: ");
        int capacidadMaxima = ValidarDatos.validarEntero();
        
        oController.inicializarGaraje(nombreGaraje, precioCambioRueda, capacidadMaxima);

        limpiarPantalla();
        mostrarMenu();
    }

    public void mostrarMenu() {

        boolean bBandera = true;

        while (bBandera) {
            System.out.println("\nOpciones:");
            System.out.println(" 1. Mostrar informacion del garaje");
            System.out.println(" 2. Listar Vehiculos");
            System.out.println(" 3. Ingresar vehiculo");
            System.out.println(" 4. Retirar vehiculo");

            System.out.println(" 5. Salir");

            System.out.print("Seleccione una opcion: ");
            int iOpcion = oScanner.nextInt();
            oScanner.nextLine();  

            switch (iOpcion) {
                case 1:
                    limpiarPantalla();
                    new MenuInfoGaraje(oController).mostrarInformacionGaraje();
                    break;
                case 2:
                    limpiarPantalla();
                    new MenuInfoGaraje(oController).listarVehiculos();;
                    break;
                case 3:
                    limpiarPantalla();
                    new MenuIngresarVehiculo(oController).ingresarVehiculo();
                    break;
                case 4:
                    limpiarPantalla();
                    new MenuRetirarVehiculo(oController).retirarVehiculo();
                    break;
                case 5:
                    System.out.println("Saliendo del sistema de gestion de garaje...");
                    bBandera = false;
                    break;
                default:
                    limpiarPantalla();
                    System.out.println("Opcion invalida.");
            }
        }
    }


    public static void limpiarPantalla() {
        // Limpia la consola para una mejor interaccion con el usuario
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }


    

}
