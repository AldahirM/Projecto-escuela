package myprojectoescuela;

public class Automovil extends Vehiculo {

    private float caballosFuerza;
    private byte noPuertas;

    public Automovil(float caballosFuerza, byte noPuertas, String noSerie, String marca, String modelo, short anioModelo, String color) {
        super(noSerie, marca, modelo, anioModelo, color);
        setCaballosFuerza(caballosFuerza);
        setNoPuertas(noPuertas);
    }

    public Automovil() {
        this((float) 1, (byte) 1, "SIN NÚMERO", "SIN MARCA", "SIN MODELO", (short) 1981, "SIN COLOR");
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
        double costo = 80000;
        if (getNoPuertas() > 4 && getCaballosFuerza() > 110) {
            double costoTotal = (costo * 2) + (getCaballosFuerza() * 50);
            return costoTotal;
        }
        double costoTotal = (costo) + (getCaballosFuerza() * 50);
        return costoTotal;
    }

    @Override
    public String combustible() {

        return "Combustible recomendado: Gasolina de 92 octanos";

    }

}
