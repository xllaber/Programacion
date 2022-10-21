package Tema5Act;

import java.util.Scanner;

public class NumerosPares6a {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Dime un numero: ");
        num = sc.nextInt();

        while(num > 0){
            if(num % 2 == 0){
                System.out.println(num);
            }
            num--;
        }
        sc.close();
    }
    
}
