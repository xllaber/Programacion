package Tema7Act;
import java.util.Scanner;

public class IntroducirArrayUser2b {
    static int longitud; 
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Introduce la longitud del array: ");
        longitud = sc.nextInt();
        int[] numbers = new int[longitud];
        introduceArray(numbers);
        System.out.println("El array introducido es: ");
       for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
       }
    }

    static int[] introduceArray(int numbers[]){
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Introduce un valor del array: ");
            numbers[i] = sc.nextInt();
        }
        sc.close();
        return numbers;
    }  
}
