package Tema6Act;

import java.util.Scanner;

public class NumeroMayorFunciones3a {
    
    static float num1, num2;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Dame el primer numero: ");
        num1 = sc.nextFloat();
        System.out.print("Dame el segundo numero: ");
        num2 = sc.nextFloat();

        System.out.print("El numero mayor es " + numeroMayor());
        sc.close();
    }

    static float numeroMayor(){
        if(num1 > num2){
            return num1;
        }return num2;
    }
}
