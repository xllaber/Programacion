package EV1.Tema4Act;

import java.util.Scanner;

public class Operadores1b {
    public static void main(String[] args) {
        float num1;
        float num2;
        Scanner reader = new Scanner(System.in);

        System.out.print("Dame el primer numero: ");
        num1 = reader.nextFloat();
        System.out.print("Dame el segundo numero: ");
        num2 = reader.nextFloat();

        System.out.println(num1 + " + " + num2 + " = " + (int)(num1 + num2));
        System.out.println(num1 + " - " + num2 + " = " + (int)(num1 - num2));
        System.out.println(num1 + " * " + num2 + " = " + (int)(num1 * num2));
        System.out.println(num1 + " / " + num2 + " = " + (int)(num1 / num2));
        System.out.println(num1 + " % " + num2 + " = " + (int)(num1 % num2));
        reader.close();
    }
}
