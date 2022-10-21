package Tema5Act;

import java.util.Scanner;

public class NumerosPares6c {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Dime un numero: ");
        num = sc.nextInt();

        for(; num > 0; num--){
            if(num % 2 != 0){
                continue;
            }
                System.out.println(num);
        }
        sc.close();
    }
}
