import java.util.Scanner;

public class Bankautomat {
    public static void main(String[] args){
        int selection;
        int betrag;
        int kontostand = 0;
        boolean running = true;
        while (running = true){
        Scanner eingabewert = new Scanner(System.in);
        System.out.println("Wählen sie die gewünschte Aktion aus \n 1) einzahlen \n 2) Abheben \n 3) Kontostand \n 4) Ende");
        selection = eingabewert.nextInt();
        switch (selection){
            case 1:
                System.out.println("geben sie den gewünschten Betrag ein:");
                betrag = eingabewert.nextInt();
                kontostand = kontostand + betrag;
                break;
            case 2:
                System.out.println("Abzuhebenden Betrag eingeben:");
                betrag = eingabewert.nextInt();
                kontostand = kontostand - betrag;

                break;
            case 3:
                System.out.println("ihr konto stand beträgt: "+kontostand+"€");
                break;
            case 4:
                System.out.println("Vielen dank für ihren besuch!");
                running = false;
                break; }}

        }
    }

