import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        String player1select = "";
        String player2select = "";
        int row1 = 0;
        int row2 = 0;
        int collumn1 = 0;
        int collumn2 = 0;
        boolean gamerunning = true;
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
                gameGrid[i][j] = "-";
            }

        }
        while (gamerunning = true){
            System.out.println("spieler 1: geben sie die gewünschten koordinaten ein (1 - 3)");
            row1 = input.nextInt() -1;
            collumn1 = input.nextInt() -1;
            gameGrid[row1][collumn1] = player1select;
            System.out.println(gameGrid[row1][collumn1]);
            for (int i = 0; i<3;i++){
                for (int j = 0; j<3;j++){
                    System.out.print(" "+gameGrid[i][j] );
                }
                System.out.println(" ");
            }
            if (){
                gamerunning = false;
            }
        }

    }
}




