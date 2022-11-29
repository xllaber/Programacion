package EV2.Tema8Act;

public class Coche {
    public String marca, modelo, color;
    public int numBastidor;
    public int velocidad;
    public int aceleracion;

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
}
