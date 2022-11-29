package EV1.Tema5Act;

import java.util.Scanner;

public class ParImpar3a {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);

        System.out.print("Dame un numero: ");
        num = sc.nextInt();
        if (num % 2 == 0){
            System.out.println(num + " es par");
        }else{
            System.out.println(num + " es impar");
        }

        sc.close();
    }
}
