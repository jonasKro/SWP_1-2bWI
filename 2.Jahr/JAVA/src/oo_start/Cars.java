package oo_start;

public class Cars {
    private int fuelConsumption;
    private int tanksize;
    private int fuel;
    private String brand;
    private String serialNumber;
    private String color;

    public Cars(int fuelConsumption, int tanksize, int fuel){
        this.fuelConsumption = fuelConsumption;
        this.tanksize = tanksize;
        this.fuel = fuel;
    }
    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public int getTanksize() {
        return tanksize;
    }

    public void setTanksize(int tanksize) {
        this.tanksize = tanksize;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void Drive(){
        this.fuel = (this.fuel-this.fuelConsumption)/100*100;
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
        System.out.println(this.fuel/(this.fuelConsumption+1) +"km");
    }
}
