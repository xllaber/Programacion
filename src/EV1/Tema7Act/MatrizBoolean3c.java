package Tema7Act;

import java.util.Scanner;

public class MatrizBoolean3c {

    static boolean[][] matrix0 = { { true, true, true, true, true }, { true, false, false, false, true },
            { true, false, false, false, true }, { true, false, false, false, true },
            { true, false, false, false, true }, { true, false, false, false, true },
            { true, false, false, false, true }, { true, true, true, true, true } };
    static boolean[][] matrix1 = { { false, false, false, false, true }, { false, false, false, true, true },
            { false, false, true, false, true }, { false, true, false, false, true },
            { true, false, false, false, true }, { false, false, false, false, true },
            { false, false, false, false, true }, { false, false, false, false, true } };
    static boolean check = true;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] binaryNum = new int[4];

        System.out.print("Introduce 4 bits: ");
        for (int i = 0; i < binaryNum.length; i++) {
            binaryNum[i] = sc.nextInt();
        }
        sc.close();
        checkBin(binaryNum);
        if(check){
            asignBin(binaryNum);
        }else{
            System.out.println("Has introducido algun valor erroneo. No se puede representar el bit");
        }
    }

    public static void asignBin(int[] binaryNum) {
        for (int i = (binaryNum.length - 1); i >= 0; i--) {
            int bit = binaryNum[i];
            if (bit == 1) {
                for (boolean[] elementRow : matrix1) {
                    for (boolean elementCol : elementRow) {
                        if (elementCol) {
                            System.out.print("0");
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
            } else {
                for (boolean[] elementRow : matrix0) {
                    for (boolean elementCol : elementRow) {
                        if (elementCol) {
                            System.out.print("0");
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
            }
        }
    }

    public static boolean checkBin(int[] binaryNum){
        for (int bit : binaryNum) {
            if (bit != 0 && bit != 1) {
                check = false;
            }
        }
        return check;
    }
}
