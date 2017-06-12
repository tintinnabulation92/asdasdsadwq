package com.tictactoe;

import org.omg.CORBA.DynAnyPackage.InvalidValue;

/**
 * Created by Pawel on 6/10/2017.
 */
public class GameBoard {
    Player players;


    Figure figure;

    public String[][] gameBoard;

    public GameBoard(String[][] gameBoard) {
        this.gameBoard = gameBoard;
    }

    public void clearBoard() {
        String[][] var1 = this.gameBoard;
        int var2 = var1.length;

        for(int var3 = 0; var3 < var2; ++var3) {
            String[] gameBoard1 = var1[var3];

            for(int y = 0; y < this.gameBoard.length; ++y) {
                gameBoard1[y] = null;
            }
        }

    }

    public void insertPlayersNextMove() {
    }

    public void checkIfBoardIsFull() {
    }

    public void drawBoard() {
        for(int x = 0; x < this.gameBoard.length; ++x) {
            System.out.print("\n");

            for(int y = 0; y < this.gameBoard.length; ++y) {
                this.gameBoard[x][y] = "A";
                System.out.print(" " + this.gameBoard[x][y] + "  ");
            }
        }

    }

    public void checkPlayerTurn(Player players){
        //if (player.)
    }

    public void setPlayerTurn(Player players) throws InvalidValue {


        int fieldNum = players.selectField();
        updateField(fieldNum);

    }

    private void updateField(int fieldNum, String figure) throws InvalidValue{ //brakuje znaczka i polaczenia tej logiki
        switch (fieldNum){
            case 1: gameBoard[0][0] = "x";
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            default:
                System.out.println("Invalid value");
                throw new InvalidValue("INVALID FIELD VALUE!");

        }
    }


}
