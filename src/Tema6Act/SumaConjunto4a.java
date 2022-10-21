package Tema6Act;

public class SumaConjunto4a {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 1;
        int d = 6;
        
        System.out.println(conjuntoSuma(a, b, c, d));
        System.out.println(conjuntoSuma(a, b, c));
    }

    static int conjuntoSuma(int... numbers) {
        int suma = 0;
        for (int i = 0; i < numbers.length; i++) {
            suma += numbers[i];
        }
        return suma;
    }
}
