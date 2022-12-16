package EV1.Tema5Act;

import java.util.Scanner;

public class NumerosPares6b {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        sc.close();
        
        System.out.print("Dime un numero: ");
        num = sc.nextInt();

        for(; num > 0; num--){
            if(num % 2 == 0){
                System.out.println(num);
            }
        }
        sc.close();
    }
}
