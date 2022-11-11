package Practicas1Eval;

import java.util.Arrays;
// import java.util.Random;
import java.util.Scanner;

public class Practica3 {

    public static final int numBoats = 6;
    public static final int boardSize = 8;
    public static Integer[][] board = new Integer[boardSize][boardSize];
    /*
     * 0: casilla cerrada vacia
     * 1: casilla cerrada con barco
     * 2: casilla abierta vacia
     * 3: casilla abierta con barco
     */

    public static void main(String[] args) {
        // for (int i = 0; i < board.length; i++) {
        //     for (int j = 0; j < board[i].length; j++) {
        //         board[i][j] = 2;
        //     }
        // }
        generateBoard();
        fillBoard();
        showBoard();
        shoot();
    }

    public static void generateBoard(){
        // Random boatRow = new Random();
        // Random boatCol = new Random();
        // for (int i = 0; i <= 6; i++) {
        //     int row = boatRow.nextInt(7);
        //     int col = boatCol.nextInt(7);
        //     board[row][col] = 3;
        // }
        // for (int i = 0; i < board.length; i++) {
        //     for (int j = 0; j < board[i].length; j++) {
        //         if (board[i][j] == null) {
        //             board[i][j] = 2;
        //         }
        //     }
        // }
        for (Integer[] row : board) {
            Arrays.fill(row, 2);
        }
    }

    public static void fillBoard(){
        int boatsLeft = numBoats;
        while (boatsLeft >= 0) {
            int row =  (int)(Math.random() * boardSize);
            int col =  (int)(Math.random() * boardSize);
            if (board[row][col] == 2) {
                board[row][col] = 3;
            }
            boatsLeft--;
        }
    }

    public static void showBoard(){
        for (Integer[] row : board) {
            for (Integer col : row) {
                if (col == 2 || col == 3){
                    System.out.print("( )");
                }else if (col == 0){
                    System.out.print(" 0 ");
                }else if (col == 1){
                    System.out.print(" x ");
                }
            }
            System.out.println();
        }
        shoot();
    }

    public static void shoot(){
        Scanner sc = new Scanner(System.in);
         
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
        rowShot -= 1;
        colShot -= 1;
        if (board[rowShot][colShot] == 2) {
            board[rowShot][colShot] = 0;
        }else if(board[rowShot][colShot] == 3){
            board[rowShot][colShot] = 1;
        }
        showBoard();
        sc.close();
    }


}
