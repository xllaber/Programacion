package Tema5Act;

import java.util.Scanner;

public class MayorEdad1a {
    public static void main(String[] args) {
        int edad;
        Scanner sc = new Scanner(System.in);

        System.out.print("Dime tu edad: ");
        edad = sc.nextInt();

        if(edad >= 18){
            System.out.println("Puedes pasar");
        }else{
            System.out.println("No puedes pasar");
        }

        sc.close();
    }
}
