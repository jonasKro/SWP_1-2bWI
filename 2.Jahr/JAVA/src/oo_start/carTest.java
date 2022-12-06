package oo_start;
import oo_start.Cars;
import oo_start.Motors;
public class carTest {
    public static void main(String[] args){
    Cars c1 = new Cars(1000, 500, 150);
    Motors m1 = new Motors(90);

    c1.setMotors(m1);
        System.out.println(c1.getMotors().getSpeed());

    c1.Drive();

    }
}
