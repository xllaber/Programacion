package Practicas1Eval;

import java.util.Scanner;

public class Practica1 {
    public static void main(String[] args) {
        String userName = "usuario";
        String userPass = "usuario";
        String admin = "admin";
        String adminPass = "admin";
        String user, pass;
        int seleccion;
        boolean isAdmin = false;
        boolean openMenu = false;
        Scanner sc = new Scanner(System.in);

        for (int tries = 0; tries < 3; tries++) {
            System.out.println("Introduce el usuario:");
            user = sc.nextLine();
            System.out.println("Introduce la password:");
            pass = sc.nextLine();

            if (user.equals(userName) && pass.equals(userPass)) {
                isAdmin = false;
                openMenu = true;
                break;
            } else if (user.equals(admin) && pass.equals(adminPass)) {
                isAdmin = true;
                openMenu = true;
                break;
            } else {
                System.out.println("Usuario o password incorrecto. Te quedan " + (2 - tries) + " intentos");
            }
        }

        while (openMenu) {
            if (isAdmin) {
                System.out.println("1.- Administrar peliculas");
                System.out.println("2.- Administrar usuarios");
                System.out.println("0.- Salir");
                System.out.println("--------------------------------");
                System.out.print("Opcion: ");
                seleccion = sc.nextInt();
                switch (seleccion) {
                    case 1:
                        while (seleccion != 0) {
                            System.out.println("1.- Añadir peliculas");
                            System.out.println("2.- Modificar pelicula");
                            System.out.println("3.- Borrar pelicula");
                            System.out.println("0.- Volver");
                            System.out.println("--------------------------------");
                            System.out.print("Opcion: ");
                            seleccion = sc.nextInt();
                        }
                        break;
                    case 2:
                        while (seleccion != 0) {
                            System.out.println("1.- Añadir usuario");
                            System.out.println("2.- Borrar usuario");
                            System.out.println("0.- Volver");
                            System.out.println("--------------------------------");
                            System.out.print("Opcion: ");
                            seleccion = sc.nextInt();
                        }
                        break;
                    case 0:
                        openMenu = false;
                        break;
                    default:
                        System.out.println("Opcion no disponible");
                        break;
                }
            }
            if (!isAdmin) {
                System.out.println("1.- Peliculas");
                System.out.println("2.- Configuracion de usuario");
                System.out.println("0.- Salir");
                System.out.println("--------------------------------");
                System.out.print("Opcion: ");
                seleccion = sc.nextInt();
                switch (seleccion) {
                    case 1:
                        while (seleccion != 0) {
                            System.out.println("1.- ESDLA: El retorno del Rey");
                            System.out.println("2.- Deadpool 1");
                            System.out.println("3.- Avatar");
                            System.out.println("0.- Volver");
                            System.out.println("--------------------------------");
                            System.out.print("Opcion: ");
                            seleccion = sc.nextInt();
                        }
                        break;
                    case 2:
                        while (seleccion != 0) {
                            System.out.println("1.- Cambiar usuario");
                            System.out.println("2.- Cambiar password");
                            System.out.println("0.- Volver");
                            System.out.println("--------------------------------");
                            System.out.print("Opcion: ");
                            seleccion = sc.nextInt();
                        }
                        break;
                    case 0:
                        openMenu = false;
                        break;
                    default:
                        System.out.println("Opcion no disponible");
                        break;
                }
            }
        }
        sc.close();
    }
}
