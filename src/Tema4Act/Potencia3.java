package Tema4Act;

import java.util.Scanner;

public class Potencia3 {
    public static void main(String[] args) {
        double base;
        double exponente;
        float sol;
        String respuesta;
        Scanner sc = new Scanner(System.in);

        System.out.print("Dime la base: ");
        base = sc.nextDouble();
        System.out.print("Dime el exponente: ");
        exponente = sc.nextDouble();
        sol = (float)Math.pow(base, exponente);
        respuesta = String.format("El resultado es: %.2f", sol);

        System.out.println(respuesta);
        sc.close();
    }
}
