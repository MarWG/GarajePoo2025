package Modelo.Vehiculos;

public class Coche extends Vehiculo {
    private int iPuertas;

    //Contructor
    public Coche(String sMarca, int iKilometros, int iPuertas) {
        //Variable primitiva = varible local
        super(sMarca, iKilometros);
        this.iPuertas = iPuertas;
    }

    // Getters y Setters 
    public int getPuertas() {
        return iPuertas;
    }

    public void setPuertas(int iPuertas) {
        this.iPuertas = iPuertas;
    }

    // Sobrescritura de metodos 
    @Override
    public int getNumeroRuedas() {
        return 4;
    }

    @Override
    public String getTipoVehiculo() {
        return "Coche";
    }

    @Override public String toString() { 
        return String.format("%s, Puertas: %d", super.toString(), iPuertas);
     }


}
