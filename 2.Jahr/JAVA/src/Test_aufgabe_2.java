import java.util.Random;

public class Test_aufgabe_2 {
    public static void  main(String[] args){
        Random random = new Random();
        int sum = 0;
        while ( true ){
            int randomNumber = random.nextInt(10);
            System.out.println(randomNumber);
            if (randomNumber == 5){
                break;
            }
            else{
                 sum += randomNumber;

            }
        }
        System.out.println(sum);
    }
}
