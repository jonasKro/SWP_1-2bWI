package oo_start;
import oo_start.Cars;
import oo_start.Motors;
public class carTest {
    public static void main(String[] args){
        Cars c1 = new Cars(20,1500,300);
        c1.setBrand("mercedes");

        c1.Drive();
        c1.Brake();
        System.out.println(c1.getFuel());
        c1.TurboBoost();
        c1.Honk(20);
        c1.GetRemainingRange();
        Cars c2 = new Cars(25, 2000, 500);
        System.out.println(c2.getTanksize());

        Motors m1 = new Motors();
        m1.setSpeed(100);


    }
}
