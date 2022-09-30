import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        String player1select = "";
        String player2select = "";
        String[][] gameGrid = new String[3][3];


        Scanner input = new Scanner(System.in);
        System.out.println("Spieler 1: x oder o ?");
        player1select = input.next();
        if (player1select == "x") {

            player2select = "o";
        } else {
            player2select = "x";
        }
        for (int i = 0; i<3;i++){
            for (int j = 0; j<3;j++){
                System.out.print(" "+"-");
            }
            System.out.println(" ");
        }
        System.out.println("spieler 1: geben sie die gewünschte reihe ein (1-3)");


    }
}
