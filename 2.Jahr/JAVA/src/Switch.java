import org.w3c.dom.ls.LSInput;

import java.util.Random;

public class Switch {
    public static void main(String[] args){
        Random random = new Random();
        int randomNumber = random.nextInt(6);
        randomNumber = randomNumber + 5;
        System.out.println(randomNumber);
        switch (randomNumber){
            case 5:
                System.out.println("fünf");
                break;
            case 6:
                System.out.println("sechs");
                break;
            case 7:
                System.out.println("sieben");
                break;
            case 8:
                System.out.println("acht");
                break;
            case 9:
                System.out.println("neun");
                break;
            case 10:
                System.out.println("zehn");
                break;
        }

    }




}
