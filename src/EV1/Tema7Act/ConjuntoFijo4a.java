package EV1.Tema7Act;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ConjuntoFijo4a {
    public static void main(String[] args) {
        int capacidad, num;
        Scanner sc = new Scanner(System.in);
        Set<Integer> conjunto = new HashSet<Integer>();

        System.out.print("Introduce la capacidad del conjunto: ");
        capacidad = sc.nextInt();

        System.out.print("Introduce los valores del conjunto: ");
        for (int i = 0; i < capacidad; i++) {
            num = sc.nextInt();
            conjunto.add(num);
        }

        System.out.print(conjunto);;
        sc.close();
    }
}
