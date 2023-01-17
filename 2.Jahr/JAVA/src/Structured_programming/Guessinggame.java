package Structured_programming;

import java.util.Arrays;
import java.util.Scanner;

public class Guessinggame {
    public static void main(String[] args) {
        char selection = ' ';
        boolean gamerunning = true;
        int rightguesses = 0;

        System.out.println("geben sie das zu  suchende wort ein");
        Scanner input = new Scanner(System.in);
        String word = input.next();
        char[] wordarray = word.toCharArray();
        char[] encrypted = new char[wordarray.length];
        for (int i = 0; i < wordarray.length; i++) {
            if (wordarray[i] == ' ') {
                encrypted[i] = ' ';
            } else {
                encrypted[i] = '*';
            }
        }

        while (gamerunning){
            System.out.println(" the word you are guessing is:");
            for (int i = 0; i<encrypted.length;i++){
                System.out.print(encrypted[i]);
            }
            System.out.println(" ");
        System.out.println("now guess a letter");
           String sub = input.next();
           selection = sub.charAt(0);
            for (int i = 0;i<encrypted.length;i++){
                if (wordarray[i] == selection){
                    encrypted[i] = wordarray[i];
                    rightguesses += 1;
                }
            }
            if (rightguesses == wordarray.length){
                gamerunning = false;
            }

        }
        System.out.println("you won the word was : " );
        for (int i = 0; i<encrypted.length;i++){
            System.out.print(encrypted[i]);
        }
    }
}
