package Tema5Act;

import java.util.Scanner;

public class MayorEdad1c {
    public static void main(String[] args) {
        int edad;
        String frase;
        Scanner sc = new Scanner(System.in);

        System.out.print("Dime tu edad: ");
        edad = sc.nextInt();

        frase = (edad >= 18) ? "Puedes pasar" : "No puedes pasar";
        System.out.println(frase);

        sc.close();
    }
}
