package EV2.Tema8Act.Coche;

public class Conductor {
    private String nombre;
    private Coche cocheAsignado;

    Flota listaCoches = new Flota();

    public Conductor() {
    }

    public Conductor(String nombre) {
        this.nombre = nombre;
    }

    public Coche asignarCoche(int bastidor, Flota coches){
        cocheAsignado = coches.buscaCoche(bastidor);
        if(cocheAsignado == null){
            return cocheAsignado;
        }
        return cocheAsignado;
    }

    public Coche asignarCoche2(Coche coche){
        cocheAsignado = coche;
        return cocheAsignado;
    }

    public String toString(){
        if (cocheAsignado == null) {
            return String.format("%s no tiene coche asignado", nombre);
        }
        return String.format("Coche asignado a %s: %s %s", nombre, cocheAsignado.getMarca(), 
        cocheAsignado.getModelo());
    }

    public boolean eliminarAsignado(){
        if(cocheAsignado != null){
            cocheAsignado = null;
            return true;
        }else{
            return false;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Coche getCocheAsignado() {
        return cocheAsignado;
    }

    public void setCocheAsignado(Coche cocheAsignado) {
        this.cocheAsignado = cocheAsignado;
    }

    public Flota getListaCoches() {
        return listaCoches;
    }

    public void setListaCoches(Flota listaCoches) {
        this.listaCoches = listaCoches;
    }
}
