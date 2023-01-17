package Structured_programming;

import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        String player1select = "";
        String player2select = "";
        int row1 = 0;
        int row2 = 0;
        int collumn1 = 0;
        int collumn2 = 0;
        int round = 1;
        boolean gamerunning = true;
        String[][] gameGrid = new String[3][3];
        String winner = "";

        Scanner input = new Scanner(System.in);
        System.out.println("Spieler 1: x oder o ?");
        player1select = input.next();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                gameGrid[i][j] = "-";
            }

        }
        while (gamerunning) {
            System.out.println("spieler 1: geben sie die gewünschten koordinaten ein (zwe Zahlen von 1 - 3)");
            switch (round){
                case 1,3,5,7,9:
                    player1select = "x";
                    break;
                case 2,4,6,8:
                    player1select = "o";
                    break;
            }
            row1 = input.nextInt() - 1;
            collumn1 = input.nextInt() - 1;
            gameGrid[row1][collumn1] = player1select;
            System.out.println(gameGrid[row1][collumn1]);
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(" " + gameGrid[i][j]);
                }
                System.out.println(" ");
            }
            for(int i=0; i<3; i++)
            {
                if(gameGrid[i][0].equals(gameGrid[i][1])&&gameGrid[i][0].equals(gameGrid[i][2])&&!gameGrid[i][0].equals("-"))
                {
                    gamerunning = false;
                    winner = gameGrid[i][1];
                }
            }

            for(int i=0; i<3; i++)
            {
                if(gameGrid[0][i].equals(gameGrid[1][i])&&gameGrid[0][i].equals(gameGrid[2][i])&&!gameGrid[0][i].equals("-"))
                {
                    gamerunning = false;
                    winner = gameGrid[1][i];
                }
            }

            if(gameGrid[0][0].equals(gameGrid[1][1])&&gameGrid[0][0].equals(gameGrid[2][2])&&!gameGrid[0][0].equals("-"))
            {
                gamerunning = false;
                winner= gameGrid[0][0];
            }

            if(gameGrid[2][0].equals(gameGrid[1][1])&&gameGrid[2][0].equals(gameGrid[0][2])&&!gameGrid[0][2].equals("-")){
                gamerunning = false;
                winner = gameGrid[2][0];
            }
            round += 1;


        }
        System.out.println(" the winner is whoever picked " + winner);

    }
}




