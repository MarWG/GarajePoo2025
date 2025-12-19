package Modelo.Vehiculos;

public class Moto extends Vehiculo {
    private int iCilindrada;

    //Contructor
    public Moto(String sMarca, int iKilometros, int iCilindrada) {
        //Variable primitiva = varible local
        super(sMarca, iKilometros);
        this.iCilindrada = iCilindrada;
    }

    // Getters y Setters 
    public int getCilindrada() {
        return iCilindrada;
    }

    public void setCilindrada(int iCilindrada) {
        this.iCilindrada = iCilindrada;
    }
    
    // Sobrescritura de metodos
    @Override
    public int getNumeroRuedas() {
        return 2;
    }

    @Override
    public String getTipoVehiculo() {
        return "Moto";
    }

    @Override public String toString() { 
        return String.format("%s, Cilindrada: %d", super.toString(), iCilindrada); 
    }
}


