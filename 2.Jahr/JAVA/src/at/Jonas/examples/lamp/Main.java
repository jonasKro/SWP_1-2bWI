package at.Jonas.examples.lamp;

public class Main {
public static void main(String[] args){
    LEDS l1 = new LEDS("klaus","green",20,true);
    LEDS l2 = new LEDS("mariam","green",10,false);
    Lamps lamp = new Lamps(l1);
    lamp.addLeds(l1);
    lamp.addLeds(l2);
    l1.turnOn();
    lamp.getLeds();
    lamp.turnAllOn();
    lamp.getOverallPowerUsage();
}
}

