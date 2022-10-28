package Tema7Act;

public class MatrizBoolean3a {
    public static void main(String[] args) {
        boolean[][] matrix = {{true, true, true, true, true}, {true, false, false, false, true}, {true, false, false, false, true}, {true, false, false, false, true}, {true, false, false, false, true}, {true, false, false, false, true}, {true, false, false, false, true}, {true, true, true, true, true}};

        for (boolean[] elementRow : matrix) {
            for (boolean elementCol : elementRow) {
                if (elementCol) {
                   System.out.print("0");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
