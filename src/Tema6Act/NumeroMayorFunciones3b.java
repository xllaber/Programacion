package Tema6Act;

import java.util.Scanner;

public class NumeroMayorFunciones3b {
    
    static float num1, num2;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Dame el primer numero: ");
        num1 = sc.nextFloat();
        System.out.print("Dame el segundo numero: ");
        num2 = sc.nextFloat();

        System.out.print(numeroMayor());
        sc.close();
    }

    static int numeroMayor(){
        if(num1 < num2){
            return -1;
        }else if(num1 > num2){
            return 1;
        }return 0;
    }
}
