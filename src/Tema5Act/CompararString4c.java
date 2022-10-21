package Tema5Act;

import java.util.Scanner;

public class CompararString4c {
    public static void main(String[] args) {
        String color;
        Scanner sc = new Scanner(System.in);

        System.out.print("Dame un color: ");
        color = sc.nextLine().toLowerCase().trim();

        switch(color){
            case "rojo":
                System.out.println("El color de la sangre");
                break;
            case "azul":
                System.out.println("El color del cielo");
                break;
            case "amarillo":
                System.out.println("El color del Sol");
                break;
            default:
                System.out.println("Que color mas aburrido");
                break;
        }
        sc.close();
    }

    
}
