package Structured_programming;

public class crosssum {
    public static void main(String[] args){

        for(int i = 0; i <= 1000; i++){
            if(quersumme(i) == 15){
                System.out.println(i);
            }
        }

    }

    public static int quersumme(int num) {

        if (num <= 9) return num;

        return num%10 + quersumme(num/10);

    }
}
