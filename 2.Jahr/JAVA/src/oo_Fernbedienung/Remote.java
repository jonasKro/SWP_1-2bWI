package oo_Fernbedienung;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Remote {

    private List<Battery> batteries;
    private int batterycount = 0;

    public Remote(int batterycount) {
        this.batteries = new ArrayList<>();
        this.batterycount = batterycount;
    }

    public List<Battery> getBatteries() {
        return batteries;
    }

    public void addBatteries(Battery batteries) {

        this.batteries.add(batteries);

    }
    public void getstatus(){

        double var = getBatteries().get(0).getCharge();
        double var2 = getBatteries().get(1).getCharge();
        double res = (var + var2) /2;
        System.out.println(" Die Fernbedienung hat noch "+res +"% akku");

    }
    public void turnOn (){
        int percentage = 5;
        getBatteries().get(0).setCharge(getBatteries().get(0).getCharge() - percentage);
        getBatteries().get(1).setCharge(getBatteries().get(1).getCharge()- percentage );
        System.out.println("remote is on");
    }



}
