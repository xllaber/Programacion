package Tema7Act;

import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;


public class ConjuntoVariable4c {
    public static void main(String[] args) {
        int num = 800;
        Scanner sc = new Scanner(System.in);
        Set<Integer> conjuntoPar = new HashSet<>();
        Set<Integer> conjuntoImpar = new HashSet<>();

        while (num != 0) {
            System.out.print("Introduce un numero: ");
            num = sc.nextInt();
            if (num != 0) {
                 if (num % 2 == 0) {
                    conjuntoPar.add(num);
                }else if (num % 2 != 0) {
                    conjuntoImpar.add(num);
                }else if (conjuntoImpar.contains(num) || conjuntoPar.contains(num)) {
                    System.out.println("El numero ya esta an algun conjunto no se unira.");
                }
            } 
        }
        System.out.print(conjuntoPar);
        System.out.print(conjuntoImpar);
        sc.close();
    }
}
