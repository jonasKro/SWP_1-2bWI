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
        System.out.println("geben sie den tag an für den Monatsersten");
        day = input.nextInt();
        int dayfor = day - 2*day;
        System.out.println(dayfor);

        for (int i = 0; i < 10; i++) {

        }

        System.out.println("|" + days[0] + "|"+"|" + days[1] + "|"+"|" + days[2] + "|"+"|" + days[3] + "|"+"|" + days[4] + "|"+"|" + days[5] + "|"+"|" + days[6] + "|");
        for (int i = dayfor; i < length.length + day; i++) {

            if (i < 0) {
                {
                    System.out.print("|" + "00" + "|");
                }
            } else {
                if (i == 6-day || i == 13-day || i == 20-day || i == 27-day) {
                    if (i<9){
                        System.out.print("|" +"0"+length[i] + "| \n");
                    }else {
                        System.out.print("|" + length[i] + "| \n");
                    }
                } else {
                    if (i<9){
                        System.out.print("|" +"0"+length[i] + "|");
                    }else {
                        System.out.print("|" + length[i] + "|");
                    }
                }
            }
        }


    }
}
