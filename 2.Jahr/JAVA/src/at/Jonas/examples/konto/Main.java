package at.Jonas.examples.konto;
public class Main {
    public static void main(String[] args){
        SparKonto sk = new SparKonto(20);
        sk.einzahlen(100);
        System.out.println(sk.getKontostand());
        sk.abheben(210);
        System.out.println(sk.getKontostand());
    }

}
