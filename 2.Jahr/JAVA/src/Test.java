import java.util.Random;

public class Test {
    public static void main(String[] args){
        Random random = new Random();
        int randomNumber1 = random.nextInt(1000);
        int randomNumber2 = random.nextInt(randomNumber1) ;
        System.out.println(randomNumber1);
        System.out.println(randomNumber2);

        for (int i = randomNumber1; i> randomNumber2; i--  )
            System.out.println(i);
    }
}
