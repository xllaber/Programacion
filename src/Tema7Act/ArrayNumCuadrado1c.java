package Tema7Act;

public class ArrayNumCuadrado1c {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 5, 8, 13, 21, 34, 55};

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = numeros[i] * numeros[i];
            System.out.println(numeros[i]);
        }
    }
}
