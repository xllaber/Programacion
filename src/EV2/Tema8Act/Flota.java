package EV2.Tema8Act;

import java.util.ArrayList;
import java.util.List;

public class Flota {
    List<Coche> coches = new ArrayList<>();

    public void addCoche(Coche coche){
        coches.add(coche);
    }

    public boolean eliminarCoche(int bastidor){
        for (Coche coche : coches) {
            if (coche.numBastidor == bastidor) {
                coches.remove(coche);
                return true;
            }
        }
        return false;
    }

    public String eliminarCoche2(int bastidor){
        String respuesta = "";
        for (Coche coche : coches) {
            if (coche.numBastidor == bastidor) {
                coches.remove(coche);
                respuesta = "Se ha eliminado el coche con numero de bastidor " + coche.numBastidor;
                return respuesta;
            }
            respuesta = "No existe ningun coche con numero de bastidor " + coche.numBastidor;
        }
        return respuesta;
    }

    public void muestraLista(){
        for (Coche coche : coches) {
            System.out.println(coche.toString());
        }
    }

    public Coche buscaCoche(int bastidor){
        for (Coche coche : coches) {
            if (coche.numBastidor == bastidor) {
                return coche;
            }
        }
        return null;
    }
}
