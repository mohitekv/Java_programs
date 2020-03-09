import java.util.*;
import java.util.Arrays;

public class TicTacToe {
    public static char player = 'X';
    public static char computer = 'X';
    public static char board[][] = new char[3][3];
    public static int count = 0;

    // Displays Empty board
    // *********************************************************************************************
    // */
    public static void Board() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
                System.out.print("   " + board[i][j] + "\t|");
            }
            System.out.println();
        }
    }

    // Display function
    /**************************************************************************************************** */
    public static void display_board() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                System.out.print("   " + board[i][j] + "\t|");
            }
            System.out.println();
        }
        System.out.println("---------------------------------------------------------------");

    }

    /************************************************************************************************* */
    // Function Checking for tie condition
    public static void tie_condition() {
        if (count == 9) {
            System.out.println("Game is tie");
        }
    }

    /******************************************************************************************************** */
    // Function for placing computer value if there is a wining possibility//
    // Row Colunm and diagonal check Condition
    public static void computer_win_condition() {
        // System.out.println("computer turn:");
        int x = (int) (Math.random() * (3 - 0));
        int y = (int) (Math.random() * (3 - 0));
        if (board[x][y] == '-') {

            for (int i = 0; i < 3; i++) {
                int j = 0;
                char Horizontal[] = { board[i][j], board[i][j + 1], board[i][j + 2] };
                char vertical[] = { board[j][i], board[j + 1][i], board[j + 2][i] };
                char firstDiagonal[] = { board[0][0], board[1][1], board[2][2] };
                char secondDiagnol[] = { board[0][2], board[1][1], board[2][0] };

                char H1[] = { computer, computer, '-' };
                char H2[] = { computer, '-', computer };
                char H3[] = { '-', computer, computer };

                if (Arrays.equals(Horizontal, H1)) {

                    board[i][j + 2] = computer;
                    display_board();
                    count++;
                    check_winner();
                    tie_condition();
                    playerTurn();
                } else if (Arrays.equals(Horizontal, H2)) {

                    board[i][j + 1] = computer;
                    display_board();
                    count++;
                    check_winner();
                    tie_condition();
                    playerTurn();
                } else if (Arrays.equals(Horizontal, H3)) {
                    board[i][j] = computer;
                    display_board();
                    count++;
                    check_winner();
                    tie_condition();
                    playerTurn();
                } else if (Arrays.equals(vertical, H1)) {
                    board[j + 2][i] = computer;
                    display_board();
                    count++;
                    check_winner();
                    tie_condition();
                    playerTurn();
                } else if (Arrays.equals(vertical, H2)) {
                    board[j + 1][i] = computer;
                    display_board();
                    count++;
                    check_winner();
                    tie_condition();
                    playerTurn();
                } else if (Arrays.equals(vertical, H3)) {
                    board[j][i] = computer;
                    display_board();
                    count++;
                    check_winner();
                    tie_condition();
                    playerTurn();
                } else if (Arrays.equals(firstDiagonal, H1)) {
                    board[2][2] = computer;
                    display_board();
                    count++;
                    check_winner();
                    tie_condition();
                    playerTurn();
                } else if (Arrays.equals(firstDiagonal, H2)) {
                    board[1][1] = computer;
                    display_board();
                    count++;
                    check_winner();
                    tie_condition();
                    playerTurn();
                } else if (Arrays.equals(firstDiagonal, H3)) {
                    board[0][0] = computer;
                    display_board();
                    count++;
                    check_winner();
                    tie_condition();
                    playerTurn();
                } else if (Arrays.equals(secondDiagnol, H1)) {
                    board[2][0] = computer;
                    display_board();
                    count++;
                    check_winner();
                    tie_condition();
                    playerTurn();
                } else if (Arrays.equals(secondDiagnol, H2)) {
                    board[1][1] = computer;
                    display_board();
                    count++;
                    check_winner();
                    tie_condition();
                    playerTurn();
                } else if (Arrays.equals(secondDiagnol, H3)) {
                    board[0][2] = computer;
                    display_board();
                    count++;
                    check_winner();
                    tie_condition();
                    playerTurn();
                }
            }
            computer_block_condition();

        } else {
            computerTurn();
        }

    }

    /****************************************************************************************************** */
    // Function for placing computer value if there is a blocking possibility//
    // Row Colunm and diagonal check Condition
    public static void computer_block_condition() {

        int x = (int) (Math.random() * (3 - 0));
        int y = (int) (Math.random() * (3 - 0));
        if (board[x][y] == '-') {

            for (int i = 0; i < 3; i++) {
                int j = 0;
                char Horizontal[] = { board[i][j], board[i][j + 1], board[i][j + 2] };
                char vertical[] = { board[j][i], board[j + 1][i], board[j + 2][i] };
                char firstDiagonal[] = { board[0][0], board[1][1], board[2][2] };
                char secondDiagnol[] = { board[0][2], board[1][1], board[2][0] };

                char H1[] = { player, player, '-' };
                char H2[] = { player, '-', player };
                char H3[] = { '-', player, player };

                if (Arrays.equals(Horizontal, H1)) {

                    board[i][j + 2] = computer;
                    display_board();
                    count++;
                    check_winner();
                    tie_condition();
                    playerTurn();
                } else if (Arrays.equals(Horizontal, H2)) {

                    board[i][j + 1] = computer;
                    display_board();
                    count++;
                    check_winner();
                    tie_condition();
                    playerTurn();
                } else if (Arrays.equals(Horizontal, H3)) {
                    board[i][j] = computer;
                    display_board();
                    count++;
                    check_winner();
                    tie_condition();
                    playerTurn();
                } else if (Arrays.equals(vertical, H1)) {
                    board[j + 2][i] = computer;
                    display_board();
                    count++;
                    check_winner();
                    tie_condition();
                    playerTurn();
                } else if (Arrays.equals(vertical, H2)) {
                    board[j + 1][i] = computer;
                    display_board();
                    count++;
                    check_winner();
                    tie_condition();
                    playerTurn();
                } else if (Arrays.equals(vertical, H3)) {
                    board[j][i] = computer;
                    display_board();
                    count++;
                    check_winner();
                    tie_condition();
                    playerTurn();
                } else if (Arrays.equals(firstDiagonal, H1)) {
                    board[2][2] = computer;
                    display_board();
                    count++;
                    check_winner();
                    tie_condition();
                    playerTurn();
                } else if (Arrays.equals(firstDiagonal, H2)) {
                    board[1][1] = computer;
                    display_board();
                    count++;
                    check_winner();
                    tie_condition();
                    playerTurn();
                } else if (Arrays.equals(firstDiagonal, H3)) {
                    board[0][0] = computer;
                    display_board();
                    count++;
                    check_winner();
                    tie_condition();
                    playerTurn();
                } else if (Arrays.equals(secondDiagnol, H1)) {
                    board[2][0] = computer;
                    display_board();
                    count++;
                    check_winner();
                    tie_condition();
                    playerTurn();
                } else if (Arrays.equals(secondDiagnol, H2)) {
                    board[1][1] = computer;
                    display_board();
                    count++;
                    check_winner();
                    tie_condition();
                    playerTurn();
                } else if (Arrays.equals(secondDiagnol, H3)) {
                    board[0][2] = computer;
                    display_board();
                    count++;
                    check_winner();
                    tie_condition();
                    playerTurn();
                }
            }
            board[x][y] = computer;
            display_board();
            count++;
            check_winner();
            tie_condition();
            playerTurn();

        } else {
            computerTurn();
        }

    }

    /************************************************************************************************** */
    // Function to check for winner

    public static void check_winner() {
        for (int i = 0; i < 3; i++) {
            int j = 0;
            // for (int j = 0; j < 3; j++) {
            char Horizontal[] = { board[i][j], board[i][j + 1], board[i][j + 2] };
            char vertical[] = { board[j][i], board[j + 1][i], board[j + 2][i] };
            char firstDiagonal[] = { board[0][0], board[1][1], board[2][2] };
            char secondDiagnol[] = { board[0][2], board[1][1], board[2][0] };
            char player_win[] = { player, player, player };
            char computer_win[] = { computer, computer, computer };
            if (Arrays.equals(Horizontal, player_win)) {
                System.out.println("Player wins");
                System.exit(0);
            } else if (Arrays.equals(Horizontal, computer_win)) {
                System.out.println("computer wins");
                System.exit(0);
            }

            if (Arrays.equals(vertical, player_win)) {
                System.out.println("Player wins");
                System.exit(0);
            } else if (Arrays.equals(vertical, computer_win)) {
                System.out.println("computer wins");
                System.exit(0);
            }

            if (Arrays.equals(firstDiagonal, player_win)) {
                System.out.println("Player wins");
                System.exit(0);
            } else if (Arrays.equals(firstDiagonal, computer_win)) {
                System.out.println("computer wins");
                System.exit(0);
            }

            if (Arrays.equals(secondDiagnol, player_win)) {
                System.out.println("Player wins");
                System.exit(0);
            } else if (Arrays.equals(secondDiagnol, computer_win)) {
                System.out.println("computer wins");
                System.exit(0);
            }
            // }
        }
    }

    /*********************************************************************************************************** */
    // function for player Turn
    public static void playerTurn() {

        if (count == 9) {
            // System.out.println(count);
            System.exit(0);
        }

        System.out.println("Enter value of x and y");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        if (x > 2 || y > 2) {
            System.out.println("Invalid input");
            playerTurn();
        } else {
            // char space = '-';
            if (board[x][y] == '-') {
                System.out.println("Player turn:");
                board[x][y] = player;
                display_board();
                count++;
                check_winner();
                tie_condition();
                System.out.println("computer turn:");
                computerTurn();
            } else {
                System.out.println("Place already occupied:");
                playerTurn();
            }
        }

    }

    /************************************************************************************************************* */
    // Function for computer turn
    public static void computerTurn() {
        if (count == 9) {
            // System.out.println(count);
            System.exit(0);

        } else {
            computer_win_condition();

        }

    }

    /********************************************************************************************************* */
    // Function for Letter choice and toss
    public static void choice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 'X' or 'O' to start:");
        char option = scanner.next().charAt(0);
        if (option == 'x' || option == 'X') {
            player = 'X';
            computer = 'O';
        } else if (option == 'o' || option == 'O') {
            player = 'O';
            computer = 'X';
        } else {
            System.out.println("wrong input. Please try again");
            choice();
        }
        int toss = (int) Math.round(Math.random());
        if (toss == 0) {
            System.out.println("Player wins the toss:");
            playerTurn();

        } else {
            System.out.println("Computer wins the toss:");
            computerTurn();
        }

    }

    /******************************************************************************************* */
    // Main function
    public static void main(String arg[]) {
        Board();
        choice();

    }
}