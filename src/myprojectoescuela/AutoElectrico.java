package myprojectoescuela;

public class AutoElectrico extends Automovil {

    private float duracionBateria;

    public AutoElectrico(float duracionBateria, float caballosFuerza,
            byte noPuertas, String noSerie, String marca, String modelo, short anioModelo, String color) {
        super(caballosFuerza, noPuertas, noSerie, marca, modelo, anioModelo, color);
    }

    public AutoElectrico() {
        this(1f, (float) 1, (byte) 1, "SIN NÚMERO", "SIN MARCA", "SIN MODELO", (short) 1981, "SIN COLOR");
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
        double costo = 100000;
        double costoTotal = 0;
        if (getDuracionBateria() > 1000) {
            costoTotal = costo + (getDuracionBateria() * 120);
            return costoTotal;
        }

        costoTotal = costo + (getDuracionBateria() * 60);
        return costoTotal;
    }

    @Override
    public String combustible() {
        String combustible = "Combustible recomendado: Corriente electrica recomendada de 220 V a 230 V.";
        return combustible;

    }

}
