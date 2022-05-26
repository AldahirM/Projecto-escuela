package myprojectoescuela;

import static com.sun.org.apache.bcel.internal.Repository.instanceOf;

public class CRUD {

    private Vehiculo[] grupo;
    private int indice;

    public CRUD() {
        grupo = new Vehiculo[100];
        indice = 0;
    }

    /**
     * @return the vehiculo
     */
    public Vehiculo[] getGrupo() {
        return grupo;
    }

    /**
     * @param grupo the grupo to set
     */
    public void setVehiculo(Vehiculo[] grupo) {
        this.grupo = grupo;
    }

    /**
     * @return the indice
     */
    public int getIndice() {
        return indice;
    }

    /**
     * @param indice the indice to set
     */
    public void setIndice(int indice) {
        this.indice = indice;
    }

    public void create(Vehiculo vehiculo) {
        grupo[indice] = vehiculo;
        indice++;
    }

    public String read() {
        String cadena = "";
        for (int i = 0; i < indice; i++) {
            cadena += grupo[i].toString() + "\n";
        }
        return cadena;
    }

    public String readAutomovil() {
        String cadena = "";
        for (int i = 0; i < indice; i++) {
            if (grupo[i] instanceof Automovil) {
                cadena += grupo[i].toString() + grupo[i].costoVehiculo() + "\n";
            }
        }
        return cadena;
    }

    public String readMotocicleta() {
        String cadena = "";
        for (int i = 0; i < indice; i++) {
            if (grupo[i] instanceof Motocicleta) {
                cadena += grupo[i].toString() + grupo[i].costoVehiculo() + "\n";
            }
        }
        return cadena;
    }

    public String readAutoElectrico() {
        String cadena = "";
        for (int i = 0; i < indice; i++) {
            if (grupo[i] instanceof AutoElectrico) {
                cadena += grupo[i].toString() + grupo[i].costoVehiculo() + "\n";
            }
        }
        return cadena;
    }

    public int find(Vehiculo vehiculo) {
        for (int i = 0; i < indice; i++) {
            if (grupo[i].compareTo(vehiculo) == 0) {
                return i;
            }
        }
        return -1;
    }

    public void update(Vehiculo vehiculo) {
        int ind = find(vehiculo);
        if (ind > -1) {
            grupo[ind] = vehiculo;
        }
    }

    public void delete(Vehiculo vehiculo) {
        int ind = find(vehiculo);
        if (ind > -1) {
            for (int i = ind; i < indice - 1; i++) {
                grupo[i] = grupo[i + 1];
            }
            indice--;
        }
    }

    public Vehiculo consultaInd(int ind) {
        if (ind > -1 && ind < indice) {
            return grupo[ind];
        }
        return null;
    }

}
