package EV1.Tema4Act;

import java.util.Scanner;

public class FuncionMath2a 
{
    public static void main(String[] args) {
        double numero;
        float sol;
        Scanner sc = new Scanner(System.in);

        System.out.print("Dame un numero: ");
        numero = sc.nextDouble();
        sol = (float)Math.sqrt(numero);
        System.out.println("La soución es: " + sol);
        sc.close();
    }
}
