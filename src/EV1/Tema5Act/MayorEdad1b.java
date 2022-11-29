package EV1.Tema5Act;

import java.util.Scanner;

public class MayorEdad1b {
    public static void main(String[] args) {
        int edad;
        String mensaje = "No puedes pasar";
        Scanner sc = new Scanner(System.in);

        System.out.print("Dime tu edad: ");
        edad = sc.nextInt();

        if(edad >= 18){
            mensaje = "Puedes pasar";
        }
        System.out.println(mensaje);

        sc.close();
    }
}
