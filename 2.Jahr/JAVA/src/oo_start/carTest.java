package oo_start;
import oo_start.Cars;
import oo_start.Motors;

import java.util.WeakHashMap;

public class carTest {
    public static void main(String[] args){
    Cars c1 = new Cars(1000, 500, 150);
    Motors m1 = new Motors(90);

    c1.setMotors(m1);
        System.out.println(c1.getMotors().getSpeed());

    c1.Drive();
    Mirrors mr1 = new Mirrors(23);
    Mirrors mr2 = new Mirrors(25);

    c1.addMirrors(mr1);
    c1.addMirrors(mr2);
    c1.Honk(10);
        System.out.println(c1.getMirrors().get(0).getSize());

    c1.Honk(5);
    Wheels w1 = new Wheels(22, false, 3);
    Wheels w2 = new Wheels(24, true, 5);
    Wheels w3 = new Wheels(23, false, 6);
    Wheels w4 = new Wheels(21, true, 2);
    c1.addWheels(w1);
    c1.addWheels(w2);
    c1.addWheels(w3);
    c1.addWheels(w4);

        System.out.println(c1.getWheels().get(2).isWinter());
    }
}
