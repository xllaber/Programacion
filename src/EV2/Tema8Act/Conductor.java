package EV2.Tema8Act;

public class Conductor {
    public String nombre;
    public Coche cocheAsignado;

    Flota listaCoches = new Flota();

    public Coche asignarCoche(int bastidor, Flota coches){
        cocheAsignado = coches.buscaCoche(bastidor);
        if(coches.buscaCoche(bastidor) == null){
            cocheAsignado = null;
            return cocheAsignado;
        }
        return cocheAsignado;
    }

    public Coche asignarCoche2(Coche coche){
        cocheAsignado = coche;
        return cocheAsignado;
    }

    public String muestraConductor(){
        if (cocheAsignado == null) {
            return String.format("%s no tiene coche asignado", nombre);
        }
        return String.format("Coche asignado a %s: %s %s", nombre, cocheAsignado.marca, 
        cocheAsignado.modelo);
    }

    public boolean eliminarAsignado(){
        if(cocheAsignado != null){
            cocheAsignado = null;
            return true;
        }else{
            return false;
        }
    }
}