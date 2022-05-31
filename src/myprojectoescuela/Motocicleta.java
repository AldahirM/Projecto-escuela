package myprojectoescuela;

public class Motocicleta extends Vehiculo {

    private float potencia;
    private byte rodada;

    public Motocicleta(float potencia, byte rodada, String noSerie, String marca, String modelo, short anioModelo, String color) {
        super(noSerie, marca, modelo, anioModelo, color);
        setPotencia(potencia);
        setRodada(rodada);
    }

    public Motocicleta() {
        this(1f, (byte) 1, "Sin numero de serie", "Sin marca", "Sin modelo", (short) 1981, "SIN COLOR");
    }

    /**
     * @return the potencia
     */
    public float getPotencia() {
        return potencia;
    }

    /**
     * @param potencia the potencia to set
     */
    public void setPotencia(float potencia) {
        this.potencia = potencia > 0 ? potencia : 1;
    }

    /**
     * @return the rodada
     */
    public byte getRodada() {
        return rodada;
    }

    /**
     * @param rodada the rodada to set
     */
    public void setRodada(byte rodada) {
        this.rodada = rodada > 0 ? rodada : 1;
    }

    @Override
    public String toString() {
        return super.toString()
                + ", potencia:" + potencia + ", rodada:" + rodada;
    }

    @Override
    public double costoVehiculo() {
        double costo = 30000;
        if (getPotencia() > 7200) {
            double costoTotal = costo + (getPotencia() * 3);
            return costoTotal;
        }
        double costoTotal = costo + (getPotencia() * 2);
        return costoTotal;
    }

    @Override
    public String combustible() {

        return "Combustible recomendado: Gasolina de 87 octanos";

    }
}
