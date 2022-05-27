package myprojectoescuela;

import java.io.Serializable;

public abstract class Vehiculo implements Serializable, Comparable<Vehiculo> {

    private String noSerie;
    private String marca;
    private String modelo;
    private String color;
    private float precioVehiculo;
    
    public Vehiculo(String noSerie, String marca, String modelo, String color) {
	setNoSerie(noSerie);
	setMarca(marca);
	setModelo(modelo);
	setColor(color);
    }

    public Vehiculo() {
	this("SIN NÚMERO", "SIN MARCA", "SIN MODELO", "SIN COLOR");
    }

    public abstract double costoVehiculo();
    
    public abstract String combustible();

    /**
     * @return the noSerie
     */
    public String getNoSerie() {
	return noSerie;
    }

    /**
     * @param noSerie the noSerie to set
     */
    public void setNoSerie(String noSerie) {
	this.noSerie = noSerie;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
	return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
	this.marca = marca;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
	return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
	this.modelo = modelo;
    }

    /**
     * @return the color
     */
    public String getColor() {
	return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
	this.color = color;
    }

    /**
     * @return the precioVehiculo
     */
    public float getPrecioVehiculo() {
	return precioVehiculo;
    }

    /**
     * @param precioVehiculo the precioVehiculo to set
     */
    public void setPrecioVehiculo(float precioVehiculo) {
	this.precioVehiculo = precioVehiculo > 0 ? precioVehiculo : 1;
    }
    
    @Override
    public String toString() {
	return "noSerie:" + noSerie + ", marca:" + marca + ", modelo:" + modelo + ", color:" + color;
    }

    @Override
    public int compareTo(Vehiculo o) {
	return noSerie.toUpperCase().compareTo(o.getNoSerie().toUpperCase());
    }

}
