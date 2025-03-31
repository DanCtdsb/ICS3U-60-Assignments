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
    public static boolean checkWinner(char board[][], int[] diagCount, int[] rowCount, int[] colCount, final int BOUNDS) {
        // If number of X|O's is 3 in rows, cols, or diags, there is a winner
        if (Math.abs(diagCount[0]) == BOUNDS || Math.abs(diagCount[1]) == BOUNDS) {
            return true;
        }
        for (int i = 0; i < BOUNDS; i++) {
            if (Math.abs(rowCount[i]) == BOUNDS || Math.abs(colCount[i]) == BOUNDS) {
                return true;
            }
        }
        return false;
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
        
        // Add value to the current row, column, and diag if possible (value = 3 or -3 = win)
        rowCount[row] += value;
        colCount[col] += value;
        
        if (row == col) {
            diagCount[0] += value;
        }
        if (row + col == 2) {
            diagCount[1] += value;
        }
    }

    public static char switchPlayer(char currentPlayer) {
        if (currentPlayer == 'X') {
            return 'O';
        } else {
            return 'X';
        }
    }
    public static void main(String[] args) {
        final int BOUNDS = 3;
        final int TURNS = 9;

        Scanner keyboard = new Scanner(System.in);
        char board[][] = initializeBoard(new char[BOUNDS][BOUNDS]);

        // Variables to determine number of X|O's in rows, cols, and diags
        int[] rowCount = new int[BOUNDS];
        int[] colCount = new int[BOUNDS]; 
        int[] diagCount = new int[2];
        char currentPlayer = 'X';
        int counter = 1;

        System.out.println("\n================================================");
        System.out.println("Welcome to Tic Tac Toe");
        System.out.println("1. Players take turns making moves starting with player " + currentPlayer);
        System.out.println("2. These moves place markers in the designated box");
        System.out.println("3. To make a move, enter the row number and the column number");
        System.out.println("4. First player to reach " + BOUNDS + " in a row horizontally, vertically, or diagonally wins!");

        // Loop
        while (true) {
            System.out.println("--------------------------------------------");
            displayBoard(board);
            System.out.println("Player " + currentPlayer + " please make your remove (row, column)");
            try {
                System.out.print("Row: ");
                int row = keyboard.nextInt() - 1;
                keyboard.nextLine();
                System.out.print("Column: ");
                int col = keyboard.nextInt() - 1;

                if (board[row][col] != ' ') {
                    System.out.println("INVALID MOVE: Please make a move in a non-occupant square");
                    continue;
                }

                // Makes move and checks if there is a winner
                makeMove(board, row, col, currentPlayer, diagCount, rowCount, colCount);
                boolean winner = checkWinner(board, diagCount, rowCount, colCount, BOUNDS);
                if (winner) {
                    displayBoard(board);
                    System.out.println(currentPlayer + " has won!");
                    System.out.println("--------------------------------------------");
                    break;
                }

                if (counter == TURNS) {
                    displayBoard(board);
                    System.out.println("The game ends in a draw!");
                    System.out.println("--------------------------------------------");
                    break;
                }

                currentPlayer = switchPlayer(currentPlayer);
                counter++;
                
            } catch (InputMismatchException exception) {
                System.out.println("INVALID MOVE: Wrong type, please enter a integer");
                keyboard.nextLine();
            } catch (ArrayIndexOutOfBoundsException exception) {
                System.out.println("INVALID MOVE: Out of bounds, please enter a integer between 1-3");
            }
        }
        keyboard.close();
    }
}
