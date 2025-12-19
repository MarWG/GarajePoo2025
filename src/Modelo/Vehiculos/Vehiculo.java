package Modelo.Vehiculos;

public abstract class Vehiculo {
    private String sMarca;
    private int iKilometros;

    //Contructor 
    public Vehiculo(String sMarca, int iKilometros) {
        //Variable primitiva = varible local
        this.sMarca = sMarca;
        this.iKilometros = iKilometros;
    }

    // Getters y Setters 
    public String getMarca() {
        return sMarca;
    }

    public void setMarca(String sMarca) {
        this.sMarca = sMarca;
    }

    public int getKilometros() {
        return iKilometros;
    }

    public void setKilometros(int iKilometros) {
        this.iKilometros = iKilometros;
    }

    //Sobreescritura de metodos
    public abstract int getNumeroRuedas();

    public abstract String getTipoVehiculo();

    @Override
    public String toString() { 
        return String.format("Tipo: %s, Marca: %s, Kilometraje: %d", getTipoVehiculo(), sMarca, iKilometros);
    }
    
}
