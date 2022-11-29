package EV1.Tema7Act;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaAlumnos5a {
    public static void main(String[] args) {
        List<String> listAlumn = new ArrayList<>();
        float mark;
        listAlumn = List.of("Ana", "Pedro", "Antonio", "Amparo", "Luis", "Maria");
        // Object[] arrayAlumn = listAlumn.toArray();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < listAlumn.size(); i++) {
            System.out.print("Introduce la nota de " + listAlumn.get(i) + ": " );
            mark = sc.nextFloat();
            if (mark >= 5) {
                System.out.println("El/La alumn@ " + listAlumn.get(i) + " ha aproado con un " + mark);
            }
        }
        sc.close();
    }
}
