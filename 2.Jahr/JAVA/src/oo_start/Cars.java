package oo_start;

import java.util.List;

public class Cars {

    private Mirrors mirrors;
    private Motors motors;
    private int speed;
    private int fuelConsumption;
    private int tanksize;
    private int fuel;
    private String brand;
    private String serialNumber;
    private String color;

    public Cars(int tanksize, int fuel, int fuelConsumption){
        this.tanksize = tanksize;
        this.fuel = fuel;
        this.fuelConsumption = fuelConsumption;
        this.Mirrors = List<Mirrors>(mirrors);
    }
    public Motors getMotors() {
        return motors;
    }

    public void setMotors(Motors motors) {
        this.motors = motors;
    }
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
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
        this.fuel = this.fuel-((this.fuelConsumption/100)*getMotors().getSpeed());
        System.out.println("car is driving");
        System.out.println( "fuel is at:"+this.fuel);
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
            System.out.println("honkq   ");
        }
    }
    public void GetRemainingRange(){
        System.out.println(this.fuel/(this.fuelConsumption+1) +"km");
    }


}
