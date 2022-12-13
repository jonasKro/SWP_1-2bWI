package oo_start;

public class Wheels {
    private int diameter;
    private boolean winter;
    private int pressure;

    public Wheels(int diameter, boolean winter, int pressure) {
        this.diameter = diameter;
        this.winter = winter;
        this.pressure = pressure;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public boolean isWinter() {
        return winter;
    }

    public void setWinter(boolean winter) {
        this.winter = winter;
    }

    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }




}
