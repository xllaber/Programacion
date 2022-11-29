package EV1.Tema5Act;

import java.util.Scanner;

public class Menu9b {
    public static void main(String[] args) {
        int seleccion;
        boolean salir = false;
        Scanner sc = new Scanner(System.in);
        
        while(!salir){
            System.out.println("0.- Salir");
            for(int i = 1; i <=3; i++){
                System.out.println(i + ".- " + "Opcion " + i);
            }
            System.out.println("--------------------");
            System.out.println("Selecciona una opcion:");
            seleccion = sc.nextInt();
            
            switch(seleccion){
                case 0:
                    salir = true;
                    break;
                case 1:
                    System.out.println("Has elegido la opcion 1");
                    break;
                case 2:
                    System.out.println("Has elegido la opcion 2");
                    break;
                case 3: 
                    System.out.println("Has elegido la opcion 3");
                    break;
                default:
                    System.out.println("No es una opcion disponible");
                    break;
                }
        }
        sc.close();
    }
}
