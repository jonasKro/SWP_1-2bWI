public class crosssum2 {
    public static void main(String[] args){

        int userNum = 345;

       int result = ziffernwurzel(userNum);

    }

    public static int ziffernwurzel(int num){
       int cross = quersumme(num);
       return cross + quersumme(cross);
    }
    public static int quersumme(int num) {

        if (num <= 9) return num;

        return num%10 + quersumme(num/10);

    }
}
