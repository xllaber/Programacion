package Tema4Act;

import java.util.Random;

public class NumAleatorio5a {
    public static void main(String[] args) {
        Random num = new Random();
        int x = num.nextInt(10);
        System.out.print("Tu numero aleatorio es: " + x);
    }
}
