package Tema5Act;

import java.util.Scanner;

public class TablaMultiplicar8a {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);

        System.out.print("Dame un numero: ");
        num = sc.nextInt();
        for(int i = 0; i <= 10; i++){
            System.out.println(num * i);
        }
        sc.close();
    }
}
