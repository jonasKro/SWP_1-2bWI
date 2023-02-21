package at.Jonas.examples.konto;

public class SparKonto {
    private int kontostand;

    public SparKonto(int kontostand) {
        this.kontostand = kontostand;
    }

    public int getKontostand() {
        return kontostand;
    }

    public void setKontostand(int kontostand) {
        this.kontostand = kontostand;
    }
    public void einzahlen(int ammount){
        this.kontostand += ammount;
        System.out.println(ammount+"€ has been added to your account");
    }
    public void abheben(int ammount){

        if (kontostand - ammount <0){
            for (int i = ammount; i>0;i--){
                kontostand--;

            }
            System.out.println("you have no more monay, the rest was paid out");
        }
        else {
            this.kontostand -= ammount;
            System.out.println(ammount+"€ was paid out");
        }

    }

}
