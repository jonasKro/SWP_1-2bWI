package oo_start;
import oo_start.Cars;
public class carTest {
    public static void main(String[] args){
        Cars c1 = new Cars();
        c1.brand = "Mercedes";
        c1.fuel = 400;
        c1.fuelConsumption = 20;
        c1.tanksize = 1500;
        c1.Drive();
        c1.Brake();
        System.out.println(c1.fuel);
        c1.TurboBoost();
        c1.Honk(20);
        c1.GetRemainingRange();
    }
}
