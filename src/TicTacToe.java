import java.util.InputMismatchException;
import java.util.Scanner;

public class TicTacToe {
    public static char[][] initializeBoard(char board[][]) {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                board[row][col] = ' ';
            }
        }

        return board;
    }
    public static boolean checkWinner(char board[][], int[] diagCount, int[] rowCount, int[] colCount) {
        if (Math.abs(diagCount[0]) == 3 || Math.abs(diagCount[1]) == 3) {
            return true;
        }
        for (int i = 0; i < board.length; i++) {
            if (Math.abs(rowCount[i]) == 3 || Math.abs(colCount[i]) == 3) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkDraw(char board[][]) {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                if (board[row][col] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

    public static void displayBoard(char board[][]) {
        System.out.println();
        System.out.println("    1   2   3  ");
        for (int row = 0; row < board.length; row++) {
            System.out.println("  +---+---+---+");
            System.out.print(row + 1 + " ");
            for (int col = 0; col < board[row].length; col++) {
                System.out.print("| " + board[row][col] + " "); 
            }
            System.out.print("|");
            System.out.println();
        }
        System.out.println("  +---+---+---+");
    }

    public static void makeMove(char board[][], int row, int col, char currentPlayer, int[] diagCount, int[] rowCount, int[] colCount) {
        board[row][col] = currentPlayer;
        int value = (currentPlayer == 'X') ? 1 : -1;
        
        rowCount[row] += value;
        colCount[row] += value;
        
        if (row == col) {
            diagCount[0] += value;
        }
        if (row + col == 2) {
            diagCount[1] += value;
        }

        return;
    }

    public static char switchPlayer(char currentPlayer) {
        if (currentPlayer == 'X') {
            return 'O';
        } else {
            return 'X';
        }
    }
    public static void main(String[] args) {
        // Ask the user for the n value
        Scanner keyboard = new Scanner(System.in);
        char board[][] = new char[3][3];
        int[] rowCount = new int[3];
        int[] colCount = new int[3]; 
        int[] diagCount = new int[2];
        char currentPlayer = 'X';

        board = initializeBoard(board);
        while (true) {
            displayBoard(board);
            System.out.println("Player " + currentPlayer + " please make your remove (row, column)");
            try {
                System.out.print("Row: ");
                int row = keyboard.nextInt() - 1;
                System.out.print("Column: ");
                int col = keyboard.nextInt() - 1;

                if (board[row][col] != ' ') {
                    System.out.println("Please make a move in a non-occupant square");
                    continue;
                }
                makeMove(board, row, col, currentPlayer, diagCount, rowCount, colCount);
                boolean winner = checkWinner(board, diagCount, rowCount, colCount);
                boolean draw = checkDraw(board);
                if (winner) {
                    System.out.println(currentPlayer + " has won!");
                    break;
                }

                if (draw) {
                    System.out.println("The game ends in a draw!");
                    break;
                }
                currentPlayer = switchPlayer(currentPlayer);
            } catch (InputMismatchException exception) {
                System.out.println("Wrong type, please enter a integer");
                keyboard.next();
            } catch (ArrayIndexOutOfBoundsException exception) {
                System.out.println("Out of bounds, please enter a integer between 1-3");
            }
        }
        // Define the arrays
        System.out.println("Welcome to Tic Tac Toe!");
    
        keyboard.close();
    }
}
