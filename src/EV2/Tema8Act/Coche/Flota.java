package EV2.Tema8Act.Coche;

import java.util.ArrayList;
import java.util.List;

public class Flota {
    private List<Coche> coches = new ArrayList<>();

    public void addCoche(Coche coche){
        coches.add(coche);
    }

    public boolean eliminarCoche(int bastidor){
        for (Coche coche : coches) {
            if (coche.getNumBastidor() == bastidor) {
                coches.remove(coche);
                return true;
            }
        }
        return false;
    }

    public String eliminarCoche2(int bastidor){
        String respuesta = "";
        for (Coche coche : coches) {
            if (coche.getNumBastidor() == bastidor) {
                coches.remove(coche);
                respuesta = "Se ha eliminado el coche con numero de bastidor " + coche.getNumBastidor();
                return respuesta;
            }
            respuesta = "No existe ningun coche con numero de bastidor " + coche.getNumBastidor();
        }
        return respuesta;
    }

    // public void muestraLista(){
    //     for (Coche coche : coches) {
    //         System.out.println(coche.toString());
    //     }
    // }

    public String toString(){
        StringBuilder respuesta = new StringBuilder();
        for (Coche coche : coches) {
            respuesta.append(coche.toString());
            respuesta.append("\n");
        }
        return respuesta.toString();
    }

    public Coche buscaCoche(int bastidor){
        for (Coche coche : coches) {
            if (coche.getNumBastidor() == bastidor) {
                return coche;
            }
        }
        return null;
    }
}
