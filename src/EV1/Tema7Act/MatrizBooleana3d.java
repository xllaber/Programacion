package Tema7Act;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MatrizBooleana3d {

    static List<Integer> lista = new ArrayList<>();
    public static void main(String[] args) {
        boolean[][] matrix0 = {{true, true, true, true, true}, {true, false, false, false, true}, {true, false, false, false, true}, {true, false, false, false, true}, {true, false, false, false, true}, {true, false, false, false, true}, {true, false, false, false, true}, {true, true, true, true, true}};

        boolean[][] matrix1 = {{false, false, false, false, true}, {false, false, false, true, true}, {false, false,  true, false, true}, {false, true, false, false, true}, {true, false, false, false, true}, {false, false, false, false, true},{false, false, false, false, true}, {false, false, false, false, true}};

        Scanner sc = new Scanner(System.in);
        double num;

        System.out.print("Introduce un numero decimal:");
        num = sc.nextDouble();
        calcBin(num);
        sc.close();
    }

    public static void calcBin(double num){
        double[] binary = new double[40];
        int index = 0;
        while(num > 0){
            binary[index++] = num % 2;
            num /= 2;
        }
        for (int i = index - 1; i >= 0; i--) {
            System.out.println(binary[i]);
        }
    }
}
