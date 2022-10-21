package Tema6Act;

import java.util.Scanner;

public class SumaEnterosRecursiva6a {

    static int num;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Dame un numero entero: ");
        num = sc.nextInt();
        System.out.println("La suma de todos los enteros hasta cero es: " + sumaRecursiva(num));
        sc.close();
    }

    static int sumaRecursiva(int num){
        if (num <= 0) {
            return 0;
        } return (num + sumaRecursiva(num - 1));
    }
}
