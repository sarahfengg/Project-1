

import java.util.Scanner;
public class TicTacToe {

    static char[][] board;
    static int currentPlayer;
    static Scanner scanner;

    static boolean gameOver = false;
    static void printBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j]);
                if (j < 2) {
                    System.out.print('|');
                }
            }
            if (i < 2) {
                System.out.print("\n_____\n");
            }



        }
    }


    public static void main(String[] args){

        System.out.println("Hello");
        currentPlayer = 1;
        scanner = new Scanner(System.in);

        board = new char[3][3];
        for (int o = 0; o < 3; o++) {
            for (int j = 0; j < 3; j++) {
                board[o][j] = ' ';
            }
        }
        while(!gameOver) {
            printBoard();
            takeTurn();
            System.out.println(currentPlayer);
            checkWinner();
            changePlayer();



                }

        }




    static void changePlayer(){
        if(currentPlayer==1){
            currentPlayer =2;
        }else{
            currentPlayer =1;
        }

    }


    static void checkWinner(){
        char player;
        if(currentPlayer == 1){
            player = 'X';

        }else{
            player = 'O';
        }

        if(board[0][0] == player && board[0][1] == player && board [0][2] == player) {
            System.out.println( "\n Player" +currentPlayer + " WON THE GAME!!!");
            gameOver = true;
        }
        else if(board[1][0] == player && board[1][1] == player && board [1][2] == player) {
            System.out.println("\n Player" + currentPlayer + " WON THE GAME!!!");
            gameOver = true;
        }
        else if(board[2][0] == player && board[2][1] == player && board [2][2] == player) {
            System.out.println("\n Player" + currentPlayer + " WON THE GAME!!!");
            gameOver = true;
        }
        else if(board[0][0] == player && board[1][0] == player && board [2][0] == player) {
            System.out.println("\n Player" + currentPlayer + " WON THE GAME!!!");
            gameOver = true;
        }
        else if(board[0][2] == player && board[1][1] == player && board [2][0] == player) {
            System.out.println("\n Player" + currentPlayer + " WON THE GAME!!!");
            gameOver = true;
        }
        else if(board[2][0] == player && board[1][0] == player && board [0][0] == player) {
            System.out.println("\n Player" + currentPlayer + " WON THE GAME!!!");
            gameOver = true;
        }
        else if(board[2][1] == player && board[1][1] == player && board [0][1] == player) {
            System.out.println("\n Player" + currentPlayer + " WON THE GAME!!!");
            gameOver = true;
        }
        else if(board[2][2] == player && board[1][2] == player && board [0][2] == player) {
            System.out.println("\n Player" + currentPlayer + " WON THE GAME!!!");
            gameOver = true;
        }
    }


    public static void takeTurn() {
        //Figure out which symbol to use
        char player;
        int row = -1;
        int col = -1;

        if (currentPlayer == 1) {
            player = 'X';
        } else {
            player = 'O';
        }
        System.out.println("\nPlayer " + currentPlayer + " it's your turn.");
        System.out.println("Where would you like to put a " + player + " in?");

        while (row == -1) {
            try {
                row = scanner.nextInt();
                if (row != 1 && row != 2 && row != 3) {
                    row = -1;
                }
            } catch (Exception e) {
                System.out.println("Please enter 1,2, or 3");
                scanner.next();

            }
        }

        while (col == -1) {
            try {
                col = scanner.nextInt();
                if (col != 1 && col != 2 && col != 3) {
                    col = -1;
                }
            } catch (Exception e) {
                System.out.println("Please enter 1,2, or 3");
                scanner.next();

            }
        }
        row--;
        col--;

        if(board[row][col]==' '){
            board[row][col] = player;

        }else {
            printBoard();
            System.out.println("That spot has been taken!");
            takeTurn();
        }

        //Get a position from the player
        //Check if the position is valid
        //Set that position in the board
        //Switch players
    }
}












