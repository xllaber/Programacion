package EV1.Tema6Act;

import java.util.Scanner;

public class MenuFunciones2a {
    public static void main(String[] args) {
        int opcion;
        Scanner sc = new Scanner(System.in);

        for(int i = 1; i <=3; i++){
            System.out.println(i + ".- " + "Opcion " + i);
        }
        System.out.println("--------------------");
        System.out.println("Selecciona una opcion:");
        opcion = sc.nextInt();
        System.out.println(menu(opcion));
        sc.close(); 
    }

    static String menu(int opcion){
        String respuesta;
        switch(opcion){
            case 1:
                respuesta = "Has elegido la opcion 1.";
                break;
            case 2:
                respuesta = "Has elegido la opcion 2";
                break;
            case 3:
                respuesta = "Has elegido la opcion 3";
                break;
            default:
                respuesta = "Esta opcion no esta disponible";
                break;
        }
        return respuesta;
    }
}
