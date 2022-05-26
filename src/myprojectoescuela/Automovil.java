package myprojectoescuela;

public class Automovil extends Vehiculo {

    private float caballosFuerza;
    private byte noPuertas;

    public Automovil(float caballosFuerza, byte noPuertas, String noSerie, String marca, String modelo, String color) {
        super(noSerie, marca, modelo, color);
        setCaballosFuerza(caballosFuerza);
        setNoPuertas(noPuertas);
    }

    public Automovil() {
        this((float) 1, (byte)1, "SIN NÚMERO", "SIN MARCA", "SIN MODELO", "SIN COLOR");
    }

    /**
     * @return the caballosFuerza
     */
    public float getCaballosFuerza() {
        return caballosFuerza;
    }

    /**
     * @param caballosFuerza the caballosFuerza to set
     */
    public void setCaballosFuerza(float caballosFuerza) {
        this.caballosFuerza = caballosFuerza > 0 ? this.caballosFuerza = caballosFuerza : 1;
    }

    /**
     * @return the noPuertas
     */
    public float getNoPuertas() {
        return noPuertas;
    }

    /**
     * @param noPuertas the noPuertas to set
     */
    public void setNoPuertas(byte noPuertas) {
        this.noPuertas = noPuertas > 0 ? this.noPuertas = noPuertas : 1;
    }

    @Override
    public String toString() {
        return super.toString()
                + ", Caballos de fuerza:" + caballosFuerza + ", Número de puertas:" + noPuertas;
    }

    @Override
    public double costoVehiculo() {

        return 0;
    }
    
    @Override
    public String combustible() {

        return "Combustible recomendado: Gasolina de 92 octanos";
        
    }

}
