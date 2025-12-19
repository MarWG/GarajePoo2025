package Controlador;
import java.util.ArrayList;
import Modelo.*;
import Modelo.Vehiculos.Coche;
import Modelo.Vehiculos.Moto;
import Modelo.Vehiculos.Vehiculo;

public class GarajeControlador {
    private Garaje oGaraje;

    public void inicializarGaraje(String sNombre, double dPrecio, int iTope) {
        oGaraje = new Garaje(sNombre, dPrecio, iTope);
    }

    public void agregarCoche(String sMarca, int Kilometros, int iPuerta) {
        Coche oCoche = new Coche(sMarca, Kilometros, iPuerta);
        oGaraje.agregarVehiculo(oCoche);
    }
    public void agregarMoto(String sMarca, int Kilometros, int iCilindrada) {
        Moto oMoto = new Moto(sMarca, Kilometros, iCilindrada);
        oGaraje.agregarVehiculo(oMoto);
    }

    public boolean retirarVehiculo(int iId) {

        if (iId >= 0 && iId < oGaraje.getVehiculos().size()) {
            oGaraje.getVehiculos().remove(iId);
            return true;
        } else {
            return false;
        }
    }

    public boolean verificarTope(){
        if ((oGaraje.getVehiculos().size() + 1) <= oGaraje.getTope()){
            return true;
        }else{
            return false;
        }
    }

    public double costoTotalCambioRuedas() {
        double dTotalRuedas = 0;
        for (Vehiculo vehiculo : oGaraje.getVehiculos()) {
            dTotalRuedas += vehiculo.getNumeroRuedas();
        }
        return dTotalRuedas * oGaraje.getPrecio();
    }
    
    public double kilometrajeMedio() {
        int iTotalKilometraje = 0;
        int iTotalVehiculos = totalVehiculos();
    
        if (iTotalVehiculos == 0) {
            return 0.0;
        }
    
        for (Vehiculo vehiculo : oGaraje.getVehiculos()) {
            iTotalKilometraje += vehiculo.getKilometros();
        }
    
        return (double) iTotalKilometraje / iTotalVehiculos;
    }

    public String nombreGaraje() { 
        return oGaraje.getNombre(); 
    } 

    public int totalVehiculos() { 
        return oGaraje.getVehiculos().size(); 
    }

    public double costoUnitarioRuedas() { 
        return oGaraje.getPrecio();
    }

    public int topeVehiculos() { 
        return oGaraje.getTope();
    }

    public ArrayList<Vehiculo> getVehiculos() { 
        return oGaraje.getVehiculos(); 
    }

    public String InfoCoche(int iId) {

        Vehiculo vehiculo = oGaraje.getVehiculos().get(iId);

        if (vehiculo instanceof Coche){
            return String.valueOf(((Coche) vehiculo).getPuertas());
        }else{
            return "-";
        }
    }

    public String InfoMoto(int iId) {
        Vehiculo vehiculo = oGaraje.getVehiculos().get(iId);

        if (vehiculo instanceof Moto){
            return String.valueOf(((Moto) vehiculo).getCilindrada());
        }else{
            return "-";
        }
    }
}

