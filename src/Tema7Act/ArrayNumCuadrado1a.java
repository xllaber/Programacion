package Tema7Act;

public class ArrayNumCuadrado1a {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 5, 8, 13, 21, 34, 55};

        for (int i : numeros) {
                System.out.println(Math.pow(i, 2));
        }
    }
}
