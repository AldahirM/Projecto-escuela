package myprojectoescuela;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ManejadorArchivo {

    ObjectInputStream leer;
    ObjectOutputStream escribir;

    public int leerArchivo(Vehiculo[] arreglo) {
        //1.Cargar el archivo al arreglo
        Vehiculo vehiculo;
        int ind = 0;
        try {
            leer = new ObjectInputStream(new FileInputStream("Agencia.dat"));
            while ((vehiculo = (Vehiculo) leer.readObject()) != null) {
                arreglo[ind] = vehiculo;
                ind++;
            }
            leer.close();
        } catch (FileNotFoundException ex) {
        } catch (IOException ex) {
        } catch (ClassNotFoundException ex) {
        }
        return ind;
    }

    public void escribirArchivo(Vehiculo[] arreglo, int ind) {
        try {
            escribir = new ObjectOutputStream(new FileOutputStream("Agencia.dat"));
            for (int i = 0; i < ind; i++) {
                escribir.writeObject(arreglo[i]);
            }
        } catch (FileNotFoundException ex) {
        } catch (IOException ex) {
        }
    }
}
