package Vista;

import java.util.ArrayList;
import Controlador.GarajeControlador;
import Modelo.Vehiculos.Vehiculo;

public class MenuInfoGaraje {
    private GarajeControlador oController; 

    public MenuInfoGaraje(GarajeControlador controlador) { 
        this.oController = controlador; 
    }

    public void mostrarInformacionGaraje() {

        //Info Garaje
        System.out.println("Informacion del Garage: ");
        System.out.println(" Nombre del garaje: " + oController.nombreGaraje());
        System.out.println(" Capacidad maxima del garaje: " + oController.topeVehiculos());
        System.out.println(" Numero total de vehiculos recibidos: " + oController.totalVehiculos());
        System.out.println(" Costo Unitario cambio de ruedas: " + oController.costoUnitarioRuedas());
        System.out.println(" Costo total de cambiar todas las ruedas: " + oController.costoTotalCambioRuedas());
        System.out.println(" Kilometraje Medio de los Vehiculos Ingresados: " + oController.kilometrajeMedio());
    }

    public void listarVehiculos() {

        if (oController.totalVehiculos() > 0){
            System.out.println("Lista de Vehiculos Ingresados: ");
            //Armamos encabezaddo
            System.out.println(String.format("%-12s %-15s %-15s %-12s %-15s %-15s",
            "Id Vehiculo", "Tipo Vehiculo", "Marca", "Puertas", "Cilindrada", "Kilometraje"));

            ArrayList<Vehiculo> vehiculos = oController.getVehiculos(); //Traemos los vehiculos cargados

            //Recorremos los vehiculos y mostramos
            for (int i = 0; i < vehiculos.size(); i++) {
                Vehiculo vehiculo = vehiculos.get(i);

                System.out.println(String.format("%-12d %-15s %-15s %-12s %-15s %-15d",
                    i + 1 , vehiculo.getTipoVehiculo(), vehiculo.getMarca(), oController.InfoCoche(i), 
                    oController.InfoMoto(i), vehiculo.getKilometros()));
            }
    }else {
        System.out.println("No existen Vehiculos Ingresados");
    }

    }
    

}
