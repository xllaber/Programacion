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

        Conductor conductor1 = new Conductor();
        conductor1.nombre = "Juan";
        conductor1.cocheAsignado = conductor1.asignarCoche(12345, flota);

        Conductor conductor2 = new Conductor();
        conductor2.nombre = "Ana";
        

        System.out.println(coche1.toString());

        System.out.println(flota.toString());
        System.out.println();
        System.out.println("Introduce el bastidor del coche a eliminar: ");
        int bastidor = sc.nextInt();

        conductor2.asignarCoche2(flota.buscaCoche(bastidor));
        System.out.println(conductor2.muestraConductor());

        System.out.println(conductor1.muestraConductor());
        conductor1.eliminarAsignado();
        System.out.println(conductor1.muestraConductor());
        System.out.println(conductor2.muestraConductor());
        if (!conductor2.eliminarAsignado()) {
            System.out.println("Este conductor no tiene nigun coche asignado");
        }
        // if (flota.eliminarCoche(bastidor)) {
        //     flota.muestraLista();
        // }else{
        //     System.out.println("El coche no se encuentra en la flota");
        // }
        System.out.println(flota.eliminarCoche2(bastidor));
        System.out.println(flota.toString());

        System.out.print("Introduce la variacion de velocidad: ");
        int velocidad = sc.nextInt();

        coche1.aumentaVelocidad(velocidad);
        System.out.println(coche1.velocidad);
        coche1.reduceVelocidad(velocidad);
        System.out.println(coche1.velocidad);
        sc.close();
    }
}
