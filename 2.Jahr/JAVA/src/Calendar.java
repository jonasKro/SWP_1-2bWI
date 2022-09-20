import java.util.Scanner;

public class Calendar {
    public static void main(String[] args) {
        int month = 0;
        int day = 0;
        int[] length = new int[31];
        String[] days = {"MO", "DI", "MI", "DO", "FR", "SA", "SO"};
        Scanner input = new Scanner(System.in);
        System.out.println("geben sie den gewünschten monat an");
        month = input.nextInt();


        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12:
                System.out.println("31 tage");
                for (int i = 0; i < 31; i++) {
                    length[i] = i + 1;
                    ;
                }
                break;
            case 2, 4, 6, 9, 11:
                System.out.println("30 tage");
                for (int i = 0; i < 30; i++) {
                    length[i] = i + 1;

                }

                break;
        }
            for (int i = 0;i<10;i++){

            }

        System.out.println("|" + days[0] + "|" + days[1] + "|" + days[2] + "|" + days[3] + "|" + days[4] + "|" + days[5] + "|" + days[6] + "|");
        for (int i = 0; i < length.length; i++) {

            if(i==6||i==13||i==20||i==28){
                System.out.print("|" + length[i] + "| \n" );
            }
            else {System.out.print("|" + length[i] + "|");}
        }


    }
}
