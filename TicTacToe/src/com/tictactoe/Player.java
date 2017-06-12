package com.tictactoe;

import java.util.Scanner;

/**
 * Created by Pawel on 6/10/2017.
 */
public class Player {

    private String playerOneName;

    private String playerTwoName;

    private boolean[] playerRound = new boolean[2];

    private Figure figure;

    public Player() {

        //this.playerOneName = p1Name;
        //this.playerTwoName = p2Name;
    }

    public void setPlayerRound(boolean[] playerRound) {
        this.playerRound = playerRound;
    }

    public boolean[] getPlayerRound() {
        return playerRound;
    }

    public String getPlayerOneName() {
        return playerOneName;
    }

    private void setPlayerOneName(String playerOneName) {
        this.playerOneName = playerOneName;
    }

    public String getPlayerTwoName() {
        return playerTwoName;
    }

    private void setPlayerTwoName(String playerTwoName) {
        this.playerTwoName = playerTwoName;
    }


    public void showPlayerOneNameDialog() {
        System.out.println("Select player one name");
        Scanner sc1 = new Scanner(System.in);
        String tempNameVal = sc1.nextLine();
        setPlayerOneName(tempNameVal);
    }

    public void showPlayerTwoNameDialog() {
        System.out.println("Select player two name");
        Scanner sc1 = new Scanner(System.in);
        String tempNameVal = sc1.nextLine();
        setPlayerTwoName(tempNameVal);
    }

    public void showPlayerNames(){
        System.out.print("Currently playing :" + " ");
        System.out.println(playerOneName);
        System.out.print("and: " + " ");
        System.out.println(playerTwoName);
    }

    public boolean[] drawWhoStarts(boolean[] playerRound) {
        int randVal = (int) (Math.random() * 2);
        if (randVal == 1) {
            playerRound[0] = true;
            playerRound[1] = false;
        } else {
            playerRound[0] = false;
            playerRound[1] = true;
        }
            return playerRound;
    }

    public void displayWhoStarts(boolean[] playerRound) {
        for (boolean x : playerRound) {
            if (playerRound[0] == true) {
                System.out.println("Player 1 begins"); //bug bo wyswietla 2 razy bez sensu
            } else if(playerRound[0] == false){
                System.out.println("Player 2 begins");
            }

        }
    }

    public void moveOnBoard(Figure figure) throws WrongFigureException{

        if (figure.equals("X")){
            //
        }
        else if (figure.equals("O")){

        } else {
            throw new WrongFigureException("This symbol hasn't been found!");
        }

    }

    public void sequenceTurns() {
        //if arr[0] = true then it shoudl be 0 next time
    }

    public int selectField() throws NullPointerException{
        System.out.println("Select field between 1-9");
        Scanner sc = new Scanner(System.in);
        int tempFieldVal = sc.nextInt();
        if (tempFieldVal > 0 && tempFieldVal <10){
            return tempFieldVal;
        }
        else {
            throw new NullPointerException("Wrong number, terminating");
        }
    }




    public void setgameLoop() {
        //set the game methods

        //Players select names done
        //draw who starts   done
        //show a clear field    done
        //show instructions? - OPTIONAL
        //P1/P2 moves - METHOD NOT IMPLEMENTED YET
        //check conditions
        // do check : while draw or someone has lost
        /*

            The board is full, and no winner has yet been declared: Game is a draw.
            Cross has won.
            Circle has won.

         */

        // End the game, show Scoreboard
    }




}
