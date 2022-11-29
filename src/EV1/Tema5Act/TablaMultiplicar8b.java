package Tema5Act;

import java.util.Scanner;

public class TablaMultiplicar8b {
    public static void main(String[] args) {
        int num, resultado, suma;
        Scanner sc = new Scanner(System.in);

        System.out.print("Dame un numero: ");
        num = sc.nextInt();

        for(int i = 1; i <= 10; i++){
            resultado = num * i;
            System.out.println(num + "*" + i + " = "  + resultado);
            suma = 1;
            for(int j = 2; j <= resultado; j++){
                suma += j;
            }
            System.out.println(suma);
        }   
        sc.close();
    }
}
