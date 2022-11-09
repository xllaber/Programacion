package Practicas1Eval;

import java.util.Random;
import java.util.Scanner;

public class Practica3 {

    public static final int numBoats = 6;
    public static final int boardSize = 8;
    public static Integer[][] board = new Integer[boardSize][boardSize];

    public static void main(String[] args) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][i] = 0;
            }
        }
        generateBoat();
        showBoard();
    }

    public static void generateBoat(){
        Random boatRow = new Random();
        Random boatCol = new Random();
        for (int i = 0; i <= 6; i++) {
            int row = boatRow.nextInt(9);
            int col = boatCol.nextInt(9);
            board[row][col] = 3;
        }
    }

    public static void showBoard(){
        for (Integer[] row : board) {
            for (Integer col : row) {
                if (col == 0){
                    System.out.print("( )");
                }else{
                    System.out.print(" 0 ");
                }
            }
            System.out.println();
        }
    }


}
