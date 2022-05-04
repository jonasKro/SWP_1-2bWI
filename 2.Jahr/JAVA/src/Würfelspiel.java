import java.util.Random;
import java.util.Scanner;

public class Würfelspiel {
    public static void main(String[] args) {
        int playerscore = 0;
        int compscore = 0;
        int selection;
        Random random = new Random();
        Scanner eingabewert = new Scanner(System.in);
        System.out.println("press 1 to play");
        selection = eingabewert.nextInt();
        if (selection == 1) {

            for (int i = 0; i < 6; i++) {
                int randomNumber = random.nextInt(6) + 1;
                playerscore += randomNumber;
                System.out.println(randomNumber);
            }


        } else {
            System.out.println("that was not 1!");
        }
        System.out.println("now the computer will roll:");
        for (int i = 0; i < 6; i++) {
            int randomNumber = random.nextInt(6) + 1;
            compscore += randomNumber;
            System.out.println(randomNumber);
        }
        System.out.println("the computers score is: " + compscore );
        System.out.println("Your score is: " + playerscore );
        if (playerscore< compscore){
            System.out.println("you lost!");
        } else if (playerscore> compscore){
            System.out.println("you won, good job!");
        } else {
            System.out.println("It's a draw!");
        }

    }
}

