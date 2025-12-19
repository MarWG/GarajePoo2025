package Modelo;
import java.util.ArrayList;

import Modelo.Vehiculos.Vehiculo;


public class Garaje {
    private String sNombre;
    private double dPrecio;
    private int iTope;
    private ArrayList<Vehiculo> vehiculos; 

    //Contructor
    public Garaje(String sNombre, double dPrecio, int iTope) {
        //Variable primitiva = varible local
        this.sNombre = sNombre;
        this.dPrecio = dPrecio;
        this.iTope = iTope;
        this.vehiculos = new ArrayList<>();
    }

    // Getters y Setters  
    public String getNombre() {
        return sNombre;
    }

    public void setNombre(String sNombre) {
        this.sNombre = sNombre;
    }

    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(ArrayList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public double getPrecio() {
        return dPrecio;
    }

    public void setPrecio(double dPrecio) {
        this.dPrecio = dPrecio;
    }

    public int getTope() {
        return iTope;
    }

    public void setTope(int iTope) {
        this.iTope = iTope;
    }

    //Metodos
    public void agregarVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
    }



}
