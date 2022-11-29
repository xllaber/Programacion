package Tema6Act;

import java.util.Scanner;

public class SumaNegativosRecursiva6b {

    static int num;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Dame un numero negativo: ");
        num = sc.nextInt();
        System.out.println("La suma de todos los negativos hasta 0 es: " + sumaRecursiva(num));
        sc.close();
    }

    static int sumaRecursiva(int num){
        if (num < 0) {
            return (num + sumaRecursiva(num + 1));
        }else{
            return 0;
        }
    }
}
