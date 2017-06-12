package com.tictactoe;

/**
 * Created by Pawel on 6/10/2017.
 */
public class GameTester {
    public static void main(String[] args) {

        String[][] arr = new String[3][3];
        GameBoard g1 = new GameBoard(arr);
        g1.drawBoard();
        g1.clearBoard();
        System.out.println("\n\n\n");


        Player players = new Player(); //zoptymalizowac z uzyciem konstruktora
        players.showPlayerOneNameDialog();
        players.showPlayerTwoNameDialog();

        players.showPlayerNames();

        players.drawWhoStarts(players.getPlayerRound());
        players.displayWhoStarts(players.getPlayerRound());
    }
}
