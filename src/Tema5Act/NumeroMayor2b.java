package Tema5Act;

import java.util.Scanner;

public class NumeroMayor2b {
    public static void main(String[] args) {
        int num1;
        int num2;
        int max;
        Scanner sc = new Scanner(System.in);

        System.out.print("Dame el primer numero: ");
        num1 = sc.nextInt();
        System.out.print("Dame el segundo numero: ");
        num2 = sc.nextInt();
        max = (num1 >= num2) ? num1 : num2;
        System.out.println("El numero mayor es: " + max);
        sc.close();
    }
    
}
