package oo_start;

public class Cars {
    public int fuelConsumption;
    public int tanksize;
    public int fuel;
    public String brand;
    public String serialNumber;
    private String color;

    public void Drive(){
        this.fuel = this.fuel-this.fuelConsumption;
        System.out.println("car is driving");
    }
    public void Brake(){
        System.out.println("ich bremse");
    }

    public void TurboBoost() {
        if (this.tanksize > (tanksize/10)){
            System.out.println("superboost modus an");
        } else {
            System.out.println("nicht genug treibstoff");
        }
    }
    public void Honk(int reps){
        for (int i=0; i<reps;i++){
            System.out.println("hooooonk!!!");
        }
    }
    public void GetRemainingRange(){
        System.out.println(this.fuel/this.fuelConsumption +"km");
    }
}
