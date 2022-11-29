package Tema5Act;

import java.util.Scanner;

public class Factorial5a {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);

        System.out.print("Dame un numero entero: ");
        num = sc.nextInt();
        int i = num - 1;

        while(i > 0){
            num *= i;
            i--;
        }
        System.out.println(num);
        sc.close();
    }
}
