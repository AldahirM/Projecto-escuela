package myprojectoescuela;

public class AutoElectrico extends Automovil {

    private float duracionBateria;

    public AutoElectrico(float duracionBateria, float caballosFuerza, float noPuertas, String noSerie, String marca, String modelo, String color) {
        super(caballosFuerza, noPuertas, noSerie, marca, modelo, color);
    }

    public AutoElectrico() {
        this(1f, (float) 1, (float) 1, "SIN NÚMERO", "SIN MARCA", "SIN MODELO", "SIN COLOR");
    }

    /**
     * @return the duracionBateria
     */
    public float getDuracionBateria() {
        return duracionBateria;
    }

    /**
     * @param duracionBateria the duracionBateria to set
     */
    public void setDuracionBateria(float duracionBateria) {
        this.duracionBateria = duracionBateria > 0 ? duracionBateria : 1;
    }

    @Override
    public String toString() {
        return super.toString()
                + ", Duración de la bateria:" + duracionBateria;
    }

    @Override
    public double costoVehiculo() {

        return 0;
    }

    @Override
    public String combustible() {

        return null;

    }

}
