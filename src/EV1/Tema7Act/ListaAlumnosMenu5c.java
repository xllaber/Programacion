package EV1.Tema7Act;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaAlumnosMenu5c {
    static float mark;
    static String studentName;
    static Scanner sc = new Scanner(System.in);
    static List<String> passList = new ArrayList<>();
    static List<String> failedList = new ArrayList<>();
    static List<String> studentList = List.of("Ana", "Pedro", "Antonio", "Amparo", "Luis", "Maria");

    public static void main(String[] args) {
        showMenu();
    }

    public static void showMenu(){
        System.out.println("Elige una opcion: ");
        System.out.println("1.- Introducir alumno.");
        System.out.println("2.- Salir.");
        int option = sc.nextInt();
        sc.nextLine();
        if (option != 2 && option != 1) {
            System.out.println("Opcion no disponible");
        }
        if (option == 1) {
            introduceStudent();
        } else{
            System.out.println("Los alumnos aprobados son: " + passList);
            System.out.println("Los alumnos suspendidos son: " + failedList);
        }
    }

    public static void introduceStudent(){
        System.out.print("Introduce el nombre del alumno: ");
        studentName = sc.nextLine();
        System.out.print("Introduce su nota: ");
        mark = sc.nextFloat();
        sc.nextLine();

        if (studentList.contains(studentName) && mark >= 5) {
            passList.add(studentName);
            showMenu();
        }else if (studentList.contains(studentName) && mark <= 5){
            failedList.add(studentName);
            showMenu();
        }else if (!studentList.contains(studentName)){
            System.out.println("El estudiante no esta en la lista.");
            introduceStudent();
        }
    }
}
