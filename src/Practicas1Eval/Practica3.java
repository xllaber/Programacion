package Practicas1Eval;

import java.util.Arrays;
// import java.util.Random;
import java.util.Scanner;

public class Practica3 {

    public static final int numBoats = 6;
    public static final int boardSize = 8;
    public static final int totalShots = 2;
    public static int shotsLeft = totalShots;
    public static Integer[][] board = new Integer[boardSize][boardSize];
    /*
     * 0: casilla cerrada vacia
     * 1: casilla cerrada con barco
     * 2: casilla abierta vacia
     * 3: casilla abierta con barco
     */

    public static void main(String[] args) {
        generateBoard();
        fillBoard();
        showBoard();
        game();
    }

    public static void generateBoard(){
        for (Integer[] row : board) {
            Arrays.fill(row, 0);
        }
    }

    public static void fillBoard(){
        int boatsLeft = numBoats;
        while (boatsLeft >= 0) {
            int row =  (int)(Math.random() * boardSize);
            int col =  (int)(Math.random() * boardSize);
            if (board[row][col] == 0) {
                board[row][col] = 1;
            }
            boatsLeft--;
        }
    }

    public static void showBoard(){
        System.out.println("Te quedan: " + shotsLeft + " disparos.");
        for (Integer[] row : board) {
            for (Integer col : row) {
                if (col == 0 || col == 1){
                    System.out.print("( )");
                }else if (col == 2){
                    System.out.print("(0)");
                }else if (col == 3){
                    System.out.print("(x)");
                }
            }
            System.out.println();
        }
        game();
    }

    public static void game(){
        Scanner sc = new Scanner(System.in);
        int boatsDestroyed = 0;
         
        System.out.println("Introduce 0 para salir.");
        System.out.print("Introduce la fila: ");
        int rowShot = sc.nextInt();
        if (rowShot == 0) {
            System.exit(0);
        }
        System.out.print("Introduce la columna: ");
        int colShot = sc.nextInt();
        if (colShot == 0) {
            System.exit(0);
        }
        if (rowShot > boardSize || colShot > boardSize) {
            System.out.println("La casilla introducida esta fuera del tablero. Apunta mejor");
            shotsLeft--;
            showBoard();
        }else{
            rowShot -= 1;
            colShot -= 1;
            if (board[rowShot][colShot] == 2 || board[rowShot][colShot] == 3) {
                shotsLeft--;
                System.out.println("Ya has disparado aqui. Apunta mejor.");
                shotsLeft--;
                //showBoard();
            }else if (board[rowShot][colShot] == 0) {
                board[rowShot][colShot] = 2;
                shotsLeft--;
            }else if(board[rowShot][colShot] == 1){
                board[rowShot][colShot] = 3;
                shotsLeft--;
                boatsDestroyed++;
            }
            }
            if (boatsDestroyed == numBoats){
                showBoard();
                System.out.println("Has ganado y acabado con el yugo del dictador. Enhorabuena.");
                System.exit(0);
            }else if (shotsLeft == 0) {
                System.out.println("Te has quedado sin disparos. Has perdido, el dictador sigue su mandato.");
                System.exit(0);
            }
        showBoard();
        sc.close();
    }

    // public static boolean checkCell(int rowShot, int colShot){
    //     if (rowShot > boardSize || colShot > boardSize) {
    //         System.out.println("La casilla introducida esta fuera del tablero. Apunta mejor");
    //         return false;
    //     } else if (board[rowShot][colShot] == 2 || board[rowShot][colShot] == 3) {
    //         System.out.println("Ya has disparado aqui. Apunta mejor.");
    //         return false;
    //     }else{
    //         return true;
    //     }
        
    // }


}
