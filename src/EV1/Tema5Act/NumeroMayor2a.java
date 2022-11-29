package EV1.Tema5Act;

import java.util.Scanner;

public class NumeroMayor2a {
    public static void main(String[] args) {
        int num1;
        int num2;
        Scanner sc = new Scanner(System.in);

        System.out.print("Dame el primer numero: ");
        num1 = sc.nextInt();
        System.out.print("Dame el segundo numero: ");
        num2 = sc.nextInt();
        System.out.println("El numero mayor es: " + Math.max(num1, num2));

        sc.close();
    }
}
