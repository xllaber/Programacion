package Tema5Act;

import java.util.Scanner;

public class CompararString4a {
    public static void main(String[] args) {
        String color;
        Scanner sc = new Scanner(System.in);

        System.out.print("Dame un color: ");
        color = sc.nextLine();

        if(color.equals("azul")){
            System.out.println("El color del cielo");
        }else if(color.equals("rojo")){
            System.out.println("El color de la sangre");
        }else if(color.equals("amarillo")){
            System.out.println("El color del sol");
        }else{
            System.out.println("Lo siento, ese color es muy aburrido");
        }

        sc.close();
    }
    
}
