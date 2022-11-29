package EV1.Tema4Act;

import java.util.Scanner;

public class FuncionMath2b {
    public static void main(String[] args) {
        double numero;
        double resultado;
        String sol;
        Scanner sc = new Scanner(System.in);

        System.out.print("Dame un numero: ");
        numero = sc.nextDouble();
        resultado = Math.sqrt(numero);
        sol = String.format("El resultado es:  %.3f", resultado);
        System.out.println(sol);
        sc.close();
    }
}
