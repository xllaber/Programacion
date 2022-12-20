package EV2.Tema8Act.Coche;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Flota flota = new Flota();

        // Coche coche1 = new Coche();
        // coche1.setMarca("Opel");
        // coche1.setModelo("Corsa");
        // coche1.setColor("Blanco");
        // coche1.setNumBastidor(12345);

        Coche coche1 = new Coche("Opel", "Corsa", "Blanco", 12345);
        coche1.setVelocidad(0);
        flota.addCoche(coche1);

        // Coche coche2 = new Coche();
        // coche2.setMarca("Audi");
        // coche2.setModelo("Q2");
        // coche2.setColor("Negro");
        // coche2.setNumBastidor(56789);

        Coche coche2 = new Coche("Audi", "Q2", "Negro", 56789);
        coche2.setVelocidad(0);
        flota.addCoche(coche2);

        // Coche coche3 = new Coche();
        // coche3.setMarca("Ford");
        // coche3.setModelo("Fiesta");
        // coche3.setColor("Rojo");
        // coche3.setNumBastidor(54321);

        Coche coche3 = new Coche("Ford", "Fiesta", "Rojo", 54321);
        coche3.setVelocidad(0);
        flota.addCoche(coche3);

        Conductor conductor1 = new Conductor("Juan");
        conductor1.setCocheAsignado(conductor1.asignarCoche(12345, flota));

        Conductor conductor2 = new Conductor("Ana");
        

        System.out.println(coche1.toString());

        System.out.println(flota.toString());
        System.out.println();
        System.out.println("Introduce el bastidor del coche a eliminar: ");
        int bastidor = sc.nextInt();

        conductor2.asignarCoche2(flota.buscaCoche(bastidor));
        System.out.println(conductor2.toString());

        System.out.println(conductor1.toString());
        conductor1.eliminarAsignado();
        System.out.println(conductor1.toString());
        System.out.println(conductor2.toString());
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
        System.out.println(coche1.getVelocidad());
        coche1.reduceVelocidad(velocidad);
        System.out.println(coche1.getVelocidad());
        sc.close();
    }
}
