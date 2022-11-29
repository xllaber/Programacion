package EV1.Tema5Act;

import java.util.Scanner;

public class NumerosPares6d {
    public static void main(String[] args) {
        int num;
        String mensaje = "";
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Dime un numero: ");
        num = sc.nextInt();

        for(int i = 1; i <= num; i++){
            if(i % 2 == 0){
                mensaje += i +", ";
            }
        }
        if(mensaje.length() >= 3){
            mensaje = mensaje.substring(0, mensaje.length() - 2);
        }else{
            mensaje = "No hay numeros pares entre " + num + " y 0";
        }
        System.out.println(mensaje);

        sc.close();
    }
}
