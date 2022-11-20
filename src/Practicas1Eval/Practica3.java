package Practicas1Eval;

import java.util.Arrays;
import java.util.Scanner;

public class Practica3 {

    public static final int numBoats = 1;
    public static final int boardSize = 2;
    public static int totalShots, shotsLeft;
    public static int boatsDestroyed = 0;
    public static Integer[][] board = new Integer[boardSize][boardSize];
    
    /*
     * 0: casilla cerrada vacia
     * 1: casilla cerrada con barco
     * 2: casilla abierta vacia
     * 3: casilla abierta con barco
     */

    public static void main(String[] args) {
        Scanner scOption = new Scanner(System.in);
        int option;
        System.out.println("Bienvenido a hundir la flota.");
        System.out.println("Para enfrentarte al cruel dictador pulsa 1.");
        System.out.println("Si eres un cobarde y quieres huir pulsa 2.");
        option = scOption.nextInt();
        if (option == 1){
            System.out.println("¿Cuantos dispros crees que vas a necesitar?");
            totalShots = scOption.nextInt();
            shotsLeft = totalShots;
            generateBoard();
            fillBoard();
            showBoard();
        }else if(option == 2){
            System.out.println("Me lo esperba, la verdad");
        }else{
            System.out.println("Como vas a derrotar a un dictador si no sabes ni leer.");
        }
        scOption.close();
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
                boatsLeft--;
            }
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
        if (boatsDestroyed == numBoats) {
            System.out.println("Has ganado la guerra y acabado con el yugo del dictador. Enhorabuena.");
            System.exit(0);
        }else if (shotsLeft == 0) {
            System.out.println("Te has quedado sin disparos. Has perdido, el dictador sigue su mandato.");
            System.exit(0);
        }
        game();
    }

    public static void game(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce 0 para huir.");
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
        if(checkCell(rowShot, colShot)){
            if (board[rowShot][colShot] == 0) {
                board[rowShot][colShot] = 2;
                shotsLeft--;
            }else if(board[rowShot][colShot] == 1){
                board[rowShot][colShot] = 3;
                shotsLeft--;
                boatsDestroyed++;
            }
        }
        showBoard();
        sc.close();
    }

    public static boolean checkCell(int rowShot, int colShot){
        if (rowShot >= boardSize || colShot >= boardSize) {
            System.out.println("La casilla introducida esta fuera del tablero. Apunta mejor");
            shotsLeft--;
            return false;
        } else if (board[rowShot][colShot] == 2 || board[rowShot][colShot] == 3) {
            System.out.println("Ya has disparado aqui. Apunta mejor.");
            shotsLeft--;
            return false;
        }else{
            return true;
        }
    }
}
