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

        if (batterycount>1){
            System.out.println("Batterie-Fach voll");
        }else{
            this.batteries.add(batteries);
        }
        batterycount++;

    }
    public void getstatus(Remote remote){
        int chargesum = 0;
        for (int i = 0;i < this.batterycount; i++ ){
            chargesum += remote.getBatteries().get(i).getCharge();
        }
        chargesum = chargesum / this.batterycount;
        System.out.println(" Die Fernbedienung hat noch "+chargesum +"% akku");

    }



}
