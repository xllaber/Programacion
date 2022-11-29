package EV2.Tema8Act;

import java.util.ArrayList;
import java.util.List;

public class Flota {
    List<Coche> coches = new ArrayList<>();
    List<Coche> afterRemove = new ArrayList<>();

    public void addCoche(Coche coche){
        coches.add(coche);
    }

    public boolean eliminarCoche(int bastidor){
        for (Coche coche : coches) {
            if (coche.numBastidor == bastidor) {
                return coches.remove(coche);
                // return true;
            }
        }
        return false;
    }

    public void muestraLista(){
        for (Coche coche : coches) {
            System.out.println(coche.toString());
        }
    }
}
