package at.Jonas.examles.lamp;

import java.util.ArrayList;
import java.util.List;

public class Lamps {
private ArrayList<LEDS> leds;


    public Lamps(LEDS leds) {
        this.leds = new ArrayList<>();
    }

    public void getLeds() {
        for (int i = 0; i<this.leds.size(); i++){
            System.out.println(this.leds.get(i).getName());
        }
    }

    public void addLeds(LEDS leds) {
        this.leds.add(leds);
    }

    public void turnAllOn() {
        for (int i = 0; i<this.leds.size(); i++){
            System.out.println(this.leds.get(i).turnOn());
        }
    }
    public void getOverallPowerUsage(){
        int usage = 0;
        for (int i = 0; i<this.leds.size(); i++){
            usage += this.leds.get(i).getPowerintake();
        }
        System.out.println("this lamp has used: " + usage + "KW/H of power");
    }
}
