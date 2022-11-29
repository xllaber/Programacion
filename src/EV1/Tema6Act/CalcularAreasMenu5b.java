package EV1.Tema6Act;

import java.util.Scanner;

public class CalcularAreasMenu5b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        System.out.println("Elige una opcion:");
        System.out.println("1.- Calcular area triangulo.");
        System.out.println("2.- Calcular area cuadrado.");
        opcion = sc.nextInt();
        if (opcion == 1) {
            System.out.print("Introduce la base: ");
            float base = sc.nextFloat();
            System.out.print("Introduce la altura: ");
            float altura = sc.nextFloat();
            System.out.println("El area del triangulo es: " + calcularArea(base, altura) + " u^2");
        } else if(opcion == 2){
            System.out.print("Introduce el lado: ");
            float lado = sc.nextFloat();
            System.out.println("El area del cuadrado es: " + calcularArea(lado) + " u^2");
        }else {
            System.out.println("Opcion no disponible. Aprende a leer.");
        }
        sc.close();
    }

    static float calcularArea(float base, float altura) {
        float areaTriangulo = (base * altura) / 2;
        return areaTriangulo;
    }

    static float calcularArea(float lado) {
        float areaCuadrado = lado * lado;
        return areaCuadrado;
    }
}
