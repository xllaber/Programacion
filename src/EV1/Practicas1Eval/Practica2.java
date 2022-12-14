package EV1.Practicas1Eval;

import java.util.Scanner;

public class Practica2 {

    static int option = -1;
    static int level = 0;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int rol = -1;
        String user, pass;

        for (int tries = 0; tries < 3; tries++) {
            System.out.println("Introduce el usuario:");
            user = sc.nextLine();
            System.out.println("Introduce la password:");
            pass = sc.nextLine();
            rol = checkUser(user, pass);
            if (rol == 0) {
                buildMainMenu(rol);
                break;
            } else if (rol == 1) {
                buildMainMenu(rol);
                break;
            } else {
                System.out.println("Usuario o password incorrecto. Te quedan " + (2 - tries) + " intentos");
            }
        }

    }

    static int checkUser(String user, String pass) {
        final String userName = "user";
        final String userPass = "user";
        final String admin = "admin";
        final String adminPass = "admin";
        if (user.equals(userName) && pass.equals(userPass)) {
            return 0;
        } else if (user.equals(admin) && pass.equals(adminPass)) {
            return 1;
        }
        return -1;
    }

    static void buildMainMenu(int rol) {
        if (rol == 0) {
            buildUserMenu(level);
        } else if (rol == 1) {
            buildAdminMenu(level);
            
        }
    }

    static void buildUserMenu(int level) {
        do {
            if (level == 0) {
                System.out.println("1.- Peliculas");
                System.out.println("2.- Configuracion de usuario");
                System.out.println("0.- Salir");
                System.out.println("--------------------------------");
                System.out.print("Opcion: ");
                option = sc.nextInt();
                if (option == 0) {
                    System.exit(0);
                }
                level = option;
            }
            switch (level) {
                case 1:
                    do {
                        System.out.println("1.- Casablanca");
                        System.out.println("2.- El Padrino");
                        System.out.println("3.- El Club de la Lucha");
                        System.out.println("0.- Volver");
                        System.out.println("--------------------------------");
                        System.out.print("Opcion: ");
                        option = sc.nextInt();
                        if (option == 0) {
                            level = 0;
                        }
                    } while (level == 1);
                    break;
                case 2:
                do {
                    System.out.println("1.- Cambiar usuario");
                    System.out.println("2.- Cambiar password");
                    System.out.println("0.- Volver");
                    System.out.println("--------------------------------");
                    System.out.print("Opcion: ");
                    option = sc.nextInt();
                    if (option == 0) {
                        level = 0;
                    }
                } while (level == 2);
                    break;
                default:
                    break;
            }
        } while (level == 0);

    }

    static void buildAdminMenu(int level) {
        do {
            if (level == 0) {
                System.out.println("1.- Administrar peliculas");
                System.out.println("2.- Administrar usuarios");
                System.out.println("0.- Salir");
                System.out.println("--------------------------------");
                System.out.print("Opcion: ");
                option = sc.nextInt();
                if (option == 0) {
                    System.exit(0);
                }
                level = option;
                switch (level) {
                    case 1:
                        do {
                            System.out.println("1.- A??adir peliculas");
                            System.out.println("2.- Modificar pelicula");
                            System.out.println("3.- Borrar pelicula");
                            System.out.println("0.- Volver");
                            System.out.println("--------------------------------");
                            System.out.print("Opcion: ");
                            option = sc.nextInt();
                            if (option == 0) {
                                level = 0;
                            }
                        } while (level == 1);
                        break;
                    case 2:
                        do {
                            System.out.println("1.- A??adir usuario");
                            System.out.println("2.- Borrar usuario");
                            System.out.println("0.- Volver");
                            System.out.println("--------------------------------");
                            System.out.print("Opcion: ");
                            option = sc.nextInt();
                            if (option == 0) {
                                level = 0;
                            }
                        } while (level == 2);
                        break;

                    default:
                        break;
                }
            }
        } while (level == 0);
    }
}