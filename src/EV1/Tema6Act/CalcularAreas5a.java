package EV1.Tema6Act;

import java.util.Scanner;

public class CalcularAreas5a {
    public static void main(String[] args) {
        float lado, altura, base;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el lado del cuadrado: ");
        lado = sc.nextFloat();
        System.out.print("Introduce la altura del triangulo: ");
        altura = sc.nextFloat();
        System.out.print("Introduce la base del triangulo: ");
        base = sc.nextFloat();

        System.out.println("El area del cuadrado es: " + sumaAreas(lado) + " u^2");
        System.out.println("El area del triangulo es: " + sumaAreas(altura, base) + " u^2");
        sc.close();
    }

    static float sumaAreas(float lado) {
        float areaCuadrado = lado * lado;
        return areaCuadrado;
    }

    static float sumaAreas(float altura, float base) {
        float areaTriangulo = (base * altura / 2);
        return areaTriangulo;
    }
}
