package Tema7Act;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.List;

public class MapAlumnos6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String studentName;
        Map<String, Float> studentMap = new HashMap<>();
        List<String> studentList = List.of("Ana", "Pedro", "Antonio", "Amparo", "Luis", "Maria");

        for (int i = 0; i < studentList.size(); i++) {
            studentName = studentList.get(i);
            System.out.print("Introduce la nota de " + studentName + ": ");
            float mark = sc.nextFloat();
            studentMap.put(studentName, mark);
        }
        System.out.println(studentMap);
        sc.close();
    }
}
