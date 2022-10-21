package Tema5Act;

import java.util.Scanner;

public class ParImpar3b {
    public static void main(String[] args) {
        int num;
        boolean par;
        Scanner sc = new Scanner(System.in);

        System.out.print("Dame un numero: ");
        num = sc.nextInt();
        par = (num % 2 == 0) ? true : false;

        if(par){
            System.out.println(num + " es par");
        }else{
            System.out.println(num + " es impar");
        }

        sc.close();
    }
}
