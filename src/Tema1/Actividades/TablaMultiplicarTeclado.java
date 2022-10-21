package Tema1.Actividades;

import java.util.Scanner;

public class TablaMultiplicarTeclado 
{
    public static void main(String[] args) 
    {
        int numero;
        int i = 0;
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Dame un numero entero ");
        numero = reader.nextInt();
        while (i <= 10) {
            System.out.println(numero*i);
            i++;
        }
    }    
}
