public class loop_1und2 {
    public static void main(String[] args){
        int summe = 0;
        for (int i = 0; i <= 100; i++) {
          summe += i;
            System.out.println(summe);
        }
        summe = 0;

        for (int i = 0; i <= 100; i+= 2) {
            summe += i;
            System.out.println(summe);
        }



    }
}
