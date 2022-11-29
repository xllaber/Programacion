package Tema7Act;

import java.util.Scanner;

public class IntroducirArrayUser2a {
    
    static int[] numbers = new int[5];

    public static void main(String[] args) {
        introduceArray();
        System.out.println("El array introducido es: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }

    static int[] introduceArray(){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Introduce un valor del array: ");
            numbers[i] = sc.nextInt();
        }
        sc.close();
        return numbers;
    }  
}
