package Vista;

import Controlador.GarajeControlador;

public class MenuRetirarVehiculo {
    private GarajeControlador oController; 

    public MenuRetirarVehiculo(GarajeControlador controlador) { 
        this.oController = controlador; 
    }

    public void retirarVehiculo() {

        if (oController.totalVehiculos() > 0){
            new MenuInfoGaraje(oController).listarVehiculos();
            System.out.print("Ingrese el Id del vehiculo que desea retirar: ");
            int iId = ValidarDatos.validarEntero();  
   
            boolean bRetirado = oController.retirarVehiculo(iId-1);

            if (bRetirado) {
                System.out.println("Vehiculo retirado correctamente.");
            } else {
                System.out.println("Vehiculo inexistente.");
            }
        }else{
            System.out.println("No existen Vehiculo para retirar.");
        }   
    }

}
