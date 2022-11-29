package Tema7Act;

public class ArrayNumCuadrado1b {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 5, 8, 13, 21, 34, 55};
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(Math.pow(numeros[i], 2));
        }
    }
}
