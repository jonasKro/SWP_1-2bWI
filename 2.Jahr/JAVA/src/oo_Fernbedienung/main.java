package oo_Fernbedienung;

public class main {
    public static void main(String[] args){

        Battery b1 = new Battery(100);
        Battery b2 = new Battery(75);
        Remote r1 = new Remote(2);
        r1.addBatteries(b1);
        r1.addBatteries(b2);
        r1.getstatus();
        r1.turnOn();
        r1.getstatus();
        r1.turnOn();
        r1.getstatus();
        r1.turnOn();
        r1.getstatus();
        r1.getBatteries();

    }
}
