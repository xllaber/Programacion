package Tema5Act;

import java.util.Scanner;

public class Divisores7a {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);

        System.out.print("Dame un numero: ");
        num = sc.nextInt();

        for(int i = num; i > 0; i--){
            if(num % i == 0){
                System.out.println(i + " es divisor de " + num);
            }
        }
        sc.close();
    }
}
