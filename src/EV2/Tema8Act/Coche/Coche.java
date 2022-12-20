package EV2.Tema8Act.Coche;

public class Coche {
    private String marca, modelo, color;
    private int numBastidor;
    private int velocidad;
    private int aceleracion;

    public Coche() {
    }

    public Coche(String marca, String modelo, String color, int numBastidor) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.numBastidor = numBastidor;
    }

    public String toString(){
        return String.format("%s %s de color %s con numero de bastidor %d", 
        marca, modelo, color, numBastidor);
    }

    public void aumentaVelocidad(int velocidad){
        this.velocidad += velocidad;
    }

    public void reduceVelocidad(int velocidad){
        this.velocidad -= velocidad;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumBastidor() {
        return numBastidor;
    }

    public void setNumBastidor(int numBastidor) {
        this.numBastidor = numBastidor;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getAceleracion() {
        return aceleracion;
    }

    public void setAceleracion(int aceleracion) {
        this.aceleracion = aceleracion;
    }
}
