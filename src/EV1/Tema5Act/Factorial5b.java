package EV1.Tema5Act;

import java.util.Scanner;

public class Factorial5b {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);

        System.out.print("Dame un numero entero: ");
        num = sc.nextInt();

        for(int i = num - 1; i > 0; i--){
            num *= i;
        }
        System.out.println(num);
        sc.close();
    }
}
