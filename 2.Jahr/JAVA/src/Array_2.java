import java.util.Random;

public class Array_2 {
    public static void main(String[] args) {
        int array[] = {};
        int sum = 0;
        int randomNumber;
        Random random = new Random();
        for (int i = 0; i <= 49; i++){
            randomNumber = random.nextInt(100);
            array[i] = randomNumber;
        }

            for (int i = 0; i <= 49; i++) {
                sum += array[i];
                System.out.println(sum);
            }
    }
}
