package Tema7Act;

import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;


public class ConjuntoVariable4b {
    public static void main(String[] args) {
        int num = 800;
        Scanner sc = new Scanner(System.in);
        Set<Integer> conjunto = new HashSet<>();

        while (num != 0) {
            System.out.print("Introduce un numero: ");
            num = sc.nextInt();
            if (num != 0) {
                conjunto.add(num);
            } 
        }
        System.out.print(conjunto);
        sc.close();
    }
}
