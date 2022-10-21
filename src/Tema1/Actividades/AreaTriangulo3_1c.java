package Tema1.Actividades;

import java.util.Scanner;

public class AreaTriangulo3_1c 
{
    public static void main(String[] args) 
    {
        float base;
        float altura;
        float area;
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Dame la base:");
        base = reader.nextFloat();
        System.out.print("Dame la altura:");
        altura = reader.nextFloat();
        area = (base*altura)/2;
        System.out.println("El area es: " + area + "m^2");
    }        
}
