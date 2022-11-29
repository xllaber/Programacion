package EV2.Tema8Act;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Flota flota = new Flota();

        Coche coche1 = new Coche();
        coche1.marca = "Opel";
        coche1.modelo = "Corsa";
        coche1.color = "Blanco";
        coche1.numBastidor = 12345;
        coche1.velocidad = 0;
        flota.addCoche(coche1);

        Coche coche2 = new Coche();
        coche2.marca = "Audi";
        coche2.modelo = "Q2";
        coche2.color = "Azul";
        coche2.numBastidor = 23456;
        coche2.velocidad = 0;
        flota.addCoche(coche2);

        Coche coche3 = new Coche();
        coche3.marca = "Ford";
        coche3.modelo = "Fiesta";
        coche3.color = "Rojo";
        coche3.numBastidor = 54321;
        coche3.velocidad = 0;
        flota.addCoche(coche3);

        System.out.println(coche1.toString());

        flota.muestraLista();
        System.out.println();
        System.out.println("Introduce el bastidor del coche a eliminar: ");
        int bastidor = sc.nextInt();
        flota.eliminarCoche(bastidor);
        if (flota.eliminarCoche(bastidor)) {
            System.out.println("El coche no se encuentra en la flota");
        }else{
            flota.muestraLista();
        }

        System.out.print("Introduce la variacion de velocidad: ");
        int velocidad = sc.nextInt();

        coche1.aumentaVelocidad(velocidad);
        System.out.println(coche1.velocidad);
        coche1.reduceVelocidad(velocidad);
        System.out.println(coche1.velocidad);
    }
}
