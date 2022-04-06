import java.util.Random;

public class While_aufgabe {
    public static void main(String[] args){

        Random random = new Random();
        int randomNumber = 0;

        while (randomNumber != 15 || randomNumber != 25){
            randomNumber = random.nextInt(100);
            System.out.println(randomNumber);
        }

    }


}
