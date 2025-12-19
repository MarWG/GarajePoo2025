package Vista;

import java.util.Scanner;
import Controlador.GarajeControlador;

public class MenuIngresarVehiculo {
    private GarajeControlador oController; 
    private Scanner oScanner; 

    public MenuIngresarVehiculo(GarajeControlador controlador) { 
        this.oController = controlador; 
        this.oScanner = new Scanner(System.in); 
    }

    public void ingresarVehiculo() {

        if (oController.verificarTope()){

            System.out.println("Seleccione el tipo de vehiculo:");
            System.out.println("1. Coche");
            System.out.println("2. Moto");
            System.out.print("Opción: ");

            int iTipo = ValidarDatos.validarEntero();  

            System.out.print("Ingrese la marca del vehiculo: ");
            String sMarca = oScanner.nextLine();

            System.out.print("Ingrese el kilometraje del vehiculo: ");
            int iKilometraje = ValidarDatos.validarEntero();  
       
            if (iTipo == 1) {
                menuCoche(sMarca,iKilometraje);
            } else if (iTipo == 2) {
                menuMoto(sMarca,iKilometraje);
            } else {
                System.out.println("Tipo de vehiculo no valido.");
                return;
            }
        }else{
            System.out.println("No hay espacio disponible en el garaje."); 
        }

    }

    private void menuCoche(String sMarca, int iKilometros){
        System.out.print("Ingrese el numero de puertas: ");
        int iPuertas = ValidarDatos.validarEntero();
        oController.agregarCoche(sMarca, iKilometros, iPuertas);

    }
    private void menuMoto(String sMarca, int iKilometros){
        System.out.print("Ingrese la cilindrada: ");
        int iCilindrada = ValidarDatos.validarEntero();
        oController.agregarMoto(sMarca, iKilometros, iCilindrada);
    }
}
