package EV1.Tema7Act;

public class MatrizBoolean3b {
    public static void main(String[] args) {
        boolean[][] matrix0 = {{true, true, true, true, true}, {true, false, false, false, true}, {true, false, false, false, true}, {true, false, false, false, true}, {true, false, false, false, true}, {true, false, false, false, true}, {true, false, false, false, true}, {true, true, true, true, true}};

        boolean[][] matrix1 = {{false, false, false, false, true}, {false, false, false, true, true}, {false, false,  true, false, true}, {false, true, false, false, true}, {true, false, false, false, true}, {false, false, false, false, true},{false, false, false, false, true}, {false, false, false, false, true}};

        for (boolean[] elementRow : matrix0) {
            for (boolean elementCol : elementRow) {
                if (elementCol) {
                    System.out.print("0");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
        for (boolean[] elementRow : matrix1) {
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
