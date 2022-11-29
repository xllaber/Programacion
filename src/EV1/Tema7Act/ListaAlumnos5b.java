package Tema7Act;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaAlumnos5b {

    static float mark;
    static Scanner sc = new Scanner(System.in);
    static List<String> passList = new ArrayList<>();

    public static void main(String[] args) {
        List<String> listAlumn = new ArrayList<>();
        listAlumn = List.of("Ana", "Pedro", "Antonio", "Amparo", "Luis", "Maria");
        
        createPassList(listAlumn);
        System.out.println(passList);
    }

    public static List<String> createPassList(List<String> listAlumn){
        
        for (int i = 0; i < listAlumn.size(); i++) {
            System.out.print("Introduce la nota de " + listAlumn.get(i) + ": " );
            mark = sc.nextFloat();
            if (mark >= 5) {
                passList.add(listAlumn.get(i));
            }
        }
        return passList;
    }
}
