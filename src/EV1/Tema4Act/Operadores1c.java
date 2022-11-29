package EV1.Tema4Act;

import java.util.Scanner;

public class Operadores1c {
    public static void main(String[] args) {
        float num1;
        float num2;
        String resultado;
        Scanner reader = new Scanner(System.in);

        System.out.print("Dame el primer numero: ");
        num1 = reader.nextFloat();
        System.out.print("Dame el segundo numero: ");
        num2 = reader.nextFloat();

        resultado = String.format("El resultado de la suma es:  %.2f", num1 + num2);
        System.out.println(resultado);
        resultado = String.format("El resultado de la resta es:  %.2f", num1 - num2);
        System.out.println(resultado);
        resultado = String.format("El resultado de la multiplicacion es:  %.2f", num1 * num2);
        System.out.println(resultado);
        resultado = String.format("El resultado de la division es:  %.2f", num1 / num2);
        System.out.println(resultado);
        resultado = String.format("El resto de la division es:  %.2f", num1 % num2);
        System.out.println(resultado);
        reader.close();
    }
}
