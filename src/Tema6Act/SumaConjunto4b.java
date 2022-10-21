package Tema6Act;

public class SumaConjunto4b {
    public static void main(String[] args) {
        int a = 1;
        int b = 3;
        int c = 1;
        int d = 6;
        
        System.out.println(conjuntoSuma(a, b, c, d));
    }

    static int conjuntoSuma(int... numbers) {
        int suma = 0;
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] % 2 != 0){
                suma += numbers[i];
            }
        }
        return suma;
    }
}
